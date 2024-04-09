package model;

public class Car {
    private Long id;
     private String model;
    private String color;
    public Car(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(Long id, String color, String model){
        this.id = id;
        this.model = model;
        this.color = color;
    }

}
