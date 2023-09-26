//Importing libraries
import javax.crypto.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;
//Class to create key(Symmetric)
public class symmetric {
    public static final String AES = "AES"; //Algorithm for encryption

    //Function to create a secret key(method)
    public static SecretKey createAESKey() throws Exception{
        //Create new instances for SecureRandom class
        SecureRandom securerandom = new SecureRandom();

        //Passing string to key generator
        KeyGenerator keygenerator = KeyGenerator.getInstance(AES);
        //initialize key gen with 256 bits
        keygenerator.init(256,securerandom);
        SecretKey key = keygenerator.generateKey();
        return key;

    }
    //Driver code
    public static void main(String[] args) throws Exception{
        SecretKey SymmetricKey = createAESKey();
        System.out.println("--Output--");
        System.out.println("Symmetric Key:" +DatatypeConverter.printHexBinary(SymmetricKey.getEncoded()));


    }
}
