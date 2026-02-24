public class OrganicCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.ORGANIC;
    }

    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Organic Collector: Composting " + container.getCapacity() + "kg of organic waste.");
    }
}