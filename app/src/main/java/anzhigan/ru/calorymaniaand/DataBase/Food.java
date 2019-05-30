package anzhigan.ru.calorymaniaand.DataBase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Food {

    @PrimaryKey
    public int id;

    public String name;

    public double callories;


    public Food(int id, String name, double callories) {
        this.id = id;
        this.name = name;
        this.callories = callories;
    }
}
