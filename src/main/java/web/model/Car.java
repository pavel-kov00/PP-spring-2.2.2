package web.model;


import javax.persistence.*;
//
//@Entity
//@Table(name = "car_2_2")
public class Car {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String marka;
    private String model;
    private int series;

    public Car() {}

    public Car(String marka, String model, int series) {
        this.marka = marka;
        this.model = model;
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
