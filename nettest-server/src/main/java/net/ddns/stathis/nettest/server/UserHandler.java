package net.ddns.stathis.nettest.server;

import java.util.ArrayList;
import java.util.List;

public class UserHandler {

	public Users getAll() {
		List<User> userList = new ArrayList<>();

		// Create a user sample
		User user1 = new User();
		user1.setId(1);
		user1.setName("Georgios");
		userList.add(user1);

		// Create another user sample
		User user2 = new User();
		user2.setId(2);
		user2.setName("Nadia");
		userList.add(user2);

		// Return the user list
		Users users = new Users();
		users.setUsers(userList);
		// throw new RuntimeException("Hello HAAHAHAHAHA");
		return users;
	}
}
