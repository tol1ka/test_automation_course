package md.tekwill;

public class Main {

    public static void main(String... args) {

//---------------- ### tema pentru lectia 5 ### ----------------
        System.out.println("Hello world!\r\n");

//---------------- ### tema pentru lectia 6 ### ----------------

        // Encapsularea
        ContBancar testCont = new ContBancar();
        testCont.setNumarCont(111);
        testCont.setSold(200);
        System.out.println(testCont.getNumarCont());
        System.out.println(testCont.getSold() + "\r\n");

        // Mostenirea
        Masina testCar = new Masina();
        testCar.setCuloare("White");
        testCar.setNrRoti(8);
        testCar.setMarca("Mercedes");
        testCar.afiseazaDetaliiVehicul();

        // Polimorfism
        Caine oleg = new Caine();
        Pisica oxana = new Pisica();
        oleg.emiteSunet();
        oxana.emiteSunet();

        // Abstractie
        Triunghi testTriunghi = new Triunghi();
        Patrat testPatrat = new Patrat();
        testTriunghi.calculArie();
        testPatrat.calculArie();
    }
}
