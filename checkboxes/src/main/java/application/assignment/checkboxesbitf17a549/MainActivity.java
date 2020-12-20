package application.assignment.checkboxesbitf17a549;

import androidx.appcompat.app.AppCompatActivity;

import android.app.KeyguardManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox CB1, CB2, CB3;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewResults);

        CB1 = (CheckBox) findViewById(R.id.chkCB1);
        CB2 = (CheckBox) findViewById(R.id.chkCB2);
        CB3 = (CheckBox) findViewById(R.id.chkCB3);

        btn = (Button) findViewById(R.id.getBtn);

    }



        public void onCheckboxClicked(View view) {
            String result = "Selected Buttons:";
            if(CB1.isChecked()){
                result += "\nCB1 selected";
            }
            if(CB2.isChecked()){
                result += "\nCB2 selected";
            }
            if(CB3.isChecked()){
                result += "\nCB3 selected";
            }

            else
            {
                result += "\nnothing selected";
            }
            textView.setText(result);

            //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }
    }



