package ac.za.cput.entity.generic;

import java.util.Objects;

public class Stock {
    String stock_id,date,device_id,furniture_id;
    int quantity;

    public Stock(String stock_id, String date, String device_id, String furniture_id, int quantity) {
        this.stock_id = stock_id;
        this.date = date;
        this.device_id = device_id;
        this.furniture_id = furniture_id;
        this.quantity = quantity;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getFurniture_id() {
        return furniture_id;
    }

    public void setFurniture_id(String furniture_id) {
        this.furniture_id = furniture_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stock_id='" + stock_id + '\'' +
                ", date='" + date + '\'' +
                ", device_id='" + device_id + '\'' +
                ", furniture_id='" + furniture_id + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return quantity == stock.quantity &&
                stock_id.equals(stock.stock_id) &&
                Objects.equals(date, stock.date) &&
                Objects.equals(device_id, stock.device_id) &&
                Objects.equals(furniture_id, stock.furniture_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stock_id, date, device_id, furniture_id, quantity);
    }
}
