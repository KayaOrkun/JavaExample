package Logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data,String data1) {
        System.out.println("Mail Loglandı.."+"Product Name : "+data+ " / "+data1);

    }
}
