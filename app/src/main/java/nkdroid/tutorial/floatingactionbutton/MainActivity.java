package nkdroid.tutorial.floatingactionbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private FloatingActionButton mFloatingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFloatingButton= (FloatingActionButton) findViewById(R.id.btnFloatingAction);
        mFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello FAB", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
