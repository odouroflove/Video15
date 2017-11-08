package txt.com.video15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        initDatePicker();
        initTimePicker();
    }

    public void initDatePicker(){
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(calendar.YEAR);
        final int month = calendar.get(calendar.MONTH);
        final int day = calendar.get(calendar.DAY_OF_MONTH);
        datePicker.init(1989, 01, 01, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                Toast.makeText(MainActivity.this,"Ngày "+day+" tháng "+month+" năm "+year, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void initTimePicker(){
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Toast.makeText(MainActivity.this,i+":"+i1,Toast.LENGTH_SHORT).show();
            }
            //Hoặc viết như bên dưới cũng đúng, với hourOfDay và Minute.
//            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int Minute){
//                Toast.makeText(MainActivity.this, hourOfDay+":"+Minute, Toast.LENGTH_SHORT).show();
//            }
        });

    }

}

