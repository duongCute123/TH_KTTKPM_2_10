package spring.boot.demo.reponse;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.demo.model.NhanVien;

public interface NhanVienReponse extends  JpaRepository<NhanVien, String> {

}
