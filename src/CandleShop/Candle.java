package CandleShop;

public class Candle {
    private String name;
    private int quantity;
    private double burnTime;
    private double dollarPerBurnTime;
    private double price;

    public Candle(String name, int quantity, double burnTime, double dollarPerBurnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.dollarPerBurnTime = dollarPerBurnTime;
        this.price = price;
    }


}