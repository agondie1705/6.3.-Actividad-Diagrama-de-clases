import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected List<Reparacion> historial = new ArrayList<>();
}