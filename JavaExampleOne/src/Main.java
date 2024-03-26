import Business.ProductManager;
import DataAccess.HibernateDataAcces;
import DataAccess.JdbcDataAcces;
import DataAccess.ProductDuo;
import Entities.Product;
import Logging.DataBaseLogger;
import Logging.FileLogger;
import Logging.Logger;
import Logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception{
        Product product = new Product("13 ProMax",1,50605);
        Product product1 = new Product("15 ProMax",2,4555);
        Logger[] loggers = {new DataBaseLogger(),new FileLogger(),new MailLogger()};
        ProductManager productManager = new ProductManager(new HibernateDataAcces(),loggers);
        productManager.add(product,product1);



    }
}