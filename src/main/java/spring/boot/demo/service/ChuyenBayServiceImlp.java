package spring.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.demo.model.ChuyenBay;
import spring.boot.demo.reponse.ChuyenBayReponse;

@Service
public class ChuyenBayServiceImlp implements ChuyenBayService {
	ChuyenBayReponse chuyenBayReponse;
	@Autowired
	public ChuyenBayServiceImlp(ChuyenBayReponse theChuyenBayReponse) {
		chuyenBayReponse=theChuyenBayReponse;
	}
	@Override
	public List<ChuyenBay> getListChuyenBay() {
		
		return chuyenBayReponse.findAll();
	}
	@Override
	public List<ChuyenBay> getListChuyenBayDAND(String den) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ChuyenBay> getListchuyenBaySGBMThuot(String ptu, String pden) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ChuyenBay> getListChuyenBayTuSG(String tuSG) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ChuyenBay> getThoiGianChuyenBay(String gioden) {
		// TODO Auto-generated method stub
		return null;
	}

}
