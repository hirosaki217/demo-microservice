package spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.crud.entity.MayBay;
import spring.crud.service.MayBayService;

@RestController
@RequestMapping("/api")
public class MayBayRestController {
	@Autowired
	private MayBayService mbService;
	@PreAuthorize("hasAnyAuthority('USER_READ')")
	@GetMapping("/maybays/may-bay-co-tam-bay-lon-hon-10000")
	public List<MayBay> findMayBayLon(){
		int tamBay = 10000;
		return mbService.findMayBayLon(tamBay);
	}
}
