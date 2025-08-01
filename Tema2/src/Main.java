import java.util.ArrayList;
import java.util.HashSet;
public class Main {
    public static void main(String[] args){

        ArrList arr = new ArrList();
        //01.08.2025 13:00
        arr.adaugAngajati(new Angajat("17092003","Marius",1000,"IT"));
        arr.adaugAngajati(new Angajat("10102003","Rares",900,"HR"));
        arr.adaugAngajati(new Angajat("27102003","Rares",1000,"IT"));
        arr.adaugAngajati(new Angajat("10101010","Dan",2500,"it"));

        arr.afisareAngajati();
        arr.StergeifNotIT();
        arr.afisareAngajati();
//-------------------------------------------------------------------------------------------------------------------------
        HashSett set = new HashSett();
         // 01.08.2025 23:46

        Utilizator u1 = new Utilizator("17092003","oancamarius212@gmail.com",2);
        Utilizator u2 = new Utilizator("10102003","rares.isvoranu@gmail.com",1);
        Utilizator u3 = new Utilizator("27102003","rares-danielconstantin@gmail.com",4);
        Utilizator u4 = new Utilizator("12082001","pinzaru_robert@gmail.com",6);


        /*
        set.adaugaUtilizator(new Utilizator("17092003","oancamarius212@gmail.com",2));
        set.adaugaUtilizator(new Utilizator("10102003","rares.isvoranu@gmail.com",1));
        set.adaugaUtilizator(new Utilizator("27102003","rares-danielconstantin@gmail.com",4));
        set.adaugaUtilizator(new Utilizator("12082001","pinzaru_robert@gmail.com",6));
        */

        // u1.adaugaCautare() --> nu imi merge in formatul in care am scris in a 2 a faza deci  trebuie sa rescriu separat
        // si set.adaugaUtilizator() {LOGIC}

        u1.adaugaCautare("laptop");
        u1.adaugaCautare("telefon");
        u1.adaugaCautare("MacMini");
        u1.adaugaCautare("televizor");
        u2.adaugaCautare("telefon");
        u2.adaugaCautare("televizor");
        u2.adaugaCautare("AC");
        u3.adaugaCautare("laptop");
        u3.adaugaCautare("microfon");
        u3.adaugaCautare("tastatura");
        u4.adaugaCautare("mouse");
        u4.adaugaCautare("placa video");
        u4.adaugaCautare("procesor");

        set.adaugaUtilizator(u1);
        set.adaugaUtilizator(u2);
        set.adaugaUtilizator(u3);
        set.adaugaUtilizator(u4);

        String obiect = "laptop";
        System.out.println("Utilizatorii care au cautat ==  " +obiect+ " sunt :: ");
        set.AfisareDupaCautare(obiect);


    }
}
