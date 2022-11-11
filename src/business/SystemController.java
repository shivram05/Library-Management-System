package src.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import src.dataaccess.*;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;

	@Override
	public User login(String id, String password) throws LoginException {

		TestData test = new TestData();
		List<User> users = test.allUsers;

		User use = null;
		for (User user : users) {
			if (id.contains(user.getId()) && password.contains(user.getPassword())) {
				use = user;
				break;
			}
		}
		if (use == null)
			throw new LoginException("Username or password incorrect!");
		return use;
	}
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}
	
	
}
