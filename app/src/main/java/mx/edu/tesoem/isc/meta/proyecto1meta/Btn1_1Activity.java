package mx.edu.tesoem.isc.meta.proyecto1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Btn1_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1_1);
    }
    public void Inicio(View v)
    {
        Intent Inicio=new Intent(this, Pantalla2Activity.class);
        startActivity(Inicio);
        finish();
    }
    public void Regresar(View v)
    {
        Intent Atras= new Intent(this, Btn1Activity.class);
        startActivity(Atras);
        finish();
    }
}
