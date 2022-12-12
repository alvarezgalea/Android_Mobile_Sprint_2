package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sprint1.Adapters.ProductAdapter;
import com.example.sprint1.Entities.Product;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {

    private ListView listViewProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        arrayProducts = new ArrayList<>();

        Product product1 = new Product(R.drawable.producto1, "Producto1","Descripcion1",1000);
        Product product2 = new Product(R.drawable.producto2, "Producto2","Descripcion2",2000);
        Product product3 = new Product(R.drawable.producto3, "Producto3","Descripcion3",3000);
        Product product4 = new Product(R.drawable.producto4, "Producto4","Descripcion4",4000);
        Product product5 = new Product(R.drawable.producto5, "Producto5","Descripcion5",5000);
        Product product6 = new Product(R.drawable.producto6, "Producto6","Descripcion6",6000);
        Product product7 = new Product(R.drawable.producto7, "Producto7","Descripcion7",7000);
        Product product8 = new Product(R.drawable.producto8, "Producto8","Descripcion8",8000);
        Product product9 = new Product(R.drawable.producto9, "Producto9","Descripcion9",9000);

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
        arrayProducts.add(product4);
        arrayProducts.add(product5);
        arrayProducts.add(product6);
        arrayProducts.add(product7);
        arrayProducts.add(product8);
        arrayProducts.add(product9);

        productAdapter = new ProductAdapter(this,arrayProducts);
        listViewProducts.setAdapter(productAdapter);



    }
}