package com.artivisi.absensi.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import static javax.persistence.TemporalType.*;

@Entity 
@Table(name="t_kehadiran")
public class Kehadiran {

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;

	
	@ManyToOne
	@JoinColumn(name="id_karyawan")
	private Karyawan karyawan;
	

	@Temporal(DATE)
	private Date datang;
	@Temporal(DATE)
	private Date pulang;

}