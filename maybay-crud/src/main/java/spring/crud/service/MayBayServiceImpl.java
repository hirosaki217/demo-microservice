package spring.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.crud.entity.MayBay;
import spring.crud.repository.MayBayRepository;

@Service
@Transactional
public class MayBayServiceImpl implements MayBayService {
	@Autowired
	private MayBayRepository mbBayRepository;
	@Override
	public List<MayBay> findMayBayLon(int tambay) {
		// TODO Auto-generated method stub
		return mbBayRepository.findMayBayLon(tambay);
	}

	@Override
	public int countLoaiBoeing() {
		// TODO Auto-generated method stub
		return mbBayRepository.countLoaiBoeing();
	}

	@Override
	public List<MayBay> findMayBayByCB(String maCB) {
		// TODO Auto-generated method stub
		return mbBayRepository.findMayBayByCB(maCB);
	}

	@Override
	public List<Object> findMayBayDuocLai() {
		// TODO Auto-generated method stub
		return mbBayRepository.findMayBayDuocLai();
	}

}
