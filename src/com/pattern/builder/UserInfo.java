package com.pattern.builder;

public class UserInfo {

	private String username;
	private String password;
	private String location;
	private String roles;
	
	public UserInfo(UserInfoBuilder userInfoBuilder) {
		this.username = userInfoBuilder.username;
		this.password = userInfoBuilder.password;
		this.location = userInfoBuilder.location;
		this.roles = userInfoBuilder.roles;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + ", location=" + location + ", roles="
				+ roles + "]";
	}

	public static class UserInfoBuilder {

		private String username;
		private String password;
		private String location;
		private String roles;
		
		public UserInfoBuilder(String username) {
			this.username = username;
		}
			
		protected UserInfoBuilder withUsername(String username) {
			this.username = username;
			return this;
		}
		
		protected UserInfoBuilder withPassword(String password) {
			this.password = password;
			return this;
		}
		
		protected UserInfoBuilder roles(String roles) {
			this.roles = roles;
			return this;
		}
		
		protected UserInfoBuilder location(String location) {
			this.location = location;
			return this;
		}
		
		protected UserInfo build() {
			return new UserInfo(this);
		}
	}

}
