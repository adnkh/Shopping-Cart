/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entitys;

/**
 *
 * @author VAIO
 */
public class account {
   private int id;
   private int accountNum;
   private int balance;
   private int customerID;

    public int getCustomerid() {
        return customerID;
    }

    public void setCustomerid(int customerid) {
        this.customerID = customerid;
    }

    public int getAccountnumber() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountNum = accountnumber;
    }


}
