package com.nanobetastudios.GJAPI;

/**
 * <b>User</b><br />
 * Represents GameJolt user.
 * @author Alastor
 * @since 1.0.0
 * @version 1.0.0
 */
public class User extends PropertyContainer {

    public User(){
        super();
    }

    public User(PropertyContainer other){
        super(other);
    }

    public enum UserType {USER, DEVELOPER, MODERATOR, ADMIN};

    public enum UserStatus {ACTIVE, BANNED};

    void setName(String username){
        this.addProperty("username", username);
    }

    void setToken(String token){
        this.addProperty("token", token);

    }

    void setType(UserType type){
        this.addProperty("type", type.toString());
    }

    void setStatus(UserStatus status){
        this.addProperty("status", status.toString());
    }

    public String getLastLoggedIn(){
        return getProperty("last_logged_in");
    }

    public String getSignedUp(){
        return getProperty("signed_up");
    }

    public int getId(){
        return Integer.parseInt(getProperty("id"));
    }

    public String getName(){
        return this.getProperty("username");
    }

    public String getToken() {
        return this.getProperty("token");
    }
    public UserType getType() {
        return UserType.valueOf(this.getProperty("type"));
    }
    public String getAvatarURL() {
        return this.getProperty("avatar_url");
    }
    public UserStatus getStatus() {
        return UserStatus.valueOf(this.getProperty("status"));
    }
    public String getDeveloperName() {
        return this.getProperty("developer_name");
    }
    public String getDeveloperWebsite() {
        return this.getProperty("developer_website");
    }
    public String getDeveloperDescription() {
        return this.getProperty("developer_description");
    }

    @Override
    public String toString() {
        return "User [name=" + getName() + ", token=" + getToken() + ", type=" + getType() + ", avatar_url=" + getAvatarURL() + "]";
    }
}
