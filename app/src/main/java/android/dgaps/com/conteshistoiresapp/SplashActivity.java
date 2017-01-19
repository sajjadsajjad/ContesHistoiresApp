package android.dgaps.com.conteshistoiresapp;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        hidestatusbar();

        ImageView imageView = (ImageView)findViewById(R.id.splash);
        // imageView.animate().rotationX(360).setDuration(2000).start();


        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        else {
            View decorView = getWindow().getDecorView();
            // Hide Status Bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }

        new Handler().postDelayed(new Runnable() {

          /*
            * Showing splash screen with a timer. This will be useful when you
            * want to show case your app logo / company
            */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    public void hidestatusbar()
    {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}