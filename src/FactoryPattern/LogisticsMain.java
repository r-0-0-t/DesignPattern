package FactoryPattern;

public class LogisticsMain {

    public static String DELIVERY_ROAD = "road";
    public static String DELIVERY_SEA = "sea";

    public static void main(String[] args) {
        Product product;
        String stock = "Oil";

        Transport transport = null;
        String way = "road";

        if(way.equals(DELIVERY_ROAD))
            transport = new Truck(stock);
        else if(way.equals(DELIVERY_SEA))
            transport = new Ship(stock);

        product = transport.getProduct();
        System.out.println(product);
    }
}
