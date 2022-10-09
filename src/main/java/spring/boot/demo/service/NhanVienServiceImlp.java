//package spring.boot.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import spring.boot.demo.model.NhanVien;
//import spring.boot.demo.reponse.NhanVienReponse;
//
//public class NhanVienServiceImlp implements NhanVienService {
//	NhanVienReponse nhanVienReponse;
//	@Autowired
//	public NhanVienServiceImlp(NhanVienReponse theNhanVienReponse) {
//		nhanVienReponse=theNhanVienReponse;
//	}
//
//	@Override
//	public List<NhanVien> getListLuong(int luong) {
//		
//		return null;
//	}
//
//
//	@Override
//	public List<NhanVien> getListNhanVien() {
//		return nhanVienReponse.findAll();
//	}
//
//	@Override
//	public void TotalLuong(int total) {
//		
//		
//	}
//
//}
