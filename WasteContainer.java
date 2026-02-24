public class WasteContainer {
    private WasteType type;
    private int capacity;
    private boolean isFull;

    public WasteContainer(WasteType type, int capacity, boolean isFull) {
        this.type = type;
        this.capacity = capacity;
        this.isFull = isFull;
    }

    public WasteType getType() { return type; }
    public int getCapacity() { return capacity; }
    public boolean isFull() { return isFull; }
}