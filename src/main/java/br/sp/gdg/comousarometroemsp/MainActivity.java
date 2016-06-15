package br.sp.gdg.comousarometroemsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startTip1(View v){
        Intent it = new Intent(this,dica1.class);
        startActivity(it);
        finish();
    }
}
