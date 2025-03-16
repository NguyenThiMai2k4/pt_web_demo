/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ntm.sale_app;

import com.ntm.repositores.impl.CategoryRepositoryImpl;
import com.ntm.repositores.impl.ProductRepositoryImpl;

/**
 *
 * @author admin
 */
public class Sale_app {

    public static void main(String[] args) {
        CategoryRepositoryImpl s= new CategoryRepositoryImpl();
        s.getCates().forEach(c->System.out.println(c.getName()));
        
        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
        s2.getProducts(null).forEach(p-> System.out.printf("%d - %s: %.1f\n", p.getId(), p.getName(),p.getPrice()));
    }
}
