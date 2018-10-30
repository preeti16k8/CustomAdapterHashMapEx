package com.deepak.customadapterhashmapex;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SecondActivity extends AppCompatActivity {
    TextView textView5;
    ListView listView2;
    //ArrayList<Details> arrayList2;
    LinkedHashMap<String, String> linkedhashMap1;
    MyAdapters myAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView5 = (TextView) findViewById(R.id.textView5);
        listView2 = (ListView) findViewById(R.id.listView2);
        //arrayList2 = new ArrayList<Details>();
        linkedhashMap1 = new LinkedHashMap<String, String>();
        myAdapter2 = new MyAdapters();
        listView2.setAdapter(myAdapter2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cname = bundle.getString("cnm");
        textView5.setText(cname);

        if(cname.equals("Csharp for freshers")) {
            linkedhashMap1.put("1.  C# program compilation \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  C# data type \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  C# classes \n15:00", "9mdJV5-eias");
        }
        else if(cname.equals("Csharp for professionals")){
            linkedhashMap1.put("1.  C# program compilation \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  C# data type \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  C# classes \n15:00", "9mdJV5-eias");
        }
        else if(cname.equals("Java for freshers")){
            linkedhashMap1.put("1.  Java program compilation \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  Java data type \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  Java classes \n15:00", "9mdJV5-eias");
        }
        else if(cname.equals("Java for professionals")){
            linkedhashMap1.put("1.  Collections \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  Exceptions data type \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  Threads \n15:00", "9mdJV5-eias");
        }
        else if(cname.equals("Android for freshers")){
            linkedhashMap1.put("1.  Activity Lifecycle \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  Layouts \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  Passing Data Between screens \n15:00", "9mdJV5-eias");
        }
        else if(cname.equals("Android for professionals")){
            linkedhashMap1.put("1.  Adapters Introduction \n20:00", "SUtAfV2_3Kw");
            linkedhashMap1.put("2.  ArrayAdapter  \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  CustomAdapter \n30:00", "9mdJV5-eias");
        }

        myAdapter2.notifyDataSetChanged();
    }

    private class MyAdapters extends BaseAdapter{
        @Override
        public int getCount() {
            return linkedhashMap1.size();
        }

        @Override
        public Object getItem(int position) {
            return linkedhashMap1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            String topic = new ArrayList<String>(linkedhashMap1.keySet()).get(position);
            String vkey = new ArrayList<String>(linkedhashMap1.values()).get(position);

            View view2 = getLayoutInflater().inflate(R.layout.row2, null);
            //TextView textView6 = (TextView) view2.findViewById(R.id.textView6);
            TextView textView7 = (TextView) view2.findViewById(R.id.textView7);
            //TextView textView8 = (TextView) view2.findViewById(R.id.textView8);
            Button button2 = (Button) view2.findViewById(R.id.button);
            //textView6.setText(topic);
            textView7.setText(topic);
            //textView8.setText(d.getCdur());
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Details d = arrayList2.get(position);
                    String vkey = new ArrayList<String>(linkedhashMap1.values()).get(position);
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("vkey",vkey);
                    startActivity(intent);
                }
            });

            return view2;
        }
    }
}
