public class AutomatedWasteSystem {
    public static void main(String[] args) {
        // 1. Initialize the specialized collectors
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // 2. Define the Chain Hierarchy
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // 3. Create simulated waste containers
        WasteContainer[] bins = {
            new WasteContainer(WasteType.ORGANIC, 40, true),
            new WasteContainer(WasteType.RECYCLABLE, 100, false), // Not full, should be skipped
            new WasteContainer(WasteType.HAZARDOUS, 5, true),
            new WasteContainer(WasteType.RECYCLABLE, 80, true)
        };

        // 4. Trigger the automated collection process
        System.out.println("=== Initializing Municipal Waste Collection Chain ===");
        for (WasteContainer bin : bins) {
            System.out.println("\nChecking bin type: " + bin.getType());
            organic.processRequest(bin);
        }
    }
}