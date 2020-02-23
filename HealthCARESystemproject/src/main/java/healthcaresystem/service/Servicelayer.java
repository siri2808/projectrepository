package healthcaresystem.service;

import healthcaresystem.exceptions.HealthCareException;

public interface Servicelayer {
	public boolean validatePassword(String password) ;
	public boolean validateName(String username) ;
	public boolean validateNumber(String mobile);
	public boolean validateEmail(String mail);
	
}
