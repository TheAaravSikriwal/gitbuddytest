        static void decryptSecret(String encrypted, int key) {
                StringBuilder decrypted = new StringBuilder();
                for (char c : encrypted.toCharArray()) {
                        decrypted.append((char)(c - key)); // Reverse Caesar cipher
                }
                System.out.println("Decrypted secret: " + decrypted.toString());
        }
        
