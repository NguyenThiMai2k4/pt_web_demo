/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntm.repositores.impl;

import com.ntm.pojo.Product;
import com.ntm.sale_app.HibernateUtil;
import jakarta.persistence.Query;

import jakarta.persistence.criteria.*;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProductRepositoryImpl {
    public List<Product> getProducts (Map<String,String> params){
        try(Session s = HibernateUtil.getFACTORY().openSession()){
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery <Product> q= b.createQuery(Product.class);
            Root root = q.from(Product.class);
            q.select(root);
            Query query = s.createQuery(q);
            // query.setMaxResults(10);
             //query.setFirstResult(0);
            return query.getResultList();
        }
    }
}
