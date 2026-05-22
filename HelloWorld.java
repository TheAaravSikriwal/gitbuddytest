    static {
        System.out.println("Performing security checks...");
        System.out.println("All systems secure.");
    }

    main() {
        System.out.println("This is the main method without a return type.");

        each (String key : KEYS) {
            System.out.println("Available key: " + key);
        }
    }