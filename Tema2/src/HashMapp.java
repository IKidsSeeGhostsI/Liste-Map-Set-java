import java.util.HashMap;

// pg 483->489
public class HashMapp {
//HashMap<Key,Value> value-ul poate  sa fie dintr-o Clasa dar cum fac key-ul sa fie clasa 16:45

    //HashMap<String,Produse> produseHashMap = new HashMap<>();

    HashMap<Cheie,Produse> produseHashMap = new HashMap<>();

     public void adaugaProduseHashMap(Cheie key,Produse produs){
       produseHashMap.put(key,produs);

     }
    //afisarea cu forEach
    //metoda afisare doar produse
    public void afisareProdus(){
         produseHashMap.forEach(((cheie, produse) ->System.out.println(produse)));
    }
    //metoda afisare doar chei
    public void afisareChei(){
         produseHashMap.forEach((cheie,produse)->System.out.println(cheie));

    }
    //metoda afisare si cheie si produse
    public void afisareCheieSiProduse(){
         produseHashMap.forEach((cheie,produse)->System.out.println("Cheia == " +cheie + "Produsul == " + produse));
    }
// pe viitor pot implementa aici si metode prin care sa caut dupa nume un produs si pot sa folosesc o lista cu produse
    //sau o metoda care sa functioneze un fel de best deal de ex key-ul "1"(electronice) caut laptopuri --> imi da un arraylist cu laptopuri insa ordonat dupa cel mai bun pret


}
