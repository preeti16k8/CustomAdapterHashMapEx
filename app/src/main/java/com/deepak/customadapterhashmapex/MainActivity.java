package com.deepak.customadapterhashmapex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    //ArrayList<Course> arrayList;
    MyAdapter myAdapter;
    LinkedHashMap<String, String> linkedhashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        //arrayList = new ArrayList<Course>();
        linkedhashMap = new LinkedHashMap<String,String>();
        myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

        linkedhashMap.put("Csharp for freshers","Duration : 37 hrs \nAssignment : 14 hrs \nTest : 22 hrs");
        linkedhashMap.put("Csharp for professionals","Duration : 48 hrs \nAssignment : 18 hrs \nTest : 29 hrs");
        linkedhashMap.put("Java for freshers","Duration : 37 hrs \nAssignment : 14 hrs \nTest : 22 hrs");
        linkedhashMap.put("Java for professionals","Duration : 37 hrs \nAssignment : 14 hrs \nTest : 22 hrs");
        linkedhashMap.put("Android for freshers","Duration : 37 hrs \nAssignment : 14 hrs \nTest : 22 hrs");
        linkedhashMap.put("Android for professionals","Duration : 37 hrs \nAssignment : 14 hrs \nTest : 22 hrs");

        myAdapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String cname = new ArrayList<String>(linkedhashMap.keySet()).get(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("cnm",cname);
                startActivity(intent);
            }
        });
    }

    private class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return linkedhashMap.size();
        }

        @Override
        public Object getItem(int position) {
            return linkedhashMap.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            String cname = new ArrayList<String>(linkedhashMap.keySet()).get(position);
            String item = new ArrayList<String>(linkedhashMap.values()).get(position);
            //String item1 = hashMap.get(position);
            //HashMap<String,String> hm2 = hashMap.

            View view = getLayoutInflater().inflate(R.layout.row, null);
            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            //TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            //TextView textView4 = (TextView) view.findViewById(R.id.textView4);
            textView1.setText(cname);
            textView2.setText(item);
            //textView3.setText("Assignments : "+course.getCass());
            //textView4.setText("Test : "+course.getCtest());
            return view;
        }
    }
}
