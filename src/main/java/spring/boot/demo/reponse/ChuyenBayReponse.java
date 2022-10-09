package spring.boot.demo.reponse;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.demo.model.ChuyenBay;

public interface ChuyenBayReponse extends JpaRepository<ChuyenBay, String> {

}
