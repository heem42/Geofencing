package lecture.experiments.modularization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.geofence.Geofencingg;
import com.example.location.LocationCheck2;
import com.example.location.MainInterface;

import lecture.experiments.screentime.ScreenTimeFunctionality;


public class MainActivity extends AppCompatActivity implements MainInterface {
    ScreenTimeFunctionality screenTimeFunctionality;
    /**
     *
     */
    LocationCheck2 locationCheck;
    Geofencingg geofencingg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenTimeFunctionality = new ScreenTimeFunctionality();
        locationCheck=new LocationCheck2();
        geofencingg=new Geofencingg();
    }

    public void startButton(View view) {
        screenTimeFunctionality.registerEvents(this);
       locationCheck.registerEvents(this);
       geofencingg.registerEvents(this);
    }
    @Override
    public void makeToast(String getinfo)
    {
        Toast.makeText(this, getinfo , Toast.LENGTH_LONG).show();

    }

    public void stopButton(View view) {
        screenTimeFunctionality.unregisterEvents(this);
    }
}
