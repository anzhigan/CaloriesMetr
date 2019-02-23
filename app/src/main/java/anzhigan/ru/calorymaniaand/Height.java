package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Height extends AppCompatActivity implements Assembly {

    EditText heightText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
        heightText = (EditText) findViewById(R.id.heightText);
    }

    public void onClick(View v){
        data.setHeight(Integer.parseInt(heightText.getText().toString()));
        Intent intent = new Intent(this, Width.class);
        startActivity(intent);
    }
}