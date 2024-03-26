package DataAccess;

import Entities.Product;

public class JpaDataAcces implements ProductDuo{
    @Override
    public void add(Product product,Product product1) {
        System.out.println("JPA DataAccess Tekniği ile veritabanına eklendi..");
    }
}
