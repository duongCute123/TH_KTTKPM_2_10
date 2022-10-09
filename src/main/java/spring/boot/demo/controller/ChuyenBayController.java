package spring.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.demo.model.ChuyenBay;
import spring.boot.demo.service.ChuyenBayService;

@RestController
@RequestMapping("/api/v1")
public class ChuyenBayController {
	ChuyenBayService chuyenBayService;
	@Autowired
	public ChuyenBayController(ChuyenBayService theChuyenBayService) {
		chuyenBayService=theChuyenBayService;
	}
	@GetMapping("/getList")
	public List<ChuyenBay> getListChuyenBay() {
		return chuyenBayService.getListChuyenBay();
	}
	@GetMapping("/hello")
	public ResponseEntity getHome() {
		return ResponseEntity.ok("Helo cac ban nha");
	}
}
