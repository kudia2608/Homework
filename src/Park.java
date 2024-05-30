public class Park {
    private Attraction[] attractions;
    private int maxAttractions;
    private int currentAttractionCount;

    public Park(int maxAttractions) {
        this.maxAttractions = maxAttractions;
        this.attractions = new Attraction[maxAttractions];
        this.currentAttractionCount = 0;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public void addAttraction(String name, String workingHours, int cost) {
        if (currentAttractionCount < maxAttractions) {
            attractions[currentAttractionCount++] = new Attraction(name, workingHours, cost);
            System.out.println("Attraction " + name + " added to the park.");
        } else {
            System.out.println("No more space in the park for new attractions.");
        }
    }

    public void listAttractions() {
        for (int i = 0; i < currentAttractionCount; i++) {
            attractions[i].printInfo();
            System.out.println();
        }
    }
}
