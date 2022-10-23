package spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.crud.entity.ChuyenBay;
import spring.crud.service.ChuyenBayService;




@RestController
@RequestMapping("/api")
public class ChuyenBayRestController {
	@Autowired
	private ChuyenBayService cbService;
	
	@GetMapping("/chuyenbays/{ga}")
	public List<ChuyenBay> findAllDLA(@PathVariable String ga) throws Exception{
		
		return cbService.findAllByGaDen(ga);
	}
	@GetMapping("/chuyenbays/sai-gon-ve-me-thuoc")
	public List<ChuyenBay> findSaiGonBuonMe() throws Exception{
		String sg = "SGN";
		String bmt = "BMV";
		List<ChuyenBay> ls = cbService.chuyenBaySaiGonMeThuoc(sg,bmt);
		System.out.println(ls);
		return ls;
	}
	@GetMapping("/chuyenbays/chuyen-bay-tu-sai-gon")
	public int chuyenBayTuSaiGon() throws Exception{
	
		int count = cbService.chuyenBayTuSaiGon();
		System.out.println(count);
		return count;
	}
	@GetMapping("/chuyenbays/chuyen-bay-cua-Airbus-A320")
	public List<ChuyenBay> chuyenBayCuaAirbusA320() throws Exception{
	
		List<ChuyenBay> ls = cbService.chuyenBayCuaAirbusA320();
		System.out.println(ls);
		return ls;
	}
}
