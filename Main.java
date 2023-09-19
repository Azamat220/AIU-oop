package org.example;

public class Main {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(1, "Kiara");

        personalAccount.deposit(2131231223);
        personalAccount.withdraw(45454);
        personalAccount.printTransactionHistory();
    }
}