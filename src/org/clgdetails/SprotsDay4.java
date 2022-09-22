package org.clgdetails;

public class SprotsDay4 implements SprotsDay3,SprotsDay2,SprotsDay1,SprotsDay{

	@Override
	public void sprotsday() {
		System.out.println("National Sprots Meet");
		
	}

	@Override
	public void sprotsname() {
		System.out.println("Football" + "," + "vollyball" +"," + "Basketball");
		
	}

	@Override
	public void football() {
		System.out.println(" ===football===");
		
	}

	@Override
	public void playerlist1() {
		System.out.println("vicky" + "\n" +"veera" + "\n" +" diva");
		
	}

	@Override
	public void vollyball() {
		System.out.println("===vollyball===");
	}

	@Override
	public void playerlist2() {
		System.out.println("vignesh" + "\n" +"vaiko" + "\n" +" dhinakaran");
		
	}

	@Override
	public void Basketball() {
		System.out.println("===basketball===");
	}

	@Override
	public void playerslist3() {
		System.out.println("praba" + "\n" + "karna" + "\n" + "mugil");
		
	}
	
	public static void main(String[]args) {
		SprotsDay4 z = new SprotsDay4();
		z.sprotsday();
		z.sprotsname();
		z.football();
		z.playerlist1();
		z.vollyball();
		z.playerlist2();
		z.Basketball();
		z.playerslist3();
	}
}