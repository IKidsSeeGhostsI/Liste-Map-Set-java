//inspiratie : tabelul emp si  interogarile pe care le faceam pe tabelul emp la BD in SQL
public class Angajat {
    String iDAngajat;
    String nume;
    float salariu;
    String departament;


 public Angajat(String iD,String num, float sal, String dept){
        this.iDAngajat = iD;
        this.nume = num;
        this.salariu = sal;
        this.departament =dept.toUpperCase();
    }
  // nu mai am nevoie de metoda de afisare date daca pot sa fac o afiasre cu foreach in ArrList
 /*
public void AfisDate(){
     System.out.println("id Angajat " + this.iDAngajat);
     System.out.println("Nume Angajat " + this.nume);
     System.out.println("Departament "+ this.departament);
     System.out.println("Salariu " + this.salariu);
}
*/
    //nici de metodele de get nu mai am nevoie acum dupa ce am facut sa functioneze ArrList si Angajat
    /*
    public String getiDAngajat(){
        return iDAngajat;
    }
    public String getNume(){
        return nume;
    }
    public float getSalariu(){
        return salariu;
    }

    public String getDepartament(){
        return departament;
    }
    */

  // metoda toString() pg492+pg493 OCP

    public String toString(){
        return iDAngajat + " -- " + nume + " -- " + salariu + " -- " + departament ;
    }

    public String getDepartament(){
        return departament;
    } // ba uite ca am nevoie de metoda ca altfel nu imi merge iteratorul
    //daca il las asa si la crearea unui obiect pun "it" imi crapa in ArrList deci ma duc si modif in Constructor (la un .toUpperCase() //Laboratorul 2 + Curs 1 Java AC_TUIASI//
}
