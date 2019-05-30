package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Gender extends AppCompatActivity implements Assembly {

    EditText genderText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        genderText = (EditText) findViewById(R.id.genderText);
    }

    public void onClick(View v){
        data.setGender(genderText.getText().toString());
        Intent intent = new Intent(this, Age.class);
        startActivity(intent);
    }

}
