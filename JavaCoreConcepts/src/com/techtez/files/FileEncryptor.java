package com.techtez.files;


		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.security.Key;
		import javax.crypto.Cipher;
		import javax.crypto.KeyGenerator;

		public class FileEncryptor {

		    public static void main(String[] args) {
		        String filePath = "c:\\FilesHandlingEx\\Bufferwriter.txt";
		        String password = "Heerendra_1234"; // Replace with actual password
		        
		        try {
		            File file = new File(filePath);
		            if (file.exists()) {
		                // Generate key from password
		                Key key = generateKey(password);
		                encryptFile(file, key);
		                System.out.println("File encrypted successfully.");
		            } else {
		                System.out.println("File does not exist.");
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    public static Key generateKey(String password) throws Exception {
		        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		        keyGen.init(256); // 256-bit AES encryption
		        Key key = keyGen.generateKey();
		        return key;
		    }

		    public static void encryptFile(File file, Key key) throws Exception {
		        Cipher cipher = Cipher.getInstance("AES");
		        cipher.init(Cipher.ENCRYPT_MODE, key);
		        
		        FileInputStream fis = new FileInputStream(file);
		        FileOutputStream fos = new FileOutputStream(file + ".enc");
		        
		        byte[] buffer = new byte[1024];
		        int bytesRead;
		        
		        while ((bytesRead = fis.read(buffer)) != -1) {
		            fos.write(cipher.update(buffer, 0, bytesRead));
		        }
		        
		        fos.write(cipher.doFinal());
		        fis.close();
		        fos.close();
		    }
	}


