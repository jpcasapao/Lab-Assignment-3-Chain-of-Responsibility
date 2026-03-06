class DefaultWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        System.out.println("Default Collector: No specific handler for '" + 
                          container.getType() + "' waste. Manual intervention required!");
    }
}