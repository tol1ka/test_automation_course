package md.tekwill;

public class ContBancar {

    //Constructor implicit cu parametri impliciti
    public ContBancar() {
        this.sold = 0;
        this.numarCont = 0;
    }

    //Constructor cu parametri
    public ContBancar(int numarCont, double sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    // NumarCont variable
    public int numarCont;

    // sold variable
    public double sold;

    // setter method for numarCont
    public void setNumarCont(int numarCont) {
        this.numarCont = numarCont;
    }

    // setter method for sold
    public void setSold(double sold) {
        this.sold = sold;
    }

    // getter method for NumarCont
    public int getNumarCont() {
        return numarCont;
    }

    // getter method for sold
    public double getSold() {
        return sold;
    }
}
