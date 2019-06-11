package net.llira.mexicankitchen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button btnViewSoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Inflate
        btnViewSoup = findViewById(R.id.btn_view_soup);
        btnViewSoup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSoup = new Intent(getApplicationContext(), SoupActivity.class);
                startActivity(iSoup);
            }
        });
    }
}
