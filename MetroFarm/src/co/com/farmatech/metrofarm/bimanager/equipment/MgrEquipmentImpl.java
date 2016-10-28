package co.com.farmatech.metrofarm.bimanager.equipment;

import java.util.ArrayList;

import co.com.farmatech.metrofarm.dao.equipment.EquipmentDaoImpl;
import co.com.farmatech.metrofarm.dao.equipment.EquipmentDaoService;
import co.com.farmatech.metrofarm.datasource.DataSourceConnector;
import co.jankins.psf.common.exception.JankinsMarshallException;
import co.jankins.psf.common.metrofarm.exception.JankerExceptionEnum;

import com.co.farmatech.metrofarm.dto.DtoEquipo;
import com.co.farmatech.metrofarm.dto.DtoUsuario;
import com.co.farmatech.metrofarm.dto.PageData;

public class MgrEquipmentImpl implements MgrEquipmentService{

	EquipmentDaoService equipmentService=new EquipmentDaoImpl();
	
	@Override
	public ArrayList<DtoEquipo> findEquipment(DtoEquipo equipo,
			DataSourceConnector source,PageData pageData) {
		// TODO Auto-generated method stub
		return equipmentService.findEquipment(equipo, source.getConexion(),pageData);
		
	}
	
	@Override
	public DtoEquipo findEquipmentExist(DtoEquipo equipo,
			DataSourceConnector source) {
		// TODO Auto-generated method stub
		return equipmentService.findEquipmentExist(equipo, source.getConexion());
	}

	@Override
	public DtoEquipo createEquipment(DtoEquipo equipo,
			DataSourceConnector source) {
		// TODO Auto-generated method stub
		return equipmentService.createEquipment(equipo, source.getConexion());
		
	}

	@Override
	public DtoEquipo updateEquipment(DtoEquipo equipo,
			DataSourceConnector source) {
		// TODO Auto-generated method stub
		DtoEquipo equipoNoUpdate=new DtoEquipo();
		equipoNoUpdate.setCodigoInv(equipo.getCodigoInv());
		
		ArrayList<DtoEquipo> arrayEquipo=findEquipment(equipoNoUpdate, source,null);
		if(arrayEquipo.size()>0){
			equipoNoUpdate=arrayEquipo.get(0);
			if(!equipoNoUpdate.getTipo().equals(equipo.getTipo())){
				if(!equipmentService.validateMaintanencesRegister(equipoNoUpdate, source.getConexion())){
					throw new JankinsMarshallException(JankerExceptionEnum.E_30000.getDescription(),JankerExceptionEnum.E_30000.getValue());
				}
			}
			return equipmentService.updateEquipment(equipo, source.getConexion());
		}else{
			throw new JankinsMarshallException("El Equipo a actualizar no existe");
		}
		
		
	}
	
	

}
