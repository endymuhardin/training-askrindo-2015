package com.artivisi.absensi.entity;

import java.util.Date;

public class KetidakHadiran {
	
	private Karyawan karyawan;
	private Date tanggal;
	private String keterangan;
	private String alasan;
	private JenisKetidakHadiran jenisKetidakHadiran;

	public Karyawan getKaryawan(){
		return karyawan;
	}

	public void setKaryawan(Karyawan x){
		this.karyawan = x;
	}

	public Date getTanggal(){
		return tanggal;
	}

	public void setTanggal(Date x){
		this.tanggal = x;
	}

	public String getAlasan(){
		return alasan;
	}

	public void setAlasan(String x){
		this.alasan = x;
	}

	public JenisKetidakHadiran getJenisKetidakHadiran(){
		return jenisKetidakHadiran;
	}

	public void setJenisKetidakHadiran(JenisKetidakHadiran x){
		this.jenisKetidakHadiran = x;
	}

}