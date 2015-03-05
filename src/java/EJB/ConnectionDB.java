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
import javax.ejb.Stateless;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author Raneen
 */
@Stateless
public class ConnectionDB implements ConnectionDBLocal {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    SessionFactory factory = SessionFactory.getInstance();
    QueryRunner runner = factory.getQueryRunner();
    public static ConnectionDB instance;

    public static ConnectionDB getInstance() {
        if (instance == null) {
            instance = new ConnectionDB();
        }
        return instance;
    }

    // Customer queries
    
    @Override
    public void addCustomer(customer cus) throws SQLException {
        String query = "INSERT INTO customer (name,surname,username,password,role) VALUES (?,?,?,?,?)";
        runner.update(query, new Object[]{cus.getFirstname(),cus.getLastname(), cus.getUsername(),cus.getPassword(),cus.getRole()});      
    }
    
    @Override
    public void deleteCustomer(String fname,String lname) throws SQLException {
        String query = "DELETE FROM customer WHERE firstname=? and lastname=? ";
        runner.update(query, new Object[]{ fname,lname});
    }
    
    @Override
    public customer getCustomerByFirstnameandLastname(String fname, String lname) throws SQLException {
        String query = "SELECT * FROM customer WHERE firstname = ? AND lastname = ?";
        runner.update(query, new Object[]{ fname,lname});
        BeanHandler rsh = new BeanHandler(customer.class);
        customer cus = (customer) runner.query(query, rsh);//query(query, new Object[]{fname, lname}, rsh);
        return cus;
    }

    @Override
    public customer getCustomerByUsernameandPassword(String username, String password) throws SQLException {
        String query = "SELECT * FROM customer WHERE username = ? AND password = ?";
        runner.update(query, new Object[]{ username,password});
        BeanHandler rsh = new BeanHandler(customer.class);
        customer cus = (customer) runner.query(query, rsh);
        return cus;
    }
    
    @Override
    public String ValidationUser(String username, String password) throws SQLException {
        String query = "SELECT * FROM customer WHERE username = ? AND password = ?";
        runner.update(query, new Object[]{ username,password});
        try{
            BeanHandler rsh = new BeanHandler(customer.class);
            customer cus = (customer) runner.query(query, rsh);
            if(!cus.equals(null))
                return "Validation";
        }
        catch(Exception e){e.printStackTrace();}
            return "NotValidation";
    }

    @Override
    public customer getCustomerById(int id) throws SQLException {
        String query = "SELECT * FROM customer WHERE id = ?";
        runner.update(query, new Object[]{ id});
        BeanHandler rsh = new BeanHandler(customer.class);
        customer cus = (customer) runner.query(query, rsh);
        return cus;
    }
    
    // Account Section
    @Override
    public void addAccount(account acc) throws SQLException {
        String query = "INSERT INTO account (balance,customerID) VALUES (?,?)";
        runner.update(query, new Object[]{acc.getBalance(),acc.getCustomerid() });       
    }

    @Override
    public void deleteAccount(int AccountNumber ) throws SQLException {
        String query = "DELETE FROM account WHERE  accountNum=?";
        runner.update(query, new Object[]{ AccountNumber});
    }

    @Override
    public account getAccountByCustomerIDandAccountNumber(int customerid, int accountnumber) throws SQLException {
        String query = "SELECT * FROM account WHERE customerID = ? AND accountNum = ?";
        BeanHandler rsh = new BeanHandler(account.class);
        account acc = (account) runner.query(query, new Object[]{customerid, accountnumber}, rsh);
        return acc;
    }

    @Override
    public account getAccountByAccountNumber(int accountnumber) throws SQLException {
        String query = "SELECT * FROM account WHERE  accountNum = ?";
        BeanHandler rsh = new BeanHandler(account.class);
        account acc = (account) runner.query(query, new Object[]{ accountnumber}, rsh);
        return acc;
    }


    @Override
    public account getAccountByCustomerID(int CustomerID) throws SQLException {
        String query = "SELECT * FROM account WHERE  customerID = ?";
        BeanHandler rsh = new BeanHandler(account.class);
        account acc = (account) runner.query(query, new Object[]{ CustomerID}, rsh);
        return acc;
    }

//    @Override
//    public void WithdrawalAccount(int AccountNumber,int CustomerID,int balance) throws SQLException {
//        String query = "UPDATE account SET balance=balance - ? WHERE accountnumber=? and customerid=?";
//        runner.update(query, new Object[]{balance,AccountNumber,CustomerID });
//    }
//
//    @Override
//    public void DepositAccount(int AccountNumber,int CustomerID,int balance) throws SQLException {
//        String query = "UPDATE account SET balance=balance + ? WHERE accountnumber=? and customerid=?";
//        runner.update(query, new Object[]{balance,AccountNumber,CustomerID });
//    }
//
//    @Override
//    public void DepositAccountByAccountNumberOnly(int AccountNumber,int balance) throws SQLException {
//        String query = "UPDATE account SET balance=balance + ? WHERE accountnumber=? ";
//        runner.update(query, new Object[]{balance,AccountNumber });
//    }


//      public void addTransaction(transaction Trans) throws SQLException {
//          String Type=Trans.getRemarks();
//          if(Type.equals("withdrawal"))
//          {
//
//          String query = "INSERT INTO transaction (thedate,fromaccountnumber,amount,remarks) VALUES (?,?,?,?)";
//        runner.update(query, new Object[]{Trans.getThedate(),Trans.getFromaccountnumber(),Trans.getAmount(),Trans.getRemarks() });
//
//          }
//          if(Type.equals("deposit"))
//          {
//
//          String query = "INSERT INTO transaction (thedate,toaccountnumber,amount,remarks) VALUES (?,?,?,?)";
//        runner.update(query, new Object[]{Trans.getThedate(),Trans.getToaccountnumber(),Trans.getAmount(),Trans.getRemarks() });
//
//          }
//            if(Type.equals("transfer"))
//            {
//          String query = "INSERT INTO transaction (thedate,fromaccountnumber,toaccountnumber,amount,remarks) VALUES (?,?,?,?,?)";
//        runner.update(query, new Object[]{Trans.getThedate(),Trans.getFromaccountnumber(),Trans.getToaccountnumber(),Trans.getAmount(),Trans.getRemarks() });
//          }
//        return ;
//    }

//    public int GetRole(String username) throws SQLException {
//        String query = "SELECT role FROM users WHERE username = ?";
//        
//        BeanHandler rsh = new BeanHandler(users.class);
//        users user = (users) runner.query(query, new Object[]{username}, rsh);
//        return user.getRole();
//    }

//      public List<transaction> getTransactions(int accountnumber,String startdate,String enddate) throws SQLException {
//        String query = "SELECT * FROM transaction where (fromaccountnumber=? or toaccountnumber=?) and (thedate between ? and ?)";
//        BeanListHandler rsh = new BeanListHandler(transaction.class);
//        List<transaction> transactions = (List<transaction>) runner.query(query,new Object[]{accountnumber,accountnumber,startdate,enddate}, rsh);
//        return transactions;
//    }

    

    @Override
    public void addProduct(product pro) throws SQLException {
        String query = "INSERT INTO product (title,customerID,price) VALUES (?,?,?)";
        runner.update(query, new Object[]{pro.getTitle(),pro.getCustomerID(),pro.getPrice() });       
    }

    @Override
    public void deleteProduct(int id) throws SQLException {
        String query = "DELETE FROM product WHERE id=?";
        runner.update(query, new Object[]{ id});
    }

    @Override
    public product getProductById(int id) throws SQLException {
        String query = "SELECT * FROM product WHERE id = ?";
        runner.update(query, new Object[]{ id});
        BeanHandler rsh = new BeanHandler(customer.class);
        product pro = (product) runner.query(query, rsh);
        return pro;
    }

    
    
    @Override
    public void addShoppingCart(shoppingcart sCart) throws SQLException {
        String query = "INSERT INTO shoppingcart (contentID,totalBalance,customerID) VALUES (?,?,?)";
        runner.update(query, new Object[]{sCart.getContentID(),sCart.getTotalBalance(),sCart.getCustomerID()});
    }

    @Override
    public void deleteShoppingCart(int id) throws SQLException {
        String query = "DELETE FROM shoppingcart WHERE id=?";
        runner.update(query, new Object[]{ id});
    }

    @Override
    public shoppingcart getShoppingCartById(int id) throws SQLException {
        String query = "SELECT * FROM shoppingcart WHERE id = ?";
        runner.update(query, new Object[]{ id});
        BeanHandler rsh = new BeanHandler(customer.class);
        shoppingcart sCart = (shoppingcart) runner.query(query, rsh);
        return sCart;
    }

    @Override
    public void addShoppingCartContent(shoppingcartcontent sCartContent) throws SQLException {
        String query = "INSERT INTO shoppingcartcontent (productID,shoppingCartID) VALUES (?,?)";
        runner.update(query, new Object[]{sCartContent.getProductID(),sCartContent.getShoppingCartID()});
    }

    @Override
    public void deleteShoppingCartContent(int id) throws SQLException {
        String query = "DELETE FROM shoppingcartcontent WHERE id=?";
        runner.update(query, new Object[]{ id});
    }

    @Override
    public shoppingcartcontent getShoppingCartContentById(int id) throws SQLException {
        String query = "SELECT * FROM shoppingcartcontent WHERE id = ?";
        runner.update(query, new Object[]{ id});
        BeanHandler rsh = new BeanHandler(customer.class);
        shoppingcartcontent sCartContent = (shoppingcartcontent) runner.query(query, rsh);
        return sCartContent;
    }

}
