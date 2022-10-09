//package spring.boot.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import spring.boot.demo.model.NhanVien;
//import spring.boot.demo.service.NhanVienService;
//
//@RestController
//@RequestMapping("/api/v1")
//public class NhanVienController {
//	NhanVienService nhanVienService;
//	@Autowired
//	public NhanVienController(NhanVienService theNhanVienService) {
//		nhanVienService=theNhanVienService;
//	}
//	@GetMapping("/getlist")
//	public List<NhanVien> getlistNhanvien() {
//		return nhanVienService.getListNhanVien();
//	}
////	@GetMapping("/getLuong")
////	public List<NhanVien> getLuongNho(int luong) {
////		return nhanVienService.getListLuong(10000);
////	}
//}
