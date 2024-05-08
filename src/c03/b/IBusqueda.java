package c03.b;

import java.sql.Date;

public interface IBusqueda {
    void buscarHotelVuelo(Date inicio, Date fin, String origen, String destino);
}
