package co.jankins.psf.common.operations;

public class Operations {
	
	//USER_SERVICE
	public static final String AUTHENTICATE_USER="AUTHENTICATE_USER";
	public static final String USER_BY_DOCUMENT="USER_BY_DOCUMENT";
	public static final String FIND_USERS="FIND_USERS";
	public static final String CREATE_USER="CREATE_USER";
	public static final String DELETE_USER="DELETE_USER";
	public static final String UPDATE_USER="UPDATE_USER";
	
	//PROFILE_SERVICE
	public static final String CREATE_PROFILE="CREATE_PROFILE";
	public static final String UPDATE_PROFILE="UPDATE_PROFILE";
	public static final String FIND_PROFILE="FIND_PROFILE";
	
	//EMAIL_SERVICE
	public static final String FORGGET_PASSWORD="FORGGET_PASSWORD";
	
	//EQUIPMENT_SERVICE
	public static final String FIND_EQUIPMENT="FIND_EQUIPMENT";
	public static final String FIND_EQUIPMENT_EXIST="FIND_EQUIPMENT_EXIST";
    public static final String CREATE_EQUIPMENT="CREATE_EQUIPMENT";
	public static final String UPDATE_EQUIPMENT="UPDATE_EQUIPMENT";
    
	//CALIBRATION_SERVICE
	public static final String FIND_CALIBRATION="FIND_CALIBRATION";
	public static final String FIND_CALIBRATION_MONTH_SCHEDULED="FIND_CALIBRATION_MONTH_SCHEDULED";
	public static final String FIND_CALIBRATION_MONTH_EXPIRED="FIND_CALIBRATION_MONTH_EXPIRED";
	public static final String CREATE_FIRST_CALIBRATION="CREATE_FIRST_CALIBRATION";
    public static final String CREATE_CALIBRATION="CREATE_CALIBRATION";
    public static final String DELETE_CALIBRATION="DELETE_CALIBRATION";
	public static final String UPDATE_CALIBRATION="UPDATE_CALIBRATION";
	public static final String GET_PROVIDERS="GET_PROVIDERS";
	
	//QUALIFICATION_SERVICE
	public static final String FIND_CALIFICATION="FIND_CALIFICATION";
	public static final String CREATE_FIRST_CALIFICATION="CREATE_FIRST_CALIFICATION";
    public static final String CREATE_CALIFICATION="CREATE_CALIFICATION";
	public static final String UPDATE_CALIFICATION="UPDATE_CALIFICATION";
	public static final String FIND_CALIFICATION_MONTH_SCHEDULED="FIND_CALIFICATION_MONTH_SCHEDULED";
	public static final String FIND_CALIFICATION_MONTH_EXPIRED="FIND_CALIFICATION_MONTH_EXPIRED";
	public static final String FIND_CALIFICATION_PROGRAMMING="FIND_CALIFICATION_PROGRAMMING";
	
	//MAINTENANCE_SERVICE
	public static final String FIND_MAINTENANCE="FIND_MAINTENANCE";
	public static final String FIND_MAINTENANCE_MONTH_SCHEDULED="FIND_MAINTENANCE_MONTH_SCHEDULED";
	public static final String FIND_MAINTENANCE_MONTH_EXPIRED="FIND_MAINTENANCE_MONTH_EXPIRED";
	public static final String CREATE_FIRST_MAINTENANCE="CREATE_FIRST_MAINTENANCE";
    public static final String CREATE_MAINTENANCE="CREATE_MAINTENANCE";
	public static final String UPDATE_MAINTENANCE="UPDATE_MAINTENANCE";
	public static final String DELETE_MAINTENANCE="DELETE_MAINTENANCE";
        
    //CHANGE_REGISTER_SERVICE
	public static final String CREATE_CHANGE_REGISTER="CREATE_CHANGE_REGISTER";
	public static final String LIST_CHANGE_REGISTER="LIST_CHANGE_REGISTER";
	
	//SYNCHRONICE_SERVICE
	public static final String SYNCHRONICE="SYNCHRONICE";
	
	//NOTIFICATION
	public static final String GET_NOTIFICATIONS="GET_NOTIFICATIONS";
	
	//REPORT_SERVICE
	public static final String REPORT_CALIBRATION_FOR_EQUIPMENT="REPORT_CALIBRATION_FOR_EQUIPMENT";
	public static final String REPORT_CALIBRATION_FOR_MONTH="REPORT_CALIBRATION_FOR_MONTH";
	public static final String INDICATOR_CALIBRATION="INDICATOR_CALIBRATION";
	public static final String INDICATOR_CALIFICATION="INDICATOR_CALIFICATION";
	public static final String INDICATOR_MAINTENANCE_GENERAL="INDICATOR_MAINTENANCE_GENERAL";
	public static final String MAINTENANCE_FOR_EQUIPMENT="MAINTENANCE_FOR_EQUIPMENT";
	public static final String MAINTENANCE_FOR_MONTH="MAINTENANCE_FOR_MONTH";
	public static final String MAINTENANCE_FOR_EQUIPMENT_GENERAL="MAINTENANCE_FOR_EQUIPMENT_GENERAL";
	public static final String MAINTENANCE_FOR_MONTH_GENERAL="MAINTENANCE_FOR_MONTH_GENERAL";


}
