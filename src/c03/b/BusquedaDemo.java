package c03.b;

import java.sql.Date;

public class BusquedaDemo {
    public static void main(String[] args) {
        Date inicio = Date.valueOf("2021-12-01");
        Date fin = Date.valueOf("2021-12-03");

        BusquedaService busquedaService = new BusquedaService();
        busquedaService.buscarHotelVuelo(inicio, fin, "CDMX", "GDL");
    }
}
