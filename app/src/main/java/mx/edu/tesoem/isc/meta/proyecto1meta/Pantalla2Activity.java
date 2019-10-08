package mx.edu.tesoem.isc.meta.proyecto1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Pantalla2Activity extends AppCompatActivity implements View.OnClickListener {
    Button boton_sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        boton_sig = (Button) findViewById(R.id.btn1);
        boton_sig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Intent btn1 = new Intent(this, Btn1Activity.class);
            startActivity(btn1);
            finish();
    }
    public void btn2(View v) {
        Intent btn2 = new Intent(this, Btn2Activity.class);
        startActivity(btn2);
        finish();
    }
    public void btn3(View v) {
        Intent btn3 = new Intent(this, Btn3Activity.class);
        startActivity(btn3);
        finish();
    }
    public void btn4(View v) {
        Intent btn4 = new Intent(this, Btn4Activity.class);
        startActivity(btn4);
        finish();
    }
    public void btn6(View v) {
        Intent btn6 = new Intent(this, Btn5Activity.class);
        startActivity(btn6);
        finish();
    }
    public void btn5(View v) {
        finish();
        System.exit(0);
    }
}

