package spring.boot.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	int MaMB;
	@Column
	String Loai;
	@Column
	int TamBay;

	public int getMaMB() {
		return MaMB;
	}

	public void setMaMB(int maMB) {
		MaMB = maMB;
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	}

	public int getTamBay() {
		return TamBay;
	}

	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}

	public MayBay(int maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}

	public MayBay() {
		super();
	}

	@Override
	public String toString() {
		return "maybay [MaMB=" + MaMB + ", Loai=" + Loai + ", TamBay=" + TamBay + "]";
	}

}
