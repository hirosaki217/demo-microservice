package spring.login.app.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.login.app.auth.UserPrincipal;
import spring.login.app.entity.Permission;
import spring.login.app.entity.Role;
import spring.login.app.entity.Token;
import spring.login.app.entity.User;
import spring.login.app.service.TokenService;
import spring.login.app.service.UserService;
import spring.login.app.utils.JwtUtil;

@RestController
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private TokenService tokenService;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
//		tạo role mặc định là user read
		Set<Role> role = new HashSet<>();
		Set<Permission> permission = new HashSet<>();

		Permission per = new Permission();
		per.setId(2L);
		permission.add(per);

		Role role1 = new Role();
		role1.setId(2L);
		role1.setPermissions(permission);
		role.add(role1);
		user.setRoles(role);

		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

		return userService.createUser(user);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {

		UserPrincipal userPrincipal = userService.findByUsername(user.getUsername());

		if (null == user || !new BCryptPasswordEncoder().matches(user.getPassword(), userPrincipal.getPassword())) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Account or password is not valid!");
		}

		Token token = new Token();
		token.setToken(jwtUtil.generateToken(userPrincipal));

		token.setTokenExpDate(jwtUtil.generateExpirationDate());
		token.setCreatedBy(userPrincipal.getUserId());
		tokenService.createToken(token);

		return ResponseEntity.ok(token.getToken());
	}

	@GetMapping("/hello")
	@PreAuthorize("hasAnyAuthority('USER_READ')")
	public ResponseEntity hello() {
		return ResponseEntity.ok("hello");
	}

//    Object principal = SecurityContextHolder
//            .getContext().getAuthentication().getPrincipal();
//
//        if (principal instanceof UserDetails) {
//        UserPrincipal userPrincipal = (UserPrincipal) principal;
//    }

}
