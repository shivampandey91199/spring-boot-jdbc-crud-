
package com.dao;

import java.util.ArrayList;

import com.user.user;

public class userDao {

	public static ArrayList<user> users = new ArrayList<>();

	static {

		user u1 = new user();
		u1.setuID(1);
		u1.setFirstName("Shivam");
		u1.setEmail("Shivam@gmail.com");
		u1.setPassword("Shivam@123");
		users.add(u1);

		user u2 = new user();
		u2.setuID(2);
		u2.setFirstName("Shiv");
		u2.setEmail("Shiv@gmail.com");
		u2.setPassword("Shiv@123");
		users.add(u2);

	}

}
