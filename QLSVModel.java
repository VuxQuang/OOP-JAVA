package Model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<SinhVien> dsSinhVien;
	// tao mot constructor rong 
	public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = new ArrayList<SinhVien>();
}
	public void QLSVModel(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}
	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	public void insert(SinhVien Sinhvien) {
		this.dsSinhVien.add(Sinhvien);
	}
	public void delete(SinhVien Sinhvien) {
		this.dsSinhVien.remove(Sinhvien);
	}
	public void update(SinhVien Sinhvien) {
		this.dsSinhVien.remove(Sinhvien);
		this.dsSinhVien.add(Sinhvien);
	}
	
}

