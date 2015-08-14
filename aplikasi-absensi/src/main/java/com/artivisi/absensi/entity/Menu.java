package com.artivisi.absensi.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.OneToMany;
import static javax.persistence.TemporalType.*;

@Entity
@Table(name="m_menu")
public class Menu {
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;

	@Column(unique=true)
	private String label;
	private String keterangan;
}