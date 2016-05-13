package demo.dot.com.addexistlibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import demo.dot.com.addexistlibrary.adapters.demoAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    Context context;
    ArrayList prgmName;

    public static String[] prgmNameList = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};

    public static final String EXTRAS_ENDLESS_MODE = "EXTRAS_ENDLESS_MODE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new demoAdapter(this, prgmNameList));
    }
}
