package org.clgdetails;

public class ExamDtls {
 private void exam() {
	 System.out.println("Theory Exam"+"\n" +"Labexam");
 }
 private  void exam1() {
	 System.out.println("Theory Exam start date - 2/08/22" + "\n" + "Lab exam date - 10/08/22");
	 
	 
 }
 
 public void name() {
	System.out.println("Exam names");
}
public static void main(String[]args) {
	ExamDtls a = new ExamDtls();
	a.exam();
	a.exam1();
}
}

