package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BankMain {

    public static void main(String[] args) {
        Konto konto = new Konto();
        konto.numerKonta = new BigInteger("11112222333344445555666677");

        konto.wpłać(new BigDecimal("1000.02"));

        System.out.println(konto.stanKonta);
    }
}
