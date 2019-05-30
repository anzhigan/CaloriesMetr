package anzhigan.ru.calorymaniaand.DataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {Food.class}, version = 1)
public abstract class FoodDataBase extends RoomDatabase {

    public abstract FoodDao getFoodDao();

}
