package skilleen.wasiwasimobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        Button calendarButton;
        calendarButton = (Button)findViewById(R.id.calendarbutton);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendarActivity = new Intent(HomeScreen.this, CalendarActivity.class);
                startActivity(calendarActivity);
            }
        });
    }
}
