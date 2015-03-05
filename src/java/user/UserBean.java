/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javax.ejb.Stateless;

/**
 *
 * @author adn
 */
@Stateless
public class UserBean implements UserBeanLocal {

    @Override
    public boolean signup(String username, String password, String email, String surname) {        
        return true;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean delete(String username) {
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        return true;
    }
    
    
}
