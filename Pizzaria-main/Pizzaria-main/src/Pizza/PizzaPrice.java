package Pizza;

public class PizzaPrice {
    private float pricePortuguese = 35.50F;
    private float pricePepperoni = 40.00F;
    private float priceCheese= 30.50F;
    private float priceDelivery = 10.00F;
    private float priceCardInterest = 1.50F;

    public PizzaPrice() {
        this.pricePortuguese = pricePortuguese;
        this.pricePepperoni = pricePepperoni;
        this.priceCheese =  priceCheese;
        this.priceDelivery = priceDelivery;
        this.priceCardInterest = priceCardInterest;

    }

    public float getPriceCardInterest() {
        return priceCardInterest;
    }

    public void setPriceCardInterest(float priceCardInterest) {
        this.priceCardInterest = priceCardInterest;
    }

    public float getPriceDelivery() {
        return priceDelivery;
    }

    public void setPriceDelivery(int priceDelivery) {
        this.priceDelivery = priceDelivery;
    }

    public float getPricePortuguese() {
        return pricePortuguese;
    }

    public void setPricePortuguese(float pricePortuguese) {
        this.pricePortuguese = pricePortuguese;
    }

    public float getPricePepperoni() {
        return pricePepperoni;
    }

    public void setPricePepperoni(float pricePepperoni) {
        this.pricePepperoni = pricePepperoni;
    }

    public float getPriceCheese() {
        return priceCheese;
    }

    public void setPriceCheese(float priceCheese) {
        this.priceCheese = priceCheese;
    }
}
