public class WasteManagementSystem {
    public static void main(String[] args) {
        // Create collectors
        WasteCollector organic = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();
        WasteCollector defaultCollector = new DefaultWasteCollector();

        // Build the chain: Organic -> Recyclable -> Hazardous -> Default
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);
        hazardous.setNextCollector(defaultCollector);

        System.out.println("=== AUTOMATED WASTE MANAGEMENT SYSTEM ===\n");

        // Test containers
        WasteContainer[] containers = {
            new WasteContainer("Organic", 100, 100),
            new WasteContainer("Recyclable", 80, 80),
            new WasteContainer("Hazardous", 50, 50),
            new WasteContainer("Organic", 60, 30),     // not full
            new WasteContainer("Electronic", 150, 150) // unknown type
        };

        for (int i = 0; i < containers.length; i++) {
            WasteContainer c = containers[i];
            System.out.println("Container #" + (i + 1) + ": " + c.getType() + 
                               " (" + (c.isFull() ? "FULL" : "not full") + ")");
            
            if (c.isFull()) {
                System.out.println("Triggering collection chain...");
                organic.collectWaste(c);
            } else {
                System.out.println("Not full, skipping.");
            }
            System.out.println("--------------------------------------------------");
        }
    }
}