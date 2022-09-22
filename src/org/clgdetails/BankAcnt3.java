package org.clgdetails;

public class BankAcnt3 extends BankAcnt2 {

	@Override
	public void amtdebit() {
		System.out.println("10000");
	}

	@Override
	public void acntno() {
		System.out.println("Ac.no: 986654784928");
		
	}

	@Override
	public void Bankadress() {
		System.out.println("Chennai");
	}

	public static void main(String[]args) {
		BankAcnt3 z = new BankAcnt3();
		z.name();
		z.Bankadress();
		z.acnt();
		z.acntno();
		z.amountcredit();
		z.amtdebit();
		
	}
}
