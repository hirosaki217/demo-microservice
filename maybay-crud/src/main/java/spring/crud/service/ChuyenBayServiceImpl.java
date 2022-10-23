package spring.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.crud.entity.ChuyenBay;
import spring.crud.repository.ChuyenBayRepository;

@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	@Override
	public List<ChuyenBay> findAllByGaDen(String gaDen) {
		
		return chuyenBayRepository.findAllByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBaySaiGonMeThuoc(from, to);
	}

	@Override
	public int chuyenBayTuSaiGon() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBayTuSaiGon();
	}

	@Override
	public List<ChuyenBay> chuyenBayCuaAirbusA320() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBayCuaAirbusA320();
	}

}
