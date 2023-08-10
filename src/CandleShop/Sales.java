package CandleShop;

import java.util.ArrayList;
import java.util.List;

public class Sales {
    private List<Candle> soldCandles;

    public Sales() {
        soldCandles = new ArrayList<>();
    }

    public void addSoldCandle(Candle candle) {
        soldCandles.add(candle);
    }

    public List<Candle> getSoldCandles() {
        return soldCandles;
    }
}
