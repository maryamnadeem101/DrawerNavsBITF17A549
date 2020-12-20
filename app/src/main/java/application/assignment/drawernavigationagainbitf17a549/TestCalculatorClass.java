package application.assignment.drawernavigationagainbitf17a549;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class TestCalculatorClass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testcalcactivity);
        Toast.makeText(getApplicationContext(),"CalcActivity",Toast.LENGTH_LONG).show();

    }
}
