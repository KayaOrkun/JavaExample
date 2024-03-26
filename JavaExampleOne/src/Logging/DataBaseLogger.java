package Logging;

public class DataBaseLogger implements Logger {

    @Override
    public void log(String data,String data1) {
        System.out.println("DataBase Loglandı.."+"Product Name : "+data+" / "+data1);

    }
}
