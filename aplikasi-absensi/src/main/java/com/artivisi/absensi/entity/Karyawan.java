package com.artivisi.absensi.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name="m_karyawan")
public class Karyawan {

	private static Integer jumlahKaryawan = 0;

	@Id @GeneratedValue
	private Integer id;

	@Column(nullable=false, unique=true)
	private String nip;

	@Column(nullable=false)
	private String nama;

	@Column(name="tanggal_lahir")
	private Date tanggalLahir;

	private List<Kehadiran> daftarKehadiran = new ArrayList<>();
	private List<KetidakHadiran> daftarKetidakHadiran = new ArrayList<>();


	// constructor
	public Karyawan(){ // default constructor
		System.out.println("Constructor tanpa argumen");
	}

	public Karyawan(String nip, String nama, Date tanggalLahir){
		this(); // memanggil constructor tanpa argumen
		System.out.println("Constructor dengan argumen");
		this.nip = nip;
		this.nama = nama;
		this.tanggalLahir = tanggalLahir;
	}

	// getter dan setter
	public static Integer getJumlahKaryawan(){
		return jumlahKaryawan;
	}

	public static void setJumlahKaryawan(Integer x){
		jumlahKaryawan = x;
	}

	public String getNip(){
		return nip;
	}

	public void setNip(String nip){
		this.nip = nip;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public Date getTanggalLahir(){
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir){
		this.tanggalLahir = tanggalLahir;
	}
}