/* Vätska: kranvatten
Formel: 0,5 liter per dag gånger längden i meter
Exempel: en palm som är 3 meter hög behöver 0,5 × 3 = 1,5 liter per dag
*/

//Arv används, från planta
public class Palms extends Plants implements Waterable {
    public Palms(String name, double height) {
        super(name, height);
    }

    //Override på interface
        @Override
        public double calculateLiquid() {
            return height * 0.5;
        }

        @Override
        public String liquidType() {
        return "kranvatten";
    }
}