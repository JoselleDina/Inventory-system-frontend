package ac.za.cput.entity.equipment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

//JodiSmit

public class FurnitureTypeLookup {

    private String furnitureId;
    private String furnitureDescription;
    private double size;
    private String color;

    private FurnitureTypeLookup() {
    }

    public FurnitureTypeLookup(String furnitureId, String furnitureDescription, double size, String color) {
        this.furnitureId = furnitureId;
        this.furnitureDescription = furnitureDescription;
        this.size = size;
        this.color = color;
    }

    public FurnitureTypeLookup(String furnitureDescription, double size, String color) {
        this.furnitureDescription = furnitureDescription;
        this.size = size;
        this.color = color;
    }

    public String getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(String furnitureId) {
        this.furnitureId = furnitureId;
    }

    public String getFurnitureDescription() {
        return furnitureDescription;
    }

    public void setFurnitureDescription(String furnitureDescription) {
        this.furnitureDescription = furnitureDescription;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
