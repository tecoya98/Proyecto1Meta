package mx.edu.tesoem.isc.meta.proyecto1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Btn2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2);
    }
    public void Regresar(View v)
    {
        Intent Atras= new Intent(this, Pantalla2Activity.class);
        startActivity(Atras);
        finish();
    }
    public void Siguiente(View v)
    {
        Intent Siguiente=new Intent(this, Btn2_2Activity.class);
        startActivity(Siguiente);
        finish();
    }
}
