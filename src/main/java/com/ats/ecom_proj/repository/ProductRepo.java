package com.ats.ecom_proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ats.ecom_proj.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}

/* 
insert into product(ID ,AVAILABLE ,BRAND ,CATEGORY, DESC,NAME ,PRICE ,QUANTITY ,RELEASE_DATE )
values(1123,true,'Boat','Electronics','Stylish wireless earphones','Airdopes 141',1200,100,'2024-01-10'),
(1223,true,'JBL','Electronics','Stylish wireless earphones','Live Pro 2',1150,90,'2023-04-05'),
(1201,true,'Penguin','Books','A classic gothic horror','Frankenstein',600,20,'2023-12-12'),
(1003,true,'Penguin','Books','Classic philosophy book','The underground man',800,20,'2023-10-01'),
(1412,true,'Hero','Vehicles','A classic motorbike for everyone','Splendor',90000,15,'2023-07-04'),
(1079,true,'Boat','Electronics','Bass-boosted wireless headphones','Rockerz 500',2100,87,'2024-01-01')

insert into product(ID ,AVAILABLE ,BRAND ,CATEGORY, DESC,NAME ,PRICE ,QUANTITY ,RELEASE_DATE )
values(true,'Boat','Electronics','Stylish wireless earphones','Airdopes 141',1200,100,'2024-01-10'),
(true,'JBL','Electronics','Stylish wireless earphones','Live Pro 2',1150,90,'2023-04-05'),
(true,'Penguin','Books','A classic gothic horror','Frankenstein',600,20,'2023-12-12'),
(true,'Penguin','Books','Classic philosophy book','The underground man',800,20,'2023-10-01'),
(true,'Hero','Vehicles','A classic motorbike for everyone','Splendor',90000,15,'2023-07-04'),
(true,'Boat','Electronics','Bass-boosted wireless headphones','Rockerz 500',2100,87,'2024-01-01')
*/
