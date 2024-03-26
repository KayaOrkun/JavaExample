package DataAccess;

import Entities.Product;

public class JdbcDataAcces implements ProductDuo{

    @Override
    public void add(Product product,Product product1) {
        System.out.println("JDBC DataAccess Tekniği ile veritabanına eklendi..");
    }
}
