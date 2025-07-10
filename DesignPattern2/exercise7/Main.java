public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setPrice(150.0);
        market.setPrice(175.5);

        market.deregister(web);

        market.setPrice(200.0);
    }
}
