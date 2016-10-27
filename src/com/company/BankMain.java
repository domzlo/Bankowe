package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BankMain {

    public static void main(String[] args) {
        Konto kontoAliny = new Konto(new BigInteger("11112222333344445555666677"), new BigDecimal("0"), "PLN", new Osoba("Alina", "Nowak"));
        Konto kontoKarola = new Konto("11112222333344445555666677", new BigDecimal("100"), "PLN", new Osoba("Karol", "Nowak"));
        kontoAliny.wpłać(new BigDecimal("1000.02"));
        kontoKarola.wpłać(new BigDecimal("5000000.02"));

        System.out.println(kontoAliny.stanKonta);
        System.out.println(kontoKarola.stanKonta);
    }
}
