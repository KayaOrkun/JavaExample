package Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data,String data1) {
        System.out.println("File Loglandı.."+"Product Name : "+data+ " / "+data1);

    }
}
