# 6.3.-Actividad-Diagrama-de-clases

## Justificación de Relaciones
* **Composición (Vehículo-Reparación):** He usado composición porque una reparación no existe fuera del contexto de un vehículo. Si eliminamos un vehículo del sistema, su historial de reparaciones se elimina con él.
* **Interfaz Especialista:** El uso de la interfaz permite que el `Taller` pueda trabajar con cualquier entidad que sepa reparar, facilitando el mantenimiento y permitiendo añadir nuevos tipos de mecánicos sin cambiar la lógica principal.

## Ingeniería Inversa
UML
![UML](DESIGN.md)
```mermaid
classDiagram
    class Especialista {
        <<interface>>
        +reparar(Vehiculo v) void
    }
    class Mecanico {
        +String nombre
        +reparar(Vehiculo v) void
    }
    class Cliente {
        +String nombre
        +List~Vehiculo~ vehiculos
    }
    class Vehiculo {
        <<abstract>>
        +String matricula
        +String modelo
        +List~Reparacion~ historial
    }
    class Coche { +int numPuertas }
    class Moto { +boolean tieneSidecar }
    class Reparacion {
        +int id
        +String descripcion
    }
    class Taller {
        +asignarTrabajo(Mecanico m, Vehiculo v) void
    }

    Especialista <|.. Mecanico
    Cliente "1" o-- "1..*" Vehiculo
    Vehiculo <|-- Coche
    Vehiculo <|-- Moto
    Vehiculo "1" *-- "0..*" Reparacion
    Taller ..> Mecanico

    Reparacion "1" -- "1" Factura : genera
```
