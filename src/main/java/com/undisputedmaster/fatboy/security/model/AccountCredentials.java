package com.undisputedmaster.fatboy.security.model;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
public class AccountCredentials {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
	public String toString() {
		return "[email=" + email + ", password=" + password + "]";
	}
    
}