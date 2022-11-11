package src.business;

import src.dataaccess.User;

import java.util.List;


public interface ControllerInterface {
	public User login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
