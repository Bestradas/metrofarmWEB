package co.com.farmatech.metrofarm.bimanager.user;

import java.sql.Connection;
import java.util.ArrayList;

import co.com.farmatech.metrofarm.datasource.DataSourceConnector;

import com.co.farmatech.metrofarm.dto.DtoUsuario;
import com.co.farmatech.metrofarm.dto.PageData;

public interface MgrUsuarioService {
	
	/**
	 * 
	 * @param usuario
	 * @param con
	 * @return Usuarios
	 */
	public DtoUsuario authenticateUser(DtoUsuario usuario,DataSourceConnector source);
	
	/**
	 * 
	 * @param usuario
	 * @param source
	 * @return
	 */
	public DtoUsuario userByDocument(DtoUsuario usuario,DataSourceConnector source);
	
	/**
	 * 
	 * @param usuario
	 * @param source
	 * @return
	 */
	public ArrayList<DtoUsuario> findUsers(DtoUsuario usuario,DataSourceConnector source,PageData pageData);
	
	/**
	 * 
	 * @param usuario
	 * @param source
	 * @return
	 */
	public DtoUsuario createUser(DtoUsuario usuario,DataSourceConnector source);
	
	/**
	 * 
	 * @param usuario
	 * @param source
	 * @return
	 */
	public DtoUsuario updateUser(DtoUsuario usuario,DataSourceConnector source);
	

}
