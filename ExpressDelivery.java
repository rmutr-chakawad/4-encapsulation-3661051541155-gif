class ExpressDelivery extends LogisticsService implements Deliverable {

    public ExpressDelivery() {
        super("Express Delivery");
    }

    @Override
    String getServiceType() {
        return "Fast and Premium Service";
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 50 + (weight * 10); // ค่าขนส่ง = 50 + (น้ำหนัก × 10)
    }
}
