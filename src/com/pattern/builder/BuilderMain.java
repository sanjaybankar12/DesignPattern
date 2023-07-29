package com.pattern.builder;

public class BuilderMain {
	
	public static void main(String[] args) {

		UserInfo userInfo = new UserInfo.UserInfoBuilder("sam").withPassword("1234").location("pune").roles("USER")
				.build();
		System.out.println(userInfo);
	}
}
