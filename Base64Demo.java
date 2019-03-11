package java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Demo {
	public static void main(String[] args) {
		Encoder encoder=Base64.getEncoder();
		String normalString="username:password";
		String encodedString=encoder.encodeToString( normalString.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodedString);
		System.out.println("***************************");
		Base64.Decoder decoder=Base64.getDecoder();
		byte[] decodedByteArray=decoder.decode(encodedString);
		System.out.println(new String (decodedByteArray));
		
		
	}

}
