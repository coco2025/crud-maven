package Interfaces;

import java.util.List;

import model.TblAuto;

public interface Iautoable {
	//declaramos los metodos...
	public void RegistrarAuto(TblAuto tblauto);
	public void ActualizarAuto(TblAuto tblauto);
	public void EliminarAuto(TblAuto tblauto);
	public List<TblAuto> ListadoAuto();
	public TblAuto BuscarAuto(TblAuto tblauto);
	

}   //fin de la interfacde...
