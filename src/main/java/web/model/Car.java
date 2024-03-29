package web.model;

public class Car {

    private String model;
    private int Series;

    private int Price;

    //public Car() {}

    public Car(String model, int series, int price) {
        this.model = model;
        Series = series;
        Price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int series) {
        Series = series;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
