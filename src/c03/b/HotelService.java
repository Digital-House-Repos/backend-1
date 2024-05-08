package c03.b;

import java.util.HashMap;

public class HotelService {
    private HashMap<String, Integer> listaHoteles = new HashMap<>();

    public HotelService() {
        listaHoteles.put("Hotel 1", 100);
        listaHoteles.put("Hotel 2", 200);
        listaHoteles.put("Hotel 3", 300);
    }

    public String buscarHotel(String ciudad) {
        System.out.println("Buscando hoteles en " + ciudad);

        System.out.println("Hoteles disponibles:");
        listaHoteles.forEach((hotel, precio) -> System.out.println(hotel + " - " + precio));

        System.out.println("Hotel encontrado");
        System.out.println();
        return "Hotel 1 - 100 - 4 estrellas - 2 noches";
    }
}
