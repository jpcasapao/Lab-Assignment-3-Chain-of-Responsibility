class WasteContainer {
    private String type;
    private int capacity;
    private int currentLevel;

    public WasteContainer(String type, int capacity, int currentLevel) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public String getType() {
        return type;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public void empty() {
        currentLevel = 0;
        System.out.println("Container emptied successfully!");
    }
}