package com.example.newproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.TestLooperManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {
    private Workoutexpert expert  = new Workoutexpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindWorkout(View view){
        TextView workouts=(TextView)findViewById(R.id.workout);
        Spinner workouttype=(Spinner)findViewById(R.id.workouttype);
        String workout=String.valueOf(workouttype.getSelectedItem());
        //workouts.setText(workout);
        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutsformatted =new StringBuilder();
        for(String work : workoutList){
            workoutsformatted.append(work).append('\n');
        }
        workouts.setText(workoutsformatted);
    }


}
