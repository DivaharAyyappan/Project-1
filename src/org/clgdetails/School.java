package org.clgdetails;

public class School {
  public School(String name) {
	 System.out.println(name);
 }
  public School(int id) {
	 System.out.println(id);
 }
 
 public static void main(String[]args) {
	 School a = new School("AK School");
	 School a1 = new School("1234");
	 
 }
}
