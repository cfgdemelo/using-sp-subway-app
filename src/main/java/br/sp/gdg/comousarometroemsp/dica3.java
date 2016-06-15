package br.sp.gdg.comousarometroemsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dica3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica3);
    }

    public void fromBegin(View v){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
        finish();
    }

    public void startTip4(View v){
        Intent it = new Intent(this,dica4.class);
        startActivity(it);
        finish();
    }
}
