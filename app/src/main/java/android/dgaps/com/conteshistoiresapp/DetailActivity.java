package android.dgaps.com.conteshistoiresapp;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String poem_title, poem_description,id;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        id = getIntent().getStringExtra(MainActivity.POEM_ID);
        poem_title = getIntent().getStringExtra(MainActivity.POEM_TITLE);
        TextView title = (TextView)findViewById(R.id.detail_title);
        title.setText(poem_title);
        poem_description = getIntent().getStringExtra(MainActivity.POEM_DESC);
        TextView description = (TextView)findViewById(R.id.detail_desc);
        description.setText(poem_description);


        seekBar = (SeekBar)findViewById(R.id.seekBar);
        mp1 = MediaPlayer.create(DetailActivity.this,R.raw.a);
        mp2 = MediaPlayer.create(DetailActivity.this,R.raw.b);
        mp3 = MediaPlayer.create(DetailActivity.this,R.raw.c);
        mp4 = MediaPlayer.create(DetailActivity.this,R.raw.d);
        mp5 = MediaPlayer.create(DetailActivity.this,R.raw.e);
        mp6 = MediaPlayer.create(DetailActivity.this,R.raw.f);
        mp7 = MediaPlayer.create(DetailActivity.this,R.raw.g);
        mp8 = MediaPlayer.create(DetailActivity.this,R.raw.h);
        mp9 = MediaPlayer.create(DetailActivity.this,R.raw.i);
        mp10 = MediaPlayer.create(DetailActivity.this,R.raw.j);
        ImageView on = (ImageView)findViewById(R.id.on);
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.equals("1")){
                    mp3.start();
                }
                else if (id.equals("2")){
                    mp4.start();
                }
                else if (id.equals("3")){
                    mp5.start();
                }
                else if (id.equals("3")){
                    mp6.start();
                }
                else if (id.equals("4")){
                    mp9.start();
                }
                else if (id.equals("5")){
                    mp3.start();
                }
                else if (id.equals("6")){
                    mp4.start();
                }
                else if (id.equals("7")){
                    mp5.start();
                }
                else if (id.equals("8")){
                    mp6.start();
                }
                else if (id.equals("9")){
                    mp9.start();
                }
                else {
                    mp3.start();
                }

            }
        });
        ImageView off = (ImageView)findViewById(R.id.off);
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.equals("1")){
                    mp3.pause();
                }
                else if (id.equals("2")){
                    mp4.pause();
                }
                else if (id.equals("3")){
                    mp5.pause();
                }
                else if (id.equals("3")){
                    mp6.pause();
                }
                else if (id.equals("4")){
                    mp9.pause();
                }
                else if (id.equals("5")){
                    mp3.pause();
                }
                else if (id.equals("6")){
                    mp4.pause();
                }
                else if (id.equals("7")){
                    mp5.pause();
                }
                else if (id.equals("8")){
                    mp6.pause();
                }
                else if (id.equals("9")){
                    mp9.pause();
                }
                else {
                    mp3.pause();
                }

            }
        });





    }


}
