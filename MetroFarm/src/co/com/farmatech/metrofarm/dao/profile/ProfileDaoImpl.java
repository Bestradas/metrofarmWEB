package co.com.farmatech.metrofarm.dao.profile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import co.com.farmatech.metrofarm.datasource.DataSourceConnector;
import co.com.farmatech.metrofarm.mapper.ProfileMapper;
import co.com.farmatech.metrofarm.properties.AccessMetroFarmProperties;
import co.jankins.psf.common.exception.JankinsMarshallException;
import co.jankins.psf.common.global.GlobalUtils;

import com.co.farmatech.metrofarm.dto.DtoPerfil;
import com.co.farmatech.metrofarm.dto.DtoUsuario;
import com.co.farmatech.metrofarm.dto.PageData;

public class ProfileDaoImpl implements ProfileDaoService{

	private Properties sqlProperties = AccessMetroFarmProperties.getInstance().getSQLProperties();
	ProfileMapper profileMapper=new ProfileMapper();
	
	@Override
	public DtoPerfil getProfileByUser(DtoUsuario usuario,Connection con) {
		// TODO Auto-generated method stub
		DtoPerfil perfil=null;
		ResultSet r;
		
        PreparedStatement p = null;
		try {
			p = con.prepareStatement(sqlProperties.getProperty("users.profilebyuser"));
	        p.setLong(1, usuario.getIdPerfil());
	        r = p.executeQuery();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new JankinsMarshallException("Ocurrio un error realizando el rollback",e);
			}
			throw new JankinsMarshallException();
		}finally{
			try {
				p.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new JankinsMarshallException("Ocurrio un error cerrando la conexion",e);
			}
		}
		perfil=profileMapper.getProfileByUserMapper(r);
		
		return perfil;

	}
	

	@Override
	public DtoPerfil createProfile(DtoPerfil perfil, Connection con) {
		// TODO Auto-generated method stub
		ResultSet r;
		PreparedStatement p = null;
		try {
			p = con.prepareStatement(sqlProperties.getProperty("profile.createProfile"));
			p.setString(1,perfil.getPerfil());
			p.setLong(2,perfil.getEstado());
			p.setBoolean(3, perfil.isGuardarUsuariao());
			p.setBoolean(4, perfil.isBuscarUsuario());
			p.setBoolean(5, perfil.isModificarUsuario());
			p.setBoolean(6, perfil.isEliminarUsuario());
			p.setBoolean(7, perfil.isGuardarPerfil());
			p.setBoolean(8, perfil.isBuscarPerfil());
			p.setBoolean(9, perfil.isModificarPerfil());
			p.setBoolean(10, perfil.isEliminarPerfil());
			p.setBoolean(11, perfil.isGuardarEquipo());
			p.setBoolean(12, perfil.isBuscarEquipo());
			p.setBoolean(13, perfil.isModificarEquipo());
			p.setBoolean(14, perfil.isEliminarEquipo());
			p.setBoolean(15, perfil.isNotificaEquipos());
			p.setBoolean(16, perfil.isGuardarMantenimiento());
			p.setBoolean(17, perfil.isBuscarMantenimiento());
			p.setBoolean(18, perfil.isModificarMantenimiento());
			p.setBoolean(19, perfil.isEliminarMantenimiento());
			p.setBoolean(20, perfil.isNotificaciones_mant_mes());
			p.setBoolean(21, perfil.isNotificaciones_man_ven_mes());
			p.setBoolean(22, perfil.isGuardarCalificacion());
			p.setBoolean(23, perfil.isBuscarCalificacion());
			p.setBoolean(24, perfil.isModificarCalificacion());
			p.setBoolean(25, perfil.isEliminarCalificacion());
			p.setBoolean(26, perfil.isNotificaciones_calif_mes());
			p.setBoolean(27, perfil.isNotificaciones_calif_ven_mes());
			p.setBoolean(28, perfil.isGuardarCalibracion());
			p.setBoolean(29, perfil.isBuscarCalibracion());
			p.setBoolean(30, perfil.isModificarCalibracion());
			p.setBoolean(31, perfil.isEliminarCalibracion());
			p.setBoolean(32, perfil.isNotificaciones_calib_mes());
			p.setBoolean(33, perfil.isNotificaciones_calib_ven());
			p.setBoolean(34, perfil.isGuardarMantGen());
			p.setBoolean(35, perfil.isBuscarMantGen());
			p.setBoolean(36, perfil.isModificarMantGen());
			p.setBoolean(37, perfil.isEliminarMantGen());
			p.setBoolean(38, perfil.isNotificacionesMantgenmes());
			p.setBoolean(39, perfil.isNotificacionesMantgenvenc());
			int rowsAfect = p.executeUpdate();
			if(rowsAfect>0){
				return perfil;
			}else {
				throw new JankinsMarshallException("No se pudo crear el nuevo perfil");
			}
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new JankinsMarshallException("Ocurrio un error realizando el rollback",e);
			}
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public DtoPerfil updateProfile(DtoPerfil perfil, Connection con) {
		// TODO Auto-generated method stub
		ResultSet r;
		PreparedStatement p = null;
		try {
			p = con.prepareStatement(sqlProperties.getProperty("profile.updateProfile"));
			p.setString(1,perfil.getPerfil());
			p.setLong(2,perfil.getEstado());
			p.setBoolean(3, perfil.isGuardarUsuariao());
			p.setBoolean(4, perfil.isBuscarUsuario());
			p.setBoolean(5, perfil.isModificarUsuario());
			p.setBoolean(6, perfil.isEliminarUsuario());
			p.setBoolean(7, perfil.isGuardarPerfil());
			p.setBoolean(8, perfil.isBuscarPerfil());
			p.setBoolean(9, perfil.isModificarPerfil());
			p.setBoolean(10, perfil.isEliminarPerfil());
			p.setBoolean(11, perfil.isGuardarEquipo());
			p.setBoolean(12, perfil.isBuscarEquipo());
			p.setBoolean(13, perfil.isModificarEquipo());
			p.setBoolean(14, perfil.isEliminarEquipo());
			p.setBoolean(15, perfil.isNotificaEquipos());
			p.setBoolean(16, perfil.isGuardarMantenimiento());
			p.setBoolean(17, perfil.isBuscarMantenimiento());
			p.setBoolean(18, perfil.isModificarMantenimiento());
			p.setBoolean(19, perfil.isEliminarMantenimiento());
			p.setBoolean(20, perfil.isNotificaciones_mant_mes());
			p.setBoolean(21, perfil.isNotificaciones_man_ven_mes());
			p.setBoolean(22, perfil.isGuardarCalificacion());
			p.setBoolean(23, perfil.isBuscarCalificacion());
			p.setBoolean(24, perfil.isModificarCalificacion());
			p.setBoolean(25, perfil.isEliminarCalificacion());
			p.setBoolean(26, perfil.isNotificaciones_calif_mes());
			p.setBoolean(27, perfil.isNotificaciones_calif_ven_mes());
			p.setBoolean(28, perfil.isGuardarCalibracion());
			p.setBoolean(29, perfil.isBuscarCalibracion());
			p.setBoolean(30, perfil.isModificarCalibracion());
			p.setBoolean(31, perfil.isEliminarCalibracion());
			p.setBoolean(32, perfil.isNotificaciones_calib_mes());
			p.setBoolean(33, perfil.isNotificaciones_calib_ven());
			p.setBoolean(34, perfil.isGuardarMantGen());
			p.setBoolean(35, perfil.isBuscarMantGen());
			p.setBoolean(36, perfil.isModificarMantGen());
			p.setBoolean(37, perfil.isEliminarMantGen());
			p.setBoolean(38, perfil.isNotificacionesMantgenmes());
			p.setBoolean(39, perfil.isNotificacionesMantgenvenc());
			p.setLong(40, perfil.getCodperfil());
			int rowsAfect = p.executeUpdate();
			if(rowsAfect>0){
				return perfil;
			}else {
				throw new JankinsMarshallException("No se pudo actualizar el nuevo perfil");
			}
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new JankinsMarshallException("Ocurrio un error realizando el rollback",e);
			}
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public ArrayList<DtoPerfil> findProfiles(DtoPerfil perfil, Connection con,PageData pageData) {
		// TODO Auto-generated method stub
		ArrayList<DtoPerfil> profiles=new ArrayList<DtoPerfil>();
		ResultSet r=null;
		PreparedStatement p = null;
		List<Object> params=new ArrayList<Object>();
		String sqlQuery=sqlProperties.getProperty("profile.findProfiles");
		String q=sqlProperties.getProperty("profile.findProfilesCount");
		String alternativeQuery="";
		if(perfil!=null && perfil.getPerfil()!=null){
			alternativeQuery+="AND UPPER(nombrePerfil) LIKE UPPER('%"+perfil.getPerfil()+"%')";
		}
		sqlQuery+=alternativeQuery;
		q+=alternativeQuery;
		try {
			if(pageData!=null){
				sqlQuery=GlobalUtils.getCountQuery(pageData, con,params,sqlProperties.getProperty("pagination.start"),sqlProperties.getProperty("pagination.end"),q,sqlQuery);
			}
			Connection connection=DataSourceConnector.getInstance().getConexion();	
			p = connection.prepareStatement(sqlQuery);
			for (int i = 0; i < params.size(); i++) {
				if(params.get(i) instanceof Integer){
					p.setInt(i+1,(Integer)params.get(i));
				}else{
					p.setString(i+1,(String)params.get(i));
				}
			}
			r = p.executeQuery();
			profiles=profileMapper.findProfiles(r);
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new JankinsMarshallException("Ocurrio un error realizando el rollback",e);
			}
			throw new JankinsMarshallException(e);
		}finally{
			try {
				p.close();
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return profiles;
	}

}
