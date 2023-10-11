package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_tb2 database table.
 * 
 */
@Entity
@Table(name="tbl_tb2")
@NamedQuery(name="TblTb2.findAll", query="SELECT t FROM TblTb2 t")
public class TblTb2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtb2;

	private String nomtb2;

	public TblTb2() {
	}

	public int getIdtb2() {
		return this.idtb2;
	}

	public void setIdtb2(int idtb2) {
		this.idtb2 = idtb2;
	}

	public String getNomtb2() {
		return this.nomtb2;
	}

	public void setNomtb2(String nomtb2) {
		this.nomtb2 = nomtb2;
	}

}