package com.co.farmatech.metrofarm.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Notificaciones")
public class DtoNotificacion {
	
	private long notiEquiposNuevos,notiCalibracionesMes,notiCalibracionesVencidas,
			     notiMantenimientosEquiposMes,notiMantenimientosEquiposVencidos,
			     notiMantenimientosInstrumentosMes,notiMantenimientosInstrumentosVencidos,
			     notiCalificacionesMes,notiCalificacionesVencidos;

	public long getNotiEquiposNuevos() {
		return notiEquiposNuevos;
	}
	@XmlElement(name="NotiEquiposNuevos")
	public void setNotiEquiposNuevos(long notiEquiposNuevos) {
		this.notiEquiposNuevos = notiEquiposNuevos;
	}

	public long getNotiCalibracionesMes() {
		return notiCalibracionesMes;
	}
	@XmlElement(name="NotiCalibracionesMes")
	public void setNotiCalibracionesMes(long notiCalibracionesMes) {
		this.notiCalibracionesMes = notiCalibracionesMes;
	}

	public long getNotiCalibracionesVencidas() {
		return notiCalibracionesVencidas;
	}
	@XmlElement(name="NotiCalibracionesVencidas")
	public void setNotiCalibracionesVencidas(long notiCalibracionesVencidas) {
		this.notiCalibracionesVencidas = notiCalibracionesVencidas;
	}
	public long getNotiMantenimientosEquiposMes() {
		return notiMantenimientosEquiposMes;
	}
	@XmlElement(name="NotiMantenimientosEquiposMes")
	public void setNotiMantenimientosEquiposMes(long notiMantenimientosEquiposMes) {
		this.notiMantenimientosEquiposMes = notiMantenimientosEquiposMes;
	}
	
	public long getNotiMantenimientosEquiposVencidos() {
		return notiMantenimientosEquiposVencidos;
	}
	@XmlElement(name="NotiMantenimientosEquiposVencidos")
	public void setNotiMantenimientosEquiposVencidos(
			long notiMantenimientosEquiposVencidos) {
		this.notiMantenimientosEquiposVencidos = notiMantenimientosEquiposVencidos;
	}
	public long getNotiMantenimientosInstrumentosMes() {
		return notiMantenimientosInstrumentosMes;
	}
	@XmlElement(name="NotiMantenimientosInstrumentosMes")
	public void setNotiMantenimientosInstrumentosMes(
			long notiMantenimientosInstrumentosMes) {
		this.notiMantenimientosInstrumentosMes = notiMantenimientosInstrumentosMes;
	}
	public long getNotiMantenimientosInstrumentosVencidos() {
		return notiMantenimientosInstrumentosVencidos;
	}
	@XmlElement(name="NotiMantenimientosInstrumentosVencidos")
	public void setNotiMantenimientosInstrumentosVencidos(
			long notiMantenimientosInstrumentosVencidos) {
		this.notiMantenimientosInstrumentosVencidos = notiMantenimientosInstrumentosVencidos;
	}
	public long getNotiCalificacionesMes() {
		return notiCalificacionesMes;
	}
	@XmlElement(name="NotiCalificacionesMes")
	public void setNotiCalificacionesMes(long notiCalificacionesMes) {
		this.notiCalificacionesMes = notiCalificacionesMes;
	}
	public long getNotiCalificacionesVencidos() {
		return notiCalificacionesVencidos;
	}
	@XmlElement(name="NotiCalificacionesVencidos")
	public void setNotiCalificacionesVencidos(long notiCalificacionesVencidos) {
		this.notiCalificacionesVencidos = notiCalificacionesVencidos;
	}
	
	@Override
	public String toString() {
		return "DtoNotificacion [notiEquiposNuevos=" + notiEquiposNuevos + ", notiCalibracionesMes=" + notiCalibracionesMes + ", notiCalibracionesVencidas="
				+ notiCalibracionesVencidas +", notiMantenimientosEquiposMes=" + notiMantenimientosEquiposMes + ", notiMantenimientosEquiposVencidos=" + notiMantenimientosEquiposVencidos + ", notiMantenimientosInstrumentosMes="
				+ notiMantenimientosInstrumentosMes + ", notiMantenimientosInstrumentosVencidos=" + notiMantenimientosInstrumentosVencidos + ", notiCalificacionesMes="+ notiCalificacionesMes +", notiCalificacionesVencidos=" 
				+ notiCalificacionesVencidos  +"]";
	}
	

}