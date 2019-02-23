package anzhigan.ru.calorymaniaand;

import static java.lang.Math.round;

public class ResultCalories implements Assembly{
    private double Result;

    protected double method(String gender){
        switch(gender){
            case("Man"):
                Man man = new Man();
                Result = round(man.res(data.getHeight(), data.getWidth(), data.getAge()));
                break;
            case("Woman"):
                Woman woman = new Woman();
                Result = round(woman.res(data.getHeight(), data.getWidth(), data.getAge()));
                break;
            default:
                Result = 1234567;
                break;
        }
        return Result;
    }
}
