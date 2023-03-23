package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.parcial2.AdaptadorEmpleado.*;

public class MainActivity extends AppCompatActivity {
    String []Empleado={"Graciela Fernandez\n Estudiante UTEC",
            "Alexander Pierrot\n CEO\n Insures S.O.",
            "Carlos Lopez\n Asistente\n Hospital Blue.",
            "Sara Bonz\n Directora de Marketing\n Electrical Parts Itd",
            "Liliana Clarence\n Directora de Productos\n Creativa App.",
            "Benito Peralta\n Supervisor de Ventas\n Neumaticos Press",
            "Juan Jaramillo\n CEO\n Banco Nacional",
            "Christian Steps\n CTO\n Cooperativa Verde",
            "Alexa Giraldo\n Lead Programmer\n Frutisofy",
            "Linda Murillo\n Directora de Marketing\n Seguros Boliver",
            "Lizeth Astrada\n CEO\n Concesionario Motolox",


    };
    ListView lsvEmpleados;
    Integer[]ImgEmpleado={
            R.drawable.foto,
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorEmpleado adaptador = new AdaptadorEmpleado(this,Empleado,ImgEmpleado);
        lsvEmpleados=findViewById(R.id.lsvEmpleados);
        lsvEmpleados.setAdapter(adaptador);

        /*lsvEmpleados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int  posicion, long l) {
                Empleado = (Adaptador) parent.getItemAtPosition(posicion);
                Intent intent = new Intent(MainActivity.this, AdaptadorEmpleado.class);
                intent.putExtra("Empleado:", Empleado);
            }

        });*/


    }
}