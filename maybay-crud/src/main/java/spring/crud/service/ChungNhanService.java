package spring.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
import spring.crud.entity.ChungNhan;

@Service
public interface ChungNhanService {
	List<String> maMBVoiNVHoNguyen(String name);

	List<ChungNhan> findAll();
}
