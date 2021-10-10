package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount myWallet = new BankAccount(20000);

	    while (true) {
	        try {
	            myWallet.withDraw(6000);
            } catch (LimitException limitException) {
	            limitException.getMessage();
                try {
                    myWallet.withDraw((int) myWallet.getAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}
