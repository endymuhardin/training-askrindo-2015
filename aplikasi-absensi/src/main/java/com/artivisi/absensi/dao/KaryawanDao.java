package com.artivisi.absensi.dao;

import com.artivisi.absensi.entity.Karyawan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KaryawanDao extends CrudRepository<Karyawan, Integer>{
	public Karyawan findByNip(String nip);
	public List<Karyawan> findByNamaOrderByNipAsc(String nama);
}