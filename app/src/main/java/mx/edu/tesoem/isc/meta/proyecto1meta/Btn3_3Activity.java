package mx.edu.tesoem.isc.meta.proyecto1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Btn3_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3_3);
    }
    public void Inicio(View v)
    {
        Intent Inicio=new Intent(this, Pantalla2Activity.class);
        startActivity(Inicio);
        finish();
    }
    public void Siguiente(View v)
    {
        Intent Siguiente=new Intent(this, Btn3Activity.class);
        startActivity(Siguiente);
        finish();
    }
}
