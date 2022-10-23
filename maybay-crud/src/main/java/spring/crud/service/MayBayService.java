package spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.crud.entity.MayBay;


@Service
public interface MayBayService {
	public List<MayBay> findMayBayLon(int tambay);
	public int countLoaiBoeing();
	public List<MayBay> findMayBayByCB(String maCB);
	public List<Object> findMayBayDuocLai();
}
