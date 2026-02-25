public class Factura {
    private double importe;
    private Reparacion reparacion;

    public Factura(Reparacion r, double total) {
        this.reparacion = r;
        this.importe = total;
    }
}
