package co.jankins.psf.common.exception;

public class JankinsMarshallException extends RuntimeException{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4152633609482512084L;

	/** The code. */
	private String code;
	
	/** The description. */
	private String description;
	
	/** The severity. */
	private String severity;
	
	/** The transactionid. */
	private Long transactionid;
	
	/**
	 * Instantiates a new jankins exception.
	 */
	public JankinsMarshallException() {
	}
	
	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param message the message
	 * @param code the code
	 * @param description the description
	 * @param severity the severity
	 * @param transactionid the transactionid
	 */
	public JankinsMarshallException(String message, String code, String description, String severity,Long transactionid) {
		super(message);
		this.code = code;
		this.description = description;
		this.severity = severity;
		this.transactionid=transactionid;
	}

	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param message the message
	 */
	public JankinsMarshallException(String message) {
		super(message);
	}
	
	/**
	 * 
	 * @param message
	 * @param code
	 */
	public JankinsMarshallException(String message,String code) {
		super(message);
		this.code=code;
	}

	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param cause the cause
	 */
	public JankinsMarshallException(Throwable cause) {
		super(cause.getMessage(),cause);
	}

	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param cause the cause
	 * @param code the code
	 */
	public JankinsMarshallException(Throwable cause,String code) {
		super(cause.getMessage(),cause);
		this.code=code;
	}
	
	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param cause the cause
	 * @param transactionid the transactionid
	 */
	public JankinsMarshallException(Throwable cause,long transactionid) {
		super(cause.getMessage(),cause);
		this.transactionid=transactionid;
	}
	
	/**
	 * Instantiates a new jankins exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public JankinsMarshallException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the severity.
	 *
	 * @return the severity
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * Sets the severity.
	 *
	 * @param severity the severity to set
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	/**
	 * Gets the transactionid.
	 *
	 * @return the transactionid
	 */
	public Long getTransactionid() {
		return transactionid;
	}

	/**
	 * Sets the transactionid.
	 *
	 * @param transactionid the transactionid to set
	 */
	public void setTransactionid(Long transactionid) {
		this.transactionid = transactionid;
	}	


}
