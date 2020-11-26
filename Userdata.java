package com.cg.go.entity;

import javax.persistence.*;

 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "Userdata")
public class Userdata {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="userId")
    private int userId;
    @Column(name="userName")
    private String userName;
   

	@Column(name="userType")
    private String userType;
    @Column(name="userPassword")
    private String userPassword;
   
    
    public Userdata(String userName, int userId, String userType, String userPassword) {
        super();
        this.userName = userName;
        this.userId = userId;
        this.userType = userType;
        this.userPassword = userPassword;
    }
    public Userdata() {
		// TODO Auto-generated constructor stub
    	System.out.println("User data created");
	}
	public String getUserName() {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }
    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }
    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
  
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
   	public int hashCode() {
   		final int prime = 31;
   		int result = 1;
   		result = prime * result + userId;
   		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
   		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
   		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
   		return result;
   	}
   	@Override
   	public boolean equals(Object obj) {
   		if (this == obj)
   			return true;
   		if (obj == null)
   			return false;
   		if (getClass() != obj.getClass())
   			return false;
   		Userdata other = (Userdata) obj;
   		if (userId != other.userId)
   			return false;
   		if (userName == null) {
   			if (other.userName != null)
   				return false;
   		} else if (!userName.equals(other.userName))
   			return false;
   		if (userPassword == null) {
   			if (other.userPassword != null)
   				return false;
   		} else if (!userPassword.equals(other.userPassword))
   			return false;
   		if (userType == null) {
   			if (other.userType != null)
   				return false;
   		} else if (!userType.equals(other.userType))
   			return false;
   		return true;
   	}
    @Override
    public String toString() {
        return "Userdata [userName=" + userName + ", userId=" + userId + ", userType=" + userType + ", userPassword="
                + userPassword + "]";
    }

 

   
}