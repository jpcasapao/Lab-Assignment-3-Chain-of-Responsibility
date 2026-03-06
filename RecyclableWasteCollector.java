class RecyclableWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable Waste Collector: Collected recyclable waste.");
            container.empty();
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}