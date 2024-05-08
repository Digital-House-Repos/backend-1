package c03.b;

import java.sql.Date;

public class BusquedaService implements IBusqueda {
    private VueloService vueloService;
    private HotelService hotelService;

    public BusquedaService() {
        this.vueloService = new VueloService();
        this.hotelService = new HotelService();
    }

    @Override
    public void buscarHotelVuelo(Date inicio, Date fin, String origen, String destino) {
        String vuelo = vueloService.buscarVuelo(inicio, fin, origen, destino);
        String hotel = hotelService.buscarHotel(destino);

        System.out.println("Vuelo y hotel encontrados");
        System.out.println(vuelo);
        System.out.println(hotel);
    }
}
