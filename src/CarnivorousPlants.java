/* Vätska: proteindryck
Formel: en basnivå på 0,1 liter per dag plus 0,2 liter gånger längden i meter
Exempel: en köttätande växt som är 50 cm hög behöver 0,1 + (0,2 × 0,5) = 0,2 liter per dag
*/

//Arv används, från planta
public class CarnivorousPlants extends Plants implements Waterable {
    public CarnivorousPlants(String name, double height) {
        super(name, height);
    }

    //Override på interface
    @Override
    public double calculateLiquid() {
        return height * 0.2 + 0.1;
    }
    @Override
    public String liquidType() {
        return "proteindryck";
    }
}