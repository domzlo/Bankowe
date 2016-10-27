package com.company;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Konto {

    BigInteger numerKonta;
    BigDecimal stanKonta;
    String waluta;
    Osoba właściciel;

    public void wpłać(BigDecimal kwota) {
        stanKonta = stanKonta.add(kwota);
//        ta meoda xxx.add odnosi się do BigDecimala - na int moglibyśmy po prosty dodać znakiem +
    }
}
