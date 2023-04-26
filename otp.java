package project;

public class otp {
    public static void main(String[] args) {
        sendSMS sms = new sendSMS();
        System.out.println(sms.sendSms());
    }
}
