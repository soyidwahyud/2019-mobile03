package id.ac.polinema.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    TextView teks1, teks2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teks1 = (TextView)findViewById(R.id.teks1);
        teks2 = (TextView)findViewById(R.id.teks2);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "font/lato_light.ttf");
        teks1.setTypeface(customFont);
        Typeface customFont2 = Typeface.createFromAsset(getAssets(), "font/lato_regular.ttf");
        teks2.setTypeface(customFont2);
    }
}
