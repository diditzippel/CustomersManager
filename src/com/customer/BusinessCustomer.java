//package com.customer;
//
//public class BusinessCustomer extends Customer {
//   private double moneyOfBusinessCustomer;   
//   
//   public BusinessCustomer(String firstName, String lastName, String mail, String phone, String adress, String city, String state, double moneyOfBusinessCustomer) {
//      super(firstName, lastName, mail, phone, adress, city, state);
//      setMoneyOfBusinessCustomer(moneyOfBusinessCustomer);
//   }
//   
//   public void onlyCheck() {
//      System.out.println("Mailing check to " + getFirstName() + " with salary " + moneyOfBusinessCustomer);
//   }
// 
//   public double getMoneyOfBusinessCustomer() {
//      return moneyOfBusinessCustomer;
//   }
//   
//   public void setMoneyOfBusinessCustomer(double newMoneyOfBusinessCustomer) {
//      if(newMoneyOfBusinessCustomer >= 0.0) {
//    	  moneyOfBusinessCustomer = newMoneyOfBusinessCustomer;
//      }
//   }
//   
//   public double computePay() {
//      System.out.println("Computing salary pay for " + getFirstName());
//      return moneyOfBusinessCustomer/52;
//   }
//}