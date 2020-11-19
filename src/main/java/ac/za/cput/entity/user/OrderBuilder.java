package ac.za.cput.entity.user;

public class OrderBuilder
{
    private String orderNum;
    private String clerkId;
    private String stockId;
    private String description;
    private String date;

    private OrderBuilder(){}

    public OrderBuilder(OrderBuilder.Builder builder)
    {
        this.orderNum = builder.orderNum;
        this.clerkId = builder.clerkId;
        this.stockId = builder.stockId;
        this.description = builder.description;
        this.date = builder.date;
    }


    public static class Builder
    {
        private String orderNum;
        private String clerkId;
        private String stockId;
        private String description;
        private String date;


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

        public Builder copy(OrderBuilder orderBuilder)
        {
            this.orderNum = orderBuilder.orderNum;
            this.clerkId = orderBuilder.clerkId;
            this.stockId = orderBuilder.stockId;
            this.description = orderBuilder.description;
            this.date = orderBuilder.date;
            return this;
        }

        public OrderBuilder build()
        {
            return new OrderBuilder(this);
        }
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

