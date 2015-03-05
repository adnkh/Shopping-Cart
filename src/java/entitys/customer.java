/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entitys;

/**
 *
 * @author VAIO
 */
public class customer {
    private int id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private int role;

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getFirstname() {
        return name;
    }

    public void setFirstname(String firstname) {
        this.name = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return surname;
    }

    public void setLastname(String lastname) {
        this.surname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
