package sg.edu.rp.c346.id18004536.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewVersion;
    ArrayList<AndroidVersion>  arrayListAV;
//    ArrayAdapter<AndroidVersion> arrayAdapterAV;
CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewVersion = findViewById(R.id.listViewVersion);

        arrayListAV = new ArrayList<>();

//        arrayAdapterAV = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListAV);

        adapter = new CustomAdapter(this, R.layout.row, arrayListAV);

        AndroidVersion item1 =new AndroidVersion("Pie","1.1");
        AndroidVersion item2 =new AndroidVersion("Oreo","12.1");
        AndroidVersion item3 =new AndroidVersion("Marshmallow","3.1");
        AndroidVersion item4 =new AndroidVersion("KitKat","4.1");
        AndroidVersion item5 =new AndroidVersion("Jelly Bean","5.1");

        arrayListAV.add(item1);
        arrayListAV.add(item2);
        arrayListAV.add(item3);
        arrayListAV.add(item4);
        arrayListAV.add(item5);

        listViewVersion.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }
}
