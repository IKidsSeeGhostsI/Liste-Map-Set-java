import java.util.ArrayList;

//----------------------------------------------------------------------------------------------------------------------
// (!)ca sa fac un K-NN in functie de varsta as avea nevoie de o metoda care sa imi scada data curenta cu data introdusa de utilizator la crearea contului(!)
//----------------------------------------------------------------------------------------------------------------------

public class Utilizator {
    String utilizatorID;
    String email;
    int nrAcesari;
    ArrayList<String> cautari;
    //daca pun si ArrayList in Utilizator(...) crapa mai tarziu da pot sa il scriu in this.cautari = new...
    public Utilizator(String utilizator,String mail,int nrAcc){
        this.utilizatorID = utilizator;
        this.email = mail;
        this.nrAcesari = nrAcc;
        this.cautari = new ArrayList<>();
    }

    //fac un get pentru fiecare si o sa vad pe parcurs cand si cum o sa am nevoie
    public String getUtilizatorID(){
        return utilizatorID;
    }

    public String getEmail(){
        return email;
    }

    //pentru a adauga ceva in cautari cred ca merge metoda urmatoare

    public void adaugaCautare(String obiect){
        cautari.add(obiect);
    }
//incercare implementare forEach cu lambda pg469 OCP
    public void afisareCautare(){
        System.out.println("Id-ul utilizatorului -- " +  utilizatorID + "  Email -- "+  email );
        cautari.forEach(c -> System.out.println(c));
    }


}
