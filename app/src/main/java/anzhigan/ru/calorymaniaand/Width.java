package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Width extends AppCompatActivity implements Assembly {
    ResultCalories result = new ResultCalories();
    EditText widthText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width);
        widthText = (EditText) findViewById(R.id.widthText);
    }

    public void onClick(View v){
        data.setWidth(Integer.parseInt(widthText.getText().toString()));
        Intent intent = new Intent(this, Finish.class);
        double Res = result.method(data.getGender());
        intent.putExtra("Res", Double.toString(Res));
        startActivity(intent);
    }
}
