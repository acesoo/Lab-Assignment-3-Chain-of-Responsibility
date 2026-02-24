public class RecyclableCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.RECYCLABLE;
    }

    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Recyclable Collector: Sending " + container.getCapacity() + "L of materials to the sorting facility.");
    }
}