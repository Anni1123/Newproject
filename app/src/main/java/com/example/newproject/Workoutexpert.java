package com.example.newproject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Workoutexpert {
    List<String> getWorkouts(String workouttypes){
        List<String> workout=new ArrayList<String>();
        if(workouttypes.equals("Chest")){
        workout.add("Bench Press");
        workout.add("Cable Fiys");

        }
        else if (workouttypes.equals("Triceps")){
            workout.add("Tricep Ext");
            workout.add("Tricep PushDown");
        }
        else if (workouttypes.equals("Shoulders")){
            workout.add("Shouder Press");
            workout.add("Shouder Press up");
        }
        else if(workouttypes.equals("Biceps")){
            workout.add("Biceps Curis");
            workout.add("Cable Fiys");
        }
        return workout;
    }
}
