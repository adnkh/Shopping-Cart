/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javax.ejb.Local;

/**
 *
 * @author adn
 */
@Local
public interface UserBeanLocal {

    boolean signup(String username, String password, String email, String surname);

    boolean delete(String username);

    boolean login(String username, String password);
    
    
}
