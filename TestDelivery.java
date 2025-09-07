public class TestDelivery {
    public static void main(String[] args) {
        // สร้างออเดอร์ทดสอบน้ำหนักสินค้า 10 กก.
        double weight = 10.0;

        // สร้างออเดอร์ Express Delivery
        ExpressDelivery expressDelivery = new ExpressDelivery();
        System.out.println("Service: " + expressDelivery.serviceName);
        System.out.println("Service Type: " + expressDelivery.getServiceType());
        System.out.println("Shipping Cost (Express): " + expressDelivery.calculateShippingCost(weight));

        // สร้างออเดอร์ Economy Delivery
        EconomyDelivery economyDelivery = new EconomyDelivery();
        System.out.println("\nService: " + economyDelivery.serviceName);
        System.out.println("Service Type: " + economyDelivery.getServiceType());
        System.out.println("Shipping Cost (Economy): " + economyDelivery.calculateShippingCost(weight));
    }
}
