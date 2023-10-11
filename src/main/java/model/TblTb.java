package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_tb database table.
 * 
 */
@Entity
@Table(name="tbl_tb")
@NamedQuery(name="TblTb.findAll", query="SELECT t FROM TblTb t")
public class TblTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtb;

	private String nomtb;

	public TblTb() {
	}

	public int getIdtb() {
		return this.idtb;
	}

	public void setIdtb(int idtb) {
		this.idtb = idtb;
	}

	public String getNomtb() {
		return this.nomtb;
	}

	public void setNomtb(String nomtb) {
		this.nomtb = nomtb;
	}

}