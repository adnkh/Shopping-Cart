/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EJB;

import entitys.account;
import entitys.customer;
import entitys.product;
import entitys.shoppingcart;
import entitys.shoppingcartcontent;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Raneen
 */
@Local
public interface ConnectionDBLocal {    
    
    //Customer 
    public void addCustomer(customer cus) throws SQLException;
    public void deleteCustomer(String fname,String lname) throws SQLException;
    public customer getCustomerById(int id) throws SQLException ;
    public customer getCustomerByFirstnameandLastname(String fname, String lname) throws SQLException ;
    public customer getCustomerByUsernameandPassword(String username, String password) throws SQLException;
    public String ValidationUser(String username, String password) throws SQLException ;

    
    //Customer Account
    public void addAccount(account acc) throws SQLException;
    public void deleteAccount(int AccountNumber ) throws SQLException;
    public account getAccountByCustomerID(int CustomerID) throws SQLException;
    public account getAccountByAccountNumber(int accountnumber) throws SQLException;
    public account getAccountByCustomerIDandAccountNumber(int customerid, int accountnumber) throws SQLException;
    
    //Product 
    public void addProduct(product pro) throws SQLException;
    public void deleteProduct(int id) throws SQLException;
    public product getProductById(int id) throws SQLException ;    
    
    //Shopping Cart
    public void addShoppingCart(shoppingcart sCart) throws SQLException;
    public void deleteShoppingCart(int id) throws SQLException;
    public shoppingcart getShoppingCartById(int id) throws SQLException ;    
    
    //Shopping Cart Content
    public void addShoppingCartContent(shoppingcartcontent sCartContent) throws SQLException;    
    public void deleteShoppingCartContent(int id) throws SQLException;
    public shoppingcartcontent getShoppingCartContentById(int id) throws SQLException ;            
}
