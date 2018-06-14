package tarea2;

import java.util.ArrayList;

/**
 *
 * @author PJ129
 */
public class Tarea2 {

    public static void main(String[] args) {
        Carro mycar = new Carro("Mazda", 1990, 100);
        Carro mycar2 = new Carro("Toyota", 1986, 100);
        Carro mycar3 = new Carro("Jeep", 1986, 100);
        ArrayList<Carro> carList = new ArrayList<>();
        carList.add(mycar);
        carList.add(mycar2);
        carList.add(mycar3);
        int round = 1;
        while ((mycar.getAdvanced_Meters() < 1000) && (mycar2.getAdvanced_Meters() < 1000) && (mycar3.getAdvanced_Meters() < 1000)) {
            System.out.println("Vuelta numero: " + round);
            mycar.race();
            mycar2.race();
            mycar3.race();
            round++;
            System.out.println("");
        }
        for (int i = 0; i < carList.size(); i++) {
            if (i == 0) {
                int j = i + 1;
                int k = i + 2;
                if (carList.get(i).getAdvanced_Meters() > carList.get(j).getAdvanced_Meters() && carList.get(i).getAdvanced_Meters() > carList.get(k).getAdvanced_Meters()) {
                    System.out.println("El carro ganador es: " + mycar.getBrand());
                }
            }
            if (i == 1) {
                int j = i - 1;
                int k = i + 1;
                if (carList.get(i).getAdvanced_Meters() > carList.get(j).getAdvanced_Meters() && carList.get(i).getAdvanced_Meters() > carList.get(k).getAdvanced_Meters()) {
                    System.out.println("El carro ganador es: " + mycar2.getBrand());
                }
            }
            if (i == 2) {
                int j = i - 1;
                int k = i - 2;
                if (carList.get(i).getAdvanced_Meters() > carList.get(j).getAdvanced_Meters() && carList.get(i).getAdvanced_Meters() > carList.get(k).getAdvanced_Meters()) {
                    System.out.println("El carro ganador es: " + mycar3.getBrand());
                }
            }

        }
    }
}
