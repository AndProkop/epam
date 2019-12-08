package HW_3;

public class Transportation {
    private int idTransportation = 0;
    private static int i = 1;
    private int idGoods;
    private String typeOfTransport;
    private int quantityOfGoods;
    private int carrierName;
    private String departureName;
    private String destinationName;
    private String status;

    public Transportation(int idGoods, String typeOfTransport, int quantityOfGoods, int carrierName, String departureName, String destinationName, String status) {
        this.idTransportation += i;
        i++;
        this.idGoods = idGoods;
        this.typeOfTransport = typeOfTransport;
        this.quantityOfGoods = quantityOfGoods;
        this.carrierName = carrierName;
        this.departureName = departureName;
        this.destinationName = destinationName;
        this.status = status;
    }
}
