package com.example.parcial2;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdaptadorEmpleado extends ArrayAdapter<String> {
    Activity contexto;
    String[] Empleado;
    Integer[] ImgEmpleado;
    ImageView imgEmp;
    TextView tvDatos;

    public AdaptadorEmpleado(Activity contexto,String[]Empleado,Integer[]ImgEmpleado){
        super(contexto, R.layout.empleado,Empleado);
        this.contexto=contexto;
        this.Empleado=Empleado;
        this.ImgEmpleado=ImgEmpleado;
    }

    public View getView(int posicion, View v, ViewGroup parent){
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.empleado,null,true);
        tvDatos=rowView.findViewById(R.id.tvDatos);

        imgEmp=rowView.findViewById(R.id.imgvEmpleado);
        tvDatos.setText(Empleado[posicion]);
        imgEmp.setImageResource(ImgEmpleado[posicion]);
        return rowView;






    }
}
