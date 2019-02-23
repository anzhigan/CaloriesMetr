package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends AppCompatActivity implements Assembly{
    TextView finishText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        finishText = (TextView) findViewById(R.id.finishTextView);
        Intent intent = getIntent();
        String res = intent.getStringExtra("Res");
        finishText.setText("Вам необхожимо: " + res + "ккал");
    }
}
