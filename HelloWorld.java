public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int x = 9;
        int y = 10;

        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is: 21");


    }

    String secret;

        public void setSecret(String secret, int key) {
                this.secret = secret;
                this.secret = this.secret + key; // Simple obfuscation by appending the key
        }
        
        public String getSecret() {
                return secret;

        }

        public void revealSecret() {
                System.out.println("The secret is: " + secret);
        }

        static void encryptSecret(String secret, int key) {
                StringBuilder encrypted = new StringBuilder();
                for (char c : secret.toCharArray()) {
                        encrypted.append((char)(c + key)); // Simple Caesar cipher
                }
                System.out.println("Encrypted secret: " + encrypted.toString());
        }


}
