package anzhigan.ru.calorymaniaand;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import anzhigan.ru.calorymaniaand.DataBase.Food;
import anzhigan.ru.calorymaniaand.DataBase.FoodDao;
import anzhigan.ru.calorymaniaand.DataBase.Repos;

public class Width extends AppCompatActivity implements Assembly {
    ResultCalories result = new ResultCalories();
    EditText widthText;
    FoodDao foodDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width);
        widthText = (EditText) findViewById(R.id.widthText);
        foodDao = ((Repos)getApplicationContext()).getFoodDataBase().getFoodDao();
        //def();
    }

    private void def(){
        foodDao.insert(new Food(0,"Meet", 3333));
        foodDao.insert(new Food(1,"Bread", 2222));
        foodDao.insert(new Food(2,"Tea", 1111));
    }


    public void onClick(View v){
        String typeOfFood = "lol";
        data.setWidth(Integer.parseInt(widthText.getText().toString()));
        Intent intent = new Intent(this, Finish.class);
        double Res = result.method(data.getGender());

        if(Res > 0 && Res < 500) typeOfFood = foodDao.getById(0).name;
        if(Res > 500 && Res < 1500) typeOfFood = foodDao.getById(1).name;
        if(Res > 1500 && Res < 100000) typeOfFood = foodDao.getById(2).name;


        intent.putExtra("Res", Double.toString(Res));
        intent.putExtra("Calories", typeOfFood);
        startActivity(intent);
    }

}
