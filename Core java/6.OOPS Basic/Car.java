class Car {

    // Method to start the car
    void start() {
        System.out.println("Car has started.");
    }

    // Method to stop the car
    void stop() {
        System.out.println("Car has stopped.");
    }

    public static void main(String[] args) {
        // Create object
        Car c1 = new Car();

        // Call methods
        c1.start();
        c1.stop();
    }
}