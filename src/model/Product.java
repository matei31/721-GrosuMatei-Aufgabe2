package model;

public class Product {
    private String name;
    private int preis;

    public Product(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }
}
