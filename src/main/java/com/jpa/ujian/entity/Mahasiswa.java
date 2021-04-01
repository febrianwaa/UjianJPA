package com.jpa.ujian.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_nim;
	
	private String nama_mahasiswa;
	private String jenis_kelamin;
	private String password;
	
	@ManyToMany (mappedBy = "lstmahasiswa")
	private List <PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();
}
