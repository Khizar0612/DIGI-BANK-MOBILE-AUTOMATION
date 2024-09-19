package tests;

public class OTPUtil {

	public static String[] extractDigits(String otp) {
        if (otp != null && otp.length() == 4) {
            return otp.split("");
        } else {
            throw new IllegalArgumentException("OTP must be a 4-digit number");
        }
    }
	
}
