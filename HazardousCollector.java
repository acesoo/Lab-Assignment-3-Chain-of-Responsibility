public class HazardousCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.HAZARDOUS;
    }

    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Hazardous Collector: DISPATCHING SPECIALIZED UNIT for " + container.getCapacity() + " units of toxic waste.");
    }
}