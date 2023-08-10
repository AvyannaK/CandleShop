package CandleShop;

public class CandleShop {
    public static void main(String[] args) {
        Candle candle1 = new Candle("Cozy Vanilla", 2, 5.0, 0.2, 10.0);
        Candle candle2 = new Candle("Sky Dreams", 3, 6.5, 0.25, 12.0);
        Candle candle3 = new Candle("GirlWorld", 1, 8.0, 0.3, 15.0);

        Inventory inventory = new Inventory();
        inventory.addCandle(candle1);
        inventory.addCandle(candle2);
        inventory.addCandle(candle3);

        Sales sales = new Sales();
        sales.addSoldCandle(candle1);
        sales.addSoldCandle(candle2);

        generateReceipt(sales);
    }

    public static void generateReceipt(Sales sales) {
    }
}

