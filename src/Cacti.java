/* Vätska: mineralvatten
Formel: 2 cl per dag
Storleken spelar ingen roll för en kaktus
*/

//Arv används, från planta
public class Cacti extends Plants implements Waterable {
    public Cacti(String name, double height) {
        super(name, height);
    }

    //Override på interface
    @Override
    public double calculateLiquid() {
        return 0.02;
    }
    @Override
    public String liquidType() {
        return "mineralvatten";
    }
}