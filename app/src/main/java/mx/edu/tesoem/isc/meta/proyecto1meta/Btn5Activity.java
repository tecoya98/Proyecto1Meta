package mx.edu.tesoem.isc.meta.proyecto1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Btn5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn5);
    }
    public void Regresar(View v)
    {
        Intent Atras= new Intent(this, Pantalla2Activity.class);
        startActivity(Atras);
        finish();
    }
    public void Sguiente(View v)
    {
        Intent Siguiente=new Intent(this, Btn5_5Activity.class);
        startActivity(Siguiente);
        finish();
    }
}
