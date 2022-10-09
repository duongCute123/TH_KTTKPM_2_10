package spring.boot.demo.reponse;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.demo.model.MayBay;

public interface MayBayReponse extends JpaRepository<MayBay, Integer> {

}
