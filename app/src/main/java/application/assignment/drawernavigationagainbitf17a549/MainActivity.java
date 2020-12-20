package application.assignment.drawernavigationagainbitf17a549;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawernav);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_calc :
                        Toast.makeText(getApplicationContext(),"Calculator is Clicked",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,TestCalculatorClass.class);
                        startActivity(intent);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_qna :
                        Toast.makeText(getApplicationContext(),"Q and A is Clicked",Toast.LENGTH_LONG).show();
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });

    }
}