import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrList arr = new ArrList();

        arr.adaugAngajati(new Angajat("17092003","Marius",1000,"IT"));
        arr.adaugAngajati(new Angajat("10102003","Rares",900,"HR"));
        arr.adaugAngajati(new Angajat("27102003","Rares",1000,"IT"));
        arr.adaugAngajati(new Angajat("10101010","Dan",2500,"it"));

        arr.afisareAngajati();
        arr.StergeifNotIT();
        arr.afisareAngajati();
    }
}
