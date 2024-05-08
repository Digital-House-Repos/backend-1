package c01.primero;

public class Areas {
    public static String calcularArea(String figura, int unidad) {
        String mensaje = "";
        if (unidad <= 0) {
            return "El valor de la unidad debe ser mayor a 0";
        }

        double resultado;
        switch (figura) {
            case "cuadrado":
                resultado = unidad * unidad;
                break;
            case "circulo":
                resultado = Math.PI * Math.pow(unidad, 2);
                break;
            default:
                return "Figura no disponible";
        }
        return "El area del " + figura + " es " + resultado + " unidades cuadradas";

    }
}
