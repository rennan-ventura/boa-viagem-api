package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.boa_viagem.enums.TipoViagemEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_VIAGEM")
public class Viagem {

	@Id
	@Column(name = "ID_VIAGEM")
	private Long id;
	
	@Column(name = "TX_DESTINO")
	private String destino;
	
	@Column(name = "TP_VIAGEM")
	@Enumerated(EnumType.STRING)
	private TipoViagemEnum viagem;
	
	@Column(name = "DT_CHEGADA")
	private LocalDate chegada;
	
	@Column(name = "DT_SAIDA")
	private LocalDate saida;
	
	@Column(name = "VLR_ORCAMENTO")
	private double orcamento;
	
	@Column(name = "QTD_PESSOAS")
	private int pessoas;
	
}
