package ac.za.cput.entity.user;

import java.io.Serializable;

public class Order implements Serializable
{
    private String orderNum;
    private String clerkId;
    private String stockId;
    private String description;
    private String date;


    private Order()
    {
    }

    public Order(String orderNum, String clerkId, String stockId, String description, String date)
    {
        this.orderNum = orderNum;
        this.clerkId = clerkId;
        this.stockId = stockId;
        this.description = description;
        this.date = date;
    }


    public String getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(String orderNum)
    {
        this.orderNum = orderNum;
    }

    public String getClerkId()
    {
        return clerkId;
    }

    public void setClerkId(String clerkId)
    {
        this.clerkId = clerkId;
    }

    public String getStockId()
    {
        return stockId;
    }

    public void setStockId(String stockId)
    {
        this.stockId = stockId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }


    @Override
    public String toString()
    {
        return "Order{" +
                "orderNum='" + orderNum + '\'' +
                ", clerkId='" + clerkId + '\'' +
                ", stockId='" + stockId + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

