package mx.edu.tesoem.jrmg.p2aphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frm2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btonsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
         btonsig = (Button) findViewById(R.id.button2);
         btonsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent btong = new Intent(this,Frm3Activity.class);
        startActivity(btong);
        finish();
    }
}
