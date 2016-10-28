package co.com.farmatech.metrofarm.dao.profile;

import java.sql.Connection;
import java.util.ArrayList;

import com.co.farmatech.metrofarm.dto.DtoPerfil;
import com.co.farmatech.metrofarm.dto.DtoUsuario;
import com.co.farmatech.metrofarm.dto.PageData;

public interface ProfileDaoService {
	
	/**
	 * 
	 * @param user
	 * @param con
	 * @return
	 */
	public DtoPerfil getProfileByUser(DtoUsuario user,Connection con);
	
	/**
	 * 
	 * @param perfil
	 * @param con
	 * @return
	 */
	public DtoPerfil createProfile(DtoPerfil perfil,Connection con);
	
	/**
	 * 
	 * @param perfil
	 * @param con
	 * @return
	 */
	public DtoPerfil updateProfile(DtoPerfil perfil,Connection con);
	
	/**
	 * 
	 * @param perfil
	 * @param con
	 * @return
	 */
	public ArrayList<DtoPerfil> findProfiles(DtoPerfil perfil,Connection con,PageData pageData);

}
