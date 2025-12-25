abstract class LogisticsService {
    String serviceName;

    // Constructor
    public LogisticsService(String serviceName) {
        this.serviceName = serviceName;
    }

    // เมธอด abstract ที่จะต้องถูก implement ในคลาสลูก
    abstract String getServiceType();
}
