package com.App.Shop_Ledger.Repository;

import com.App.Shop_Ledger.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface productRepo extends MongoRepository<Products, String > {

    @Query("{ $text: { $search: ?0 } }")
    List<Products> searchByFullText(String keyword);


    @Query("{$or: [ " +
            "{'prdName': { '$regex': ?0, '$options': 'i' }}, " +
            "{'category': { '$regex': ?0, '$options': 'i' }}" +
            "] }")

    List<Products> searchByPartialMatch(String keyword);

    List<Products> findByUserId(String userId);

}
