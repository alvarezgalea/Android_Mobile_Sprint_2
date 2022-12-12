package com.example.ProyectGrupo8.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ProyectGrupo8.Entities.Product;
import com.example.ProyectGrupo8.MainActivity3;
import com.example.ProyectGrupo8.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Product> arrayProducts;

    public ProductAdapter(Context context, ArrayList<Product> arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }

    @Override
    public int getCount() {
        return arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.product_template,null);

        ImageView imgProduct = (ImageView) view.findViewById(R.id.imgProduct);
        TextView textNameProduct = (TextView) view.findViewById(R.id.textNameProduct);
        TextView textDescriptionProduct = (TextView) view.findViewById(R.id.textDescriptionProduct);
        TextView textPriceProduct = (TextView) view.findViewById(R.id.textPriceProduct);

        Product product = arrayProducts.get(i);
        imgProduct.setImageResource((product.getImage()));
        textNameProduct.setText(product.getName());
        textDescriptionProduct.setText(product.getDescription());
        int Col = product.getPrice() * 5000;
        int Usd = product.getPrice();
        String prices = "Pesos"+Col+ " - " +" USD: "+ Usd;
        textPriceProduct.setText(prices);
        imgProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), MainActivity3.class);
                intent.putExtra("name",product.getName());
                intent.putExtra("description",product.getDescription());
                intent.putExtra("price",prices);
                intent.putExtra("image",product.getImage());

                context.startActivity(intent);
            }
        });

        return view;
    }
}
