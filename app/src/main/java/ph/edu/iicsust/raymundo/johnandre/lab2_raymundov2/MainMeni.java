package ph.edu.iicsust.raymundo.johnandre.lab2_raymundov2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMeni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_meni);

        Button constraintBtn = (Button)findViewById(R.id.button7);

        constraintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMeni.this, Constraint.class));
            }
        });

        Button linearBtn = (Button)findViewById(R.id.button9);

        linearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMeni.this, linear.class));
            }
        });

        Button relativeBtn = (Button)findViewById(R.id.button11);

        relativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMeni.this, Relative.class));
            }
        });







    }
}
