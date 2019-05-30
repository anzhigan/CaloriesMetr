package anzhigan.ru.calorymaniaand.DataBase;

import android.app.Application;
import android.arch.persistence.room.Room;

public class Repos extends Application {
    private FoodDataBase foodDataBase;
    private Repos instance;


    public Repos getInstance() {
        return instance;
    }

    public FoodDataBase getFoodDataBase() {
        return foodDataBase;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        foodDataBase = Room.databaseBuilder(this, FoodDataBase.class, "FoodDB")
                .allowMainThreadQueries().build();

    }



}
