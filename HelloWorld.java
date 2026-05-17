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


}
