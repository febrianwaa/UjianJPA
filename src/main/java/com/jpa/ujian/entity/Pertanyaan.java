package com.jpa.ujian.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pertanyaan")
public class Pertanyaan {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_pertanyaan;
	
	@Column (name = "pertanyaan")
	private String pertanyaan;
	@Column (name = "jawaban_1")
	private String jawaban_1;
	@Column (name = "jawaban_2")
	private String jawaban_2;
	@Column (name = "jawaban_3")
	private String jawaban_3;
	@Column (name = "jawaban_4")
	private String jawaban_4;
	@Column (name = "jawaban_benar")
	private String jawaban_benar;
	@Column (name = "jawaban_gambar")
	private String status_gambar;
	
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "detail_nilai")
	private Nilai nilai;
	
	
}
