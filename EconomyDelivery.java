class EconomyDelivery extends LogisticsService implements Deliverable {

    public EconomyDelivery() {
        super("Economy Delivery");
    }

    @Override
    String getServiceType() {
        return "Standard and Budget Service";
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 20 + (weight * 5); // ค่าขนส่ง = 20 + (น้ำหนัก × 5)
    }
}
