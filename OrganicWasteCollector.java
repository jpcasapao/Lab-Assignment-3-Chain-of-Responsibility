class OrganicWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Organic Waste Collector: Collected organic waste.");
            container.empty();
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}