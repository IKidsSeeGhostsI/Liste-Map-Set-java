//Voi implementa un HashSet(SDA --> hash table care functioneaza ca un  "dictionar") conform informatiilor de la pagina 477 am HashSet si TreeSet({Ex:}Arbore Binar SDA)
//Marele avantaj al unui TreeSet este faptul ca e deja sortat in ordine insa verificarea daca un element exista sau nu creste exponential cu numarul de elemente din arbore
/*m-am gandit la o implementare in care as dori sa verific adresele de mail a unor clienti
(Exista un client ID si doresc sa verific mail-ul asociat acelui ID,si prin asta poate pot implementa si o metoda sa
determin cat de des a accesat acel client site-ul (EX : emag) si sa fac un profil al cumparatorului pe baza a ceea ce cauta
si sa creez asocieri cu alti cumparatori (SPD{Statistica si prelucrarea datelor}) pentru a imbunatati exeprienta utilizatorului
(micro implementare pe o singura persoana poate fi algortimul KNN si pe ceva mai macro pot sa ma duc spre *Apriori*  daca nu ma insel) !
 */
//pot sa implementez cu ArrList cautarile unui utilizator ? Se pare ca da...deci pot sa ma folosesc de mail si ID + obiecte  cautate
// cel mai cautat obiect pot sa il implementez cu un Map? ramane pe data viitoare
import java.util.HashSet;
public class HashSett {
    public HashSet<Utilizator> set = new HashSet<>();

    public void adaugaUtilizator(Utilizator u){

        set.add(u);
    }
// metoda Contains exista doar in interfata Collection nu si in Map {Ex 486/487 OCP}
    public void AfisareDupaCautare(String obiect){
        for(Utilizator u : set){
            if(u.cautari.contains(obiect)){
                u.afisareCautare();
            }
        }
    }

}
