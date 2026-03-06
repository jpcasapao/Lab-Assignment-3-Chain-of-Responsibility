class HazardousWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous Waste Collector: Collected hazardous waste safely.");
            container.empty();
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}