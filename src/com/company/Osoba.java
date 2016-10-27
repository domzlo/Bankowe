package com.company;


public class Osoba {

        private String imie, nazwisko;

        public Osoba(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public String PobierzImię() {
            return imie;
        }
        public String PobierzNazwisko() {
            return nazwisko;
        }
    }
