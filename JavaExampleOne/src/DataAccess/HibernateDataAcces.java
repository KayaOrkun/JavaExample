package DataAccess;

import Entities.Product;

public class HibernateDataAcces implements ProductDuo{
    @Override
    public void add(Product product,Product product1) {
        System.out.println("Hibernate DataAccess Tekniği ile veritabanına eklendi.. ");
    }
}
