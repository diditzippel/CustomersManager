//package com.customer;
//
//public class PrivateCustomer extends Customer {
//   private double moneyOfPrivateCustomer;  
//   
//   public PrivateCustomer(String firstName, String lastName, String mail, String phone, String adress, String city, String state, double moneyOfPrivateCustomer) {
//      super(firstName, lastName, mail, phone, adress, city, state);
//      setMoneyOfPrivateCustomer(moneyOfPrivateCustomer);
//   }
//   
//   public void onlyCheck() {
//      System.out.println("Mailing check to " + getFirstName() + " with salary " + moneyOfPrivateCustomer);
//   }
// 
//   public double getMoneyOfPrivateCustomer() {
//      return moneyOfPrivateCustomer;
//   }
//   
//   public void setMoneyOfPrivateCustomer(double newMoneyOfPrivateCustomer) {
//      if(newMoneyOfPrivateCustomer >= 0.0) {
//    	  moneyOfPrivateCustomer = newMoneyOfPrivateCustomer;
//      }
//   }
//   
//   public double computePay() {
//      System.out.println("Computing salary pay for " + getFirstName());
//      return moneyOfPrivateCustomer/52;
//   }
//}