package md.tekwill;

public class Vehicul {

    public String culoare;
    public int nrRoti;

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul() {
        System.out.println("Culoarea este:" + this.culoare + "\r\n" + "Nr. de roti este: " + this.nrRoti);
    }
}
