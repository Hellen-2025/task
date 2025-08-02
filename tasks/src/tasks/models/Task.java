package tasks.models;

public class Task { 
    // Atributos
    private String name;
    private String description;
    private boolean status;

    // Constructor con parámetros
    public Task(String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    // Setters - Asignaciones
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Getters - Obtener
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getStatus() {
        return status;
    }
}


