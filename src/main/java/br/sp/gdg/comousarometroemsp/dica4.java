package br.sp.gdg.comousarometroemsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dica4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica4);
    }

    public void fromBegin(View v){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
        finish();
    }

    public void startTip5(View v){
        Intent it = new Intent(this,dica5.class);
        startActivity(it);
        finish();
    }
}
