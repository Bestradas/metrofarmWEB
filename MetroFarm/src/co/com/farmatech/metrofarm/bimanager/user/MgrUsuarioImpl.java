package co.com.farmatech.metrofarm.bimanager.user;

import java.util.ArrayList;

import co.com.farmatech.metrofarm.dao.profile.ProfileDaoImpl;
import co.com.farmatech.metrofarm.dao.profile.ProfileDaoService;
import co.com.farmatech.metrofarm.dao.user.UserDaoImpl;
import co.com.farmatech.metrofarm.dao.user.UserDaoService;
import co.com.farmatech.metrofarm.datasource.DataSourceConnector;
import co.jankins.psf.common.enums.Estados;
import co.jankins.psf.common.exception.JankinsMarshallException;
import co.jankins.psf.common.metrofarm.exception.JankerExceptionEnum;

import com.co.farmatech.metrofarm.dto.DtoUsuario;
import com.co.farmatech.metrofarm.dto.PageData;

public class MgrUsuarioImpl implements MgrUsuarioService {

	UserDaoService userDao=new UserDaoImpl();
	ProfileDaoService profileService=new ProfileDaoImpl();

	public DtoUsuario authenticateUser(DtoUsuario usuario,DataSourceConnector source){

		DtoUsuario uservalid=userDao.authenticateUser(usuario, source.getConexion());

		if(uservalid!=null){
			if((Estados.ACTIVADO.getCode().equals(uservalid.getEstado())) ||uservalid.getPerfil()!=null && Estados.ACTIVADO.getCode().equals(uservalid.getPerfil().getEstado())){
				return uservalid;
			}else{
				if(Estados.DESACTIVADO.getCode().equals(uservalid.getEstado())){
					throw new JankinsMarshallException(JankerExceptionEnum.E_10006.getDescription(),JankerExceptionEnum.E_10006.getValue(),JankerExceptionEnum.E_10006.getDescription(),"ERROR",10006L);
				}else if(Estados.DESACTIVADO.getCode().equals(uservalid.getPerfil().getEstado())){
					throw new JankinsMarshallException(JankerExceptionEnum.E_10002.getDescription(),JankerExceptionEnum.E_10002.getValue(),JankerExceptionEnum.E_10002.getDescription(),"ERROR",10002L);
				}
			}
		}else{
			throw new JankinsMarshallException(JankerExceptionEnum.E_10001.getDescription(),JankerExceptionEnum.E_10001.getValue(),JankerExceptionEnum.E_10001.getDescription(),"ERROR",10001L);
		}
		throw new JankinsMarshallException("Ocurrio un error general");

	}

	@Override
	public DtoUsuario userByDocument(DtoUsuario usuario,DataSourceConnector source) {

		DtoUsuario uservalid=userDao.userByDocument(usuario, source.getConexion());

		if(uservalid!=null){
			return uservalid;
		}else{
			throw new JankinsMarshallException(JankerExceptionEnum.E_10004.getDescription(),JankerExceptionEnum.E_10004.getValue(),JankerExceptionEnum.E_10004.getDescription(),"ERROR",10004L);
		}
	}

	@Override
	public ArrayList<DtoUsuario> findUsers(DtoUsuario usuario,
			DataSourceConnector source,PageData pageData) {
		// TODO Auto-generated method stub
		return userDao.findUsers(usuario, source.getConexion(),pageData);

	}

	@Override
	public DtoUsuario createUser(DtoUsuario usuario, DataSourceConnector source) {
		// TODO Auto-generated method stub
		boolean uservalid=userDao.isValidUserCreate(usuario, source.getConexion());

		if(uservalid){
			return userDao.createUser(usuario, source.getConexion());
		}else{
			throw new JankinsMarshallException(JankerExceptionEnum.E_10005.getDescription(),JankerExceptionEnum.E_10005.getValue(),JankerExceptionEnum.E_10005.getDescription(),"ERROR",10004L);
		}
	}

	@Override
	public DtoUsuario updateUser(DtoUsuario usuario, DataSourceConnector source) {
		// TODO Auto-generated method stub
		return userDao.updateUser(usuario, source.getConexion());
	}




}