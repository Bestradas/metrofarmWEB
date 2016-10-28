package co.com.farmatech.metrofarm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.jankins.psf.common.exception.JankinsMarshallException;

import com.co.farmatech.metrofarm.dto.DtoCalibracion;
import com.co.farmatech.metrofarm.dto.DtoEquipo;
import com.co.farmatech.metrofarm.dto.DtoMantenimiento;
import com.co.farmatech.metrofarm.dto.DtoUsuario;

public class MaintenanceMapper {
	
	public ArrayList<DtoMantenimiento> findMaintenance(ResultSet resultSet){
		ArrayList<DtoMantenimiento> maintenanceList=new ArrayList<DtoMantenimiento>();
		try {
			while(resultSet.next()){
				//Mantenimientos

				DtoMantenimiento maintenance = new DtoMantenimiento();
				maintenance.setNumFom(resultSet.getString("idMantenimiento"));
				maintenance.setTipoMant(resultSet.getLong("tipoMantenimiento"));
				maintenance.setResponsable(resultSet.getString("responsable"));
				maintenance.setRecibido(resultSet.getString("recibido"));
				maintenance.setAnomalias(resultSet.getString("anomalias"));
				maintenance.setLabores(resultSet.getString("labores"));
				maintenance.setObservaciones(resultSet.getString("observacionesMantenimiento"));
				maintenance.setProovedores(resultSet.getString("proveedores"));
				maintenance.setFechaRegistro(resultSet.getTimestamp("fechaRegistr"));
				maintenance.setFechaProximo(resultSet.getTimestamp("proximoMantenimiento"));
				maintenance.setPrecio(resultSet.getBigDecimal("precioMantenimiento"));
				maintenance.setFechaEjecutado(resultSet.getTimestamp("fechaEjecutada"));
				maintenance.setCumplio(resultSet.getLong("ejecutadaProxima"));
						
				//Equipo
				DtoEquipo equipo = new DtoEquipo();
				equipo.setCodigoInv(resultSet.getString("codigoInventario"));
				equipo.setCodigoMet(resultSet.getString("codigoMetrologia"));
				equipo.setSerie(resultSet.getString("numeroSerie"));
				equipo.setNombre(resultSet.getString("nombreEquipo"));
				equipo.setMarca(resultSet.getString("marca"));
				equipo.setModelo(resultSet.getString("modelo"));
				equipo.setUbicacion(resultSet.getString("ubicacion"));
				equipo.setFecha(resultSet.getTimestamp("fechaRegistroEquipo"));
				equipo.setCliente(resultSet.getString("clienteRegistro"));
				equipo.setTipo(resultSet.getLong("idTipoEquipo"));
				equipo.setFrecMantenimiento(resultSet.getLong("frecuenciaMantenimiento"));
				equipo.setFrecCalibracion(resultSet.getLong("frecuenciaCalibacion"));
				equipo.setFrecCalifOPerativa(resultSet.getLong("frecuenciaCalifiOperativa"));
				equipo.setFrecCalifDesempenio(resultSet.getLong("frecuenciaCalifiDesempeno"));
				equipo.setExtencion(resultSet.getString("extencionFoto"));
				equipo.setEstado(resultSet.getLong("estado"));
				equipo.setObservaciones(resultSet.getString("observacionesEquipo"));
				equipo.setFoto(resultSet.getBytes("fotoEquipo"));
				maintenance.setEquipo(equipo);
				
				//Usuario
				DtoUsuario registrado=new DtoUsuario();
				registrado.setCodigo(resultSet.getString("registrado"));
				registrado.setNombres(resultSet.getString("nombresUsuario"));
				registrado.setApellidos(resultSet.getString("apellidosUsuario"));
				maintenance.setRegistrado(registrado);
				
				maintenanceList.add(maintenance);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new JankinsMarshallException("Ocurrio un error mapeando el resultado de findCalibrations",e);
		}
		
		return maintenanceList;
	}

}
