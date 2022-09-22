package org.clgdetails;

public class School1 {
 public School1(String name) {
  System.out.println(name);
 }
 public School1(String name1,int id1) {
 System.out.println(name1 + id1);
}
  public static void main(String[]args) {
	  School1 a = new School1("Studentlist");
	  School1 b = new School1("diva" +"123");
  }
  
}