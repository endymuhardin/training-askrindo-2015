drop table if exists m_karyawan;
create table m_karyawan (
	id VARCHAR(36) PRIMARY KEY,
	nip VARCHAR(15) NOT NULL, 
	nama VARCHAR(50) NOT NULL,
	tanggal_lahir DATE,
	UNIQUE (nip)
) Engine=InnoDB ;