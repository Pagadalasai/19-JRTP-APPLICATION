package in.ashokit;

import in.ashokit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PasswordService service = new PasswordService();
    	String encrypt = service.encrypt("Ashokit@123");
        System.out.println(encrypt);
        String decrypt = service.decrypt(encrypt);
        System.out.println(decrypt);
    }
}
