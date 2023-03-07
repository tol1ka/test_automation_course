package md.tekwill;

public class Masina extends Vehicul{

    String marca;

//    @Override
//    public void setCuloare(String culoare) {
//        super.setCuloare(culoare);
//    }
//
//    @Override
//    public void setNrRoti(int nrRoti) {
//        this.nrRoti = nrRoti;
//    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void afiseazaDetaliiVehicul() {
        super.afiseazaDetaliiVehicul();
        System.out.println("Marca: " + this.marca + "\r\n");
    }
}
