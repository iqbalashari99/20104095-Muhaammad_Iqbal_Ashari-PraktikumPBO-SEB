package iqbalashari.Modul2.com.Praktikum;

import iqbalashari.Modul2.com.Protec.ModifierProtec;

public class Main {
    public static void main(String[] args) {

        //Deklarasi objek dari class Modifier
        //From class Modifier in same package
        Modifier modif = new Modifier();

        //Non-modifier
        System.out.println(
                modif.angkaNon
        );
        //Public
        System.out.println(
                modif.angkaPublic
        );
        //Protected
        System.out.println(
                modif.angkaProtected
        );
        //Private
        modif.printAngkaPrivate();

        //From class ModifierProtec in different package
        ModifierProtec modifProtec = new ModifierProtec();

        //Can access just Public
        System.out.println(modifProtec.teksPublic);
        //System.out.println(modifProtec.teks);
        //System.out.println(modifProtec.teksProtect);




    }
}


