package c03.b;

import java.sql.Date;
import java.util.HashMap;

public class VueloService {
    private HashMap<String, Double> listaTipoVuelos = new HashMap<>();

    public VueloService() {
        listaTipoVuelos.put("Económico", 100.0);
        listaTipoVuelos.put("Ejecutivo", 200.0);
        listaTipoVuelos.put("Primera Clase", 300.0);
    }

    public String buscarVuelo(Date inicio, Date fin, String origen, String destino) {
        System.out.println("Buscando vuelo desde " + origen + " hasta " + destino + " desde " + inicio + " hasta " + fin);

        System.out.println("Tipos de vuelos disponibles:");
        listaTipoVuelos.forEach((tipo, precio) -> System.out.println(tipo + " - " + precio));

        System.out.println("Vuelo encontrado");
        System.out.println();
        return "Economico - 100.0 - 1 escala - 2 horas de vuelo";
    }
}
