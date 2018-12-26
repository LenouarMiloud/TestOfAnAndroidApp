package anonymos.societe.com.imageslider;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new int[]{
            R.drawable.capture_1,
            R.drawable.capture_2,
            R.drawable.capture_3,
            R.drawable.capture_4,
            R.drawable.capture_5,
        };

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ImagePagerAdapter(MainActivity.this,images);
        viewPager.setAdapter(pagerAdapter);

    }
}
