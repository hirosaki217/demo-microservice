package spring.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
import spring.crud.entity.ChungNhan;
import spring.crud.repository.ChungNhanRepository;
@Service
@Transactional
public class ChungNhanServiceImpl implements ChungNhanService {
	@Autowired
	private ChungNhanRepository chungNhanRepository;
//	@Autowired
//	public ChungNhanServiceImpl(ChungNhanRepository rp) {
//		chungNhanRepository = rp;
//	}
	


	@Override
	public List<String> maMBVoiNVHoNguyen(String name) {
		
		return chungNhanRepository.maMBVoiNVHoNguyen("Nguyễn");
	}

	@Override
	public List<ChungNhan> findAll() {
		return chungNhanRepository.findAll();
	}
	

}
