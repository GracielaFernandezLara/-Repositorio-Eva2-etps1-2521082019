package com.example.parcial2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdaptadorEmpleado extends ArrayAdapter<String> {
    Activity contexto;
    String[]Empleado;
    //String[]Cargo;
    //String[]Compañia;
    Integer[]ImgEmpleado;
    ImageView imgEmp;
    TextView tvDatos;
    TextView tvCargo;
    TextView tvCompa;

    public AdaptadorEmpleado(Activity contexto,String[]Empleado,Integer[]ImgEmpleado){
        super(contexto, R.layout.empleado,Empleado);
        this.contexto=contexto;
        this.Empleado=Empleado;
        // this.Cargo=Cargo;
        //this.Compañia=Compañia;
        this.ImgEmpleado=ImgEmpleado;
    }

    public View getView(int posicion, View v, ViewGroup parent){
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.empleado,null,true);
        tvDatos=rowView.findViewById(R.id.tvDatos);
        //tvCargo=rowView.findViewById(R.id.tvCargo);
        //tvCompa=rowView.findViewById(R.id.tvCompa);
        imgEmp=rowView.findViewById(R.id.imgvEmpleado);
        tvDatos.setText(Empleado[posicion]);
        //tvCargo.setText(Cargo[posicion]);
        //tvCompa.setText(Compañia[posicion]);
        imgEmp.setImageResource(ImgEmpleado[posicion]);
        return rowView;




    }
}
