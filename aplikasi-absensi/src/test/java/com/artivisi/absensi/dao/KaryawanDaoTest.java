package com.artivisi.absensi.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import com.artivisi.absensi.entity.Karyawan;
import com.artivisi.absensi.Konfigurasi;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Konfigurasi.class)
public class KaryawanDaoTest {
	@Autowired private KaryawanDao dao;
	@Autowired private DataSource ds;

	@Before
	public void setupData() throws Exception {
		System.out.println("====== @Before ========");

		String sql = "insert into m_karyawan (nip, nama)";
		sql += "values(?,?)";

		Connection c = ds.getConnection();
		PreparedStatement ps = c.prepareStatement(sql);

		ps.setString(1, "100");
		ps.setString(2, "Karyawan 100");
		ps.executeUpdate();

		c.close();
	}
	
	@After
	public void bersihkanData() throws Exception {
		System.out.println("====== @After ========");
		String sql = "delete from m_karyawan where nip in ('9999', '100')";

		Connection c = ds.getConnection();
		Statement s = c.createStatement();
		s.executeUpdate(sql);
		c.close();
	}

	@Test
	public void testSimpan() throws Exception {
		System.out.println("Test simpan");
		Karyawan k = new Karyawan();
		k.setNip("9999");
		k.setNama("Karyawan Test 9999");

		SimpleDateFormat formatterTanggal = new SimpleDateFormat("yyyy-MM-dd");
		k.setTanggalLahir(formatterTanggal.parse("1945-08-17"));

		Long sebelumSimpan = dao.count();
		dao.save(k);
		Long setelahSimpan = dao.count();

		Assert.assertEquals("Harusnya record bertambah satu", 
			new Long((sebelumSimpan + 1)), new Long(setelahSimpan));
	}

	@Test 
	public void testHitungSemua(){
		System.out.println("Test hitung semua");
		Long jumlahDataKaryawan = dao.count();
		Assert.assertTrue("Jumlah data harusnya dua, tapi ternyata "
			+jumlahDataKaryawan, jumlahDataKaryawan == 3);
	}

	@Test
	public void cariNip100(){
		Karyawan k100 = dao.findByNip("100");
		Assert.assertNotNull("Harusnya ada data karyawan yang NIP = 100", k100);

		Karyawan k101 = dao.findByNip("101");
		Assert.assertNull("Harusnya tidak ada data karyawan yang NIP = 100", k101);
	}
}