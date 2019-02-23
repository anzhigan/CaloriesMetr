package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Age extends AppCompatActivity implements Assembly {

    EditText ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        ageText = (EditText) findViewById(R.id.ageText);
    }

    public void onClick(View v){
        data.setAge(Integer.parseInt(ageText.getText().toString()));
        Intent intent = new Intent(this, Height.class);
        startActivity(intent);
    }



}