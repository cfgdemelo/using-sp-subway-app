package br.sp.gdg.comousarometroemsp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dica5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica5);
    }

    public void fromBegin(View v){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
        finish();
    }
    public void getIt(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        it.setData(Uri.parse("https://play.google.com/store/apps/details?id=br.com.metrosp.appmetro"));
        startActivity(it);
    }
}
