package tasks.models;

public class Task { 
     //Atributos
    private String name;
    private String description;
    private boolean status;

   
//Constructor con parametros
    public Task(String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;

        // el this hace referencia a los atributos de la clase
        // en este cado los atributos y los metodos

    }

    // Setters -Asignaciones

    public void setName(String name) { //metodo publico paea asignar el valor
        this.name = name; //Asignación
         
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    


    // Getters - Obtener
}
