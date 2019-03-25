package sohail.aziz.firebaseqrsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, LivePreviewActivity.class));
                    }
                });

        findViewById(R.id.button_show_dialog)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        QRDialogFragment dialogFragment=QRDialogFragment.newInstance();
                        FragmentManager fragmentManager= getSupportFragmentManager();

                        dialogFragment.show(fragmentManager, "dialog");
                    }
                });
    }
}
