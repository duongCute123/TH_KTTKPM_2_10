package spring.boot.demo.service;

import java.util.List;

import spring.boot.demo.model.ChuyenBay;

public interface ChuyenBayService {
	List<ChuyenBay> getListChuyenBay();
	List<ChuyenBay> getListChuyenBayDAND(String den);
	List<ChuyenBay> getListchuyenBaySGBMThuot(String ptu,String pden);
	List<ChuyenBay> getListChuyenBayTuSG(String tuSG);
	List<ChuyenBay> getThoiGianChuyenBay(String gioden);
}
