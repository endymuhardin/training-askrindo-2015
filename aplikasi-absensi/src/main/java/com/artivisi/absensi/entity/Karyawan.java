package com.artivisi.absensi.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Karyawan {

	private static Integer jumlahKaryawan = 0;

	private String nip;
	private String nama;
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