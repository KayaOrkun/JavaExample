package Business;

import DataAccess.ProductDuo;
import Entities.Product;
import Logging.Logger;

public class ProductManager  {
    private ProductDuo productDuo;
    private Logger[] loggers;

    public ProductManager(ProductDuo productDuo,Logger[] loggers){
        this.productDuo = productDuo;
        this.loggers = loggers;
    }
    public void add(Product product,Product product1) throws Exception {
        if(product.getUnitPrice()<4000 && product1.getUnitPrice()<60000){
            throw new Exception("unitPrice birimi 40.000 küçük olamaz..");
        }
        productDuo.add(product,product1);
        for (Logger logger : loggers){
            logger.log(product.getName(),product1.getName());
        }
    }
}
