package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.sprint1.Adapters.ProductAdapter;
import com.example.sprint1.Entities.Producto;
import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {

    private ListView listViewProducts;
    private ArrayList<Producto> arrayProducts;
    private ProductAdapter productAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        arrayProducts = new ArrayList<>();
        Producto producto1 =new Producto(R.drawable.producto1_1,"Producto 1","Descripcion 1",1000);
        Producto producto2 =new Producto(R.drawable.producto2,"Producto 2","Descripcion 2",500);
        Producto producto3 =new Producto(R.drawable.producto3,"Producto 3","Descripcion 3",800);
        Producto producto4 =new Producto(R.drawable.producto4,"Producto 4","Descripcion 4",2000);
        Producto producto5 =new Producto(R.drawable.producto2_2,"Producto 5","Descripcion 5",3000);
        Producto producto6 =new Producto(R.drawable.prodcuto1,"Producto 6","Descripcion 6",4000);

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);


        productAdapter = new ProductAdapter(getApplicationContext(), arrayProducts);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        listViewProducts.setAdapter(productAdapter);



        /*
        //evento para el boton 1
        buttonProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("title",textProduct1.getText().toString());
                intent.putExtra("description","Delicioso alimento para Gatos Balanceado para tu Mascota.");
                intent.putExtra("imgCode",R.drawable.producto1_1);
                startActivity(intent);
            }
        });
        */





    }
}