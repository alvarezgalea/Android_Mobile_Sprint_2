package com.example.sprint1.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.sprint1.Entities.Producto;
import com.example.sprint1.MainActivity3;
import com.example.sprint1.R;
import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Producto> arrayProducts;

    public ProductAdapter(Context context, ArrayList<Producto> arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }

    @Override
    public int getCount() {

        return this.arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {

        return this.arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.product_template, null);

        Producto producto =  arrayProducts.get(i);

        Button btnProductTemplate = (Button) view.findViewById(R.id.btnProductTemplate);
        ImageView imgProductTemplate = (ImageView) view.findViewById(R.id.imgProductTemplate);
        TextView textNameTemplate = (TextView) view.findViewById(R.id.textNameTemplate);
        TextView textDescriptionTemplate = (TextView) view.findViewById(R.id.textDescriptionTemplate);
        TextView textPriceTemplate = (TextView) view.findViewById(R.id.textPriceTemplate);

        imgProductTemplate.setImageResource(producto.getImage());
        textNameTemplate.setText(producto.getName());
        textDescriptionTemplate.setText(producto.getDescription());
        textPriceTemplate.setText(String.valueOf(producto.getPrice()));

        btnProductTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), MainActivity3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("name",producto.getName());
                intent.putExtra("description",producto.getDescription());
                intent.putExtra("image",producto.getImage());
                context.startActivity(intent);
            }
        });
        return view;
    }
}