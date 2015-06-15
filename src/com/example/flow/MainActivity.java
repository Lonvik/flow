package com.example.flow;


import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private FlowLayout mLayout;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
	}

	private void init() {
		mLayout = (FlowLayout) findViewById(R.id.ff_view);
		mLayout.setBackgroundResource(R.drawable.ic_launcher);
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("红色");
		arrayList.add("天蓝色");
		arrayList.add("红得发紫");
		arrayList.add("七彩色一大片");
		
		for(int i=0;i<arrayList.size();i++){
			textView = new TextView(getApplicationContext());
			String text = arrayList.get(i);
			textView.setText(text);
		}
		mLayout.addView(textView);
	}

	
}
