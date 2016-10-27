package com.company;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Konto {

    BigInteger numerKonta;
    BigDecimal stanKonta;
    String waluta;
    Osoba właściciel;

    public Konto(String numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) {
        this.numerKonta = new BigInteger(numerKonta);
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }

    public Konto(BigInteger numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }
//    w ten sposób konstruktor wymaga podania new BigIntegera a w wersji wyżej wymaga Stringa. W zakładce
//    BankMain wykorzystuje oba konstruktory i działa


    public void wpłać(BigDecimal kwota) {
        stanKonta = stanKonta.add(kwota);
//        ta meoda xxx.add odnosi się do BigDecimala - na int moglibyśmy po prosty dodać znakiem +
    }
}
