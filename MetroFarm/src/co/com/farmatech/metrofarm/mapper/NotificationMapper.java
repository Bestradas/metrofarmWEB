package co.com.farmatech.metrofarm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.jankins.psf.common.exception.JankinsMarshallException;

import com.co.farmatech.metrofarm.dto.DtoCalibracion;
import com.co.farmatech.metrofarm.dto.DtoEquipo;
import com.co.farmatech.metrofarm.dto.DtoNotificacion;

public class NotificationMapper {
	
	public DtoNotificacion getNotifications(ResultSet resultSet){
		DtoNotificacion notification=null;
		try {
			if(resultSet.next()){
				//Equipos
				notification = new DtoNotificacion();
				notification.setNotiEquiposNuevos(resultSet.getLong("EquiposNuevos"));
				notification.setNotiCalibracionesMes(resultSet.getLong("CalibracionesMes"));
				notification.setNotiCalibracionesVencidas(resultSet.getLong("CalibracionesVencidas"));
				notification.setNotiMantenimientosInstrumentosMes(resultSet.getLong("MantInstrumentosMes"));
				notification.setNotiMantenimientosInstrumentosVencidos(resultSet.getLong("MantInstrumentosVencidas"));
				notification.setNotiMantenimientosEquiposMes(resultSet.getLong("MantEquiposMes"));
				notification.setNotiMantenimientosEquiposVencidos(resultSet.getLong("MantEquiposVencidas"));				
				notification.setNotiCalificacionesMes(resultSet.getLong("CalificacionesMes"));
				notification.setNotiCalificacionesVencidos(resultSet.getLong("CalificacionesVencidas"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new JankinsMarshallException("Ocurrio un error mapeando el resultado de findCalibrations",e);
		}
		
		return notification;
	}

}
