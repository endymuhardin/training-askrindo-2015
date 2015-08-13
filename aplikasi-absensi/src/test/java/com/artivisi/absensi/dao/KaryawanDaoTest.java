package com.artivisi.absensi.dao;

import org.junit.Test;
import com.artivisi.absensi.entity.Karyawan;
import java.text.SimpleDateFormat;

public class KaryawanDaoTest {
	private KaryawanDao dao;

	@Test 
	public void testSimpan() throws Exception {
		Karyawan k = new Karyawan();
		k.setNip("9999");
		k.setNama("Karyawan Test 9999");

		SimpleDateFormat formatterTanggal = new SimpleDateFormat("yyyy-MM-dd");
		k.setTanggalLahir(formatterTanggal.parse("1945-08-17"));

		//dao.save(k);
	}

	@Test 
	public void testHitungSemua(){
		//Long jumlahDataKaryawan = dao.count();
		//System.out.println("Jumlah data = "+jumlahDataKaryawan);
	}
}