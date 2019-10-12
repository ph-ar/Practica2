package mx.edu.tesoem.jrmg.p2aphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsig = (Button) findViewById(R.id.button);
        btnsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent bton = new Intent(this,Frm2Activity.class);
        startActivity(bton);
        finish();
    }
}
