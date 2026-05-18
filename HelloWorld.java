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