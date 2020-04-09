import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESKeyGen {
 
 public static String generatePrivateKey() throws Exception {
  KeyGenerator keyGen = KeyGenerator.getInstance("AES");
  keyGen.init(128);
  SecretKey secretKey = keyGen.generateKey();
  String base64Encoded = Base64.getEncoder().encodeToString(secretKey.getEncoded());
  //String base64Decoded = new String(asBytes, StandardCharsets.UTF_8);
  
  return base64Encoded; 
 }
 
 public static void main(String[] args) throws Exception {
  String privateKey = generatePrivateKey();
  
  System.out.println("Private Key = " + privateKey);
 }
}
