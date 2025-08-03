//ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
    public ArrayList<Angajat> lista = new ArrayList<>();

    public void adaugAngajati(Angajat a){
        lista.add(a);
    }

    // exemplu implementarea for-each (nu am nevoie de index + nu modific structura colectiei in timpul iterarii si il are general use set-uri + liste
    //pg.469 OCP //varianta cu referinta dar exista si varianta cu lambda
    public void  afisareAngajati(){
        lista.forEach(System.out::println );
    }

    // .equals() ca in problema cu etajele si repartizarea pe apartamente din jpg ul P1
    // pot sa fac ceva cu iteratorul(nu afisare { e facuta cu forEach [care e mai rapid conform OCP pg 535]}) de exemplu sa parcurga array ul si sa dea remove angajatilor care nu apartin de departamentul IT}
    public void StergeifNotIT(){
        Iterator<Angajat> iter = lista.iterator();
        while(iter.hasNext()){
            Angajat a = iter.next();
            if(!a.getDepartament().equals("IT")){
               iter.remove();
            }
        }

    }

}
