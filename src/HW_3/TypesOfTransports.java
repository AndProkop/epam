package HW_3;

public class TypesOfTransports {
    private String typeOfTransport;
    private float maxLenght;
    private float maxWidht;
    private float maxHeight;
    private float maxWeight;
    private boolean fragilePossibility;

    private TypesOfTransports(String typeOfTransport, float maxLenght, float maxWidht, float maxHeight, float maxWeight, boolean fragilePossibility) {
        this.typeOfTransport = typeOfTransport;
        this.maxLenght = maxLenght;
        this.maxWidht = maxWidht;
        this.maxHeight = maxHeight;
        this.maxWeight = maxWeight;
        this.fragilePossibility = fragilePossibility;
    }

    TypesOfTransports ship = new TypesOfTransports("ship", 10000, 10000, 10000, 100000, false);
    TypesOfTransports train = new TypesOfTransports("train", 2000, 2000, 2000, 20000, true);
    TypesOfTransports plane = new TypesOfTransports("2000", 5000, 5000, 5000, 50000, true);
    TypesOfTransports truck = new TypesOfTransports("truck", 1000, 1000, 1000, 10000, false);
}
