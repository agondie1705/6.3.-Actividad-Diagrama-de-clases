public class Mecanico implements Especialista {
    private String nombre;
    @Override
    public void reparar(Vehiculo v) { 
        System.out.println("Reparando vehículo...");
    }
}