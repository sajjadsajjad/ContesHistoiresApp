package android.dgaps.com.conteshistoiresapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Poem> data;
    public static final String POEM_TITLE = "poemTitle";
    public static  final String POEM_ID = "poemID";
    public static final int DETAIL_REQUEST_CODE = 1001;
    public static final String POEM_DESC = "poemDesc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = DataProvider.getData();
        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter arrayAdapter = new poemArrayAdapter(this,0,data);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Poem poem = data.get(position);
                displayActivity(poem);
            }
        });



    }

    public void displayActivity(Poem poem){

        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra(POEM_TITLE, poem.getPoem_title());
        intent.putExtra(POEM_ID,poem.getId());
        intent.putExtra(POEM_DESC,poem.getPoem_description());
        startActivityForResult(intent,DETAIL_REQUEST_CODE);



    }

    class poemArrayAdapter extends ArrayAdapter<Poem> {
        Context context;
        List<Poem> objects;
        public poemArrayAdapter(Context context, int resource, List<Poem> objects) {
            super(context, resource, objects);
            this.context = context;
            this.objects = objects;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Poem poem = data.get(position);
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.custom_layout,null);

            TextView title = (TextView)view.findViewById(R.id.title);
            ImageView image = (ImageView)view.findViewById(R.id.image);
            title.setText(poem.getPoem_title());
            int res = context.getResources().getIdentifier("image_" +poem.getId(), "drawable" , context.getPackageName());
            image.setImageResource(res);
            return view ;
        }
    }

}
