public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void processRequest(WasteContainer container) {
        // Only process if the bin is actually full
        if (!container.isFull()) {
            System.out.println("Skipping: Bin is not full yet.");
            return;
        }

        if (canHandle(container)) {
            collect(container);
        } else if (nextCollector != null) {
            nextCollector.processRequest(container);
        } else {
            System.out.println("Error: No specialized collector for " + container.getType());
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void collect(WasteContainer container);
}