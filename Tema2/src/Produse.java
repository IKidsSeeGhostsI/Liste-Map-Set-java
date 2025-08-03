public class Produse {
    String numeProdus;
    String tipProdus;
    String codProdus;
    double pret;
    int stocP;

public Produse(String nume, String tip, String cod,double pret,int stoc){
    this.numeProdus = nume;
    this.tipProdus = tip;
    this.codProdus =cod;
    this.pret = pret;
    this.stocP = stoc;
}

public String getNumeProdus(){
    return numeProdus;
}

public String getTipProdus(){
    return tipProdus;
}

public String getCodProdus(){
    return codProdus;
}


}
