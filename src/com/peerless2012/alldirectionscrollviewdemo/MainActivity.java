package com.peerless2012.alldirectionscrollviewdemo;

import android.app.Activity;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class MainActivity extends Activity {
	private ScrollView scrollView;
	private HorizontalScrollView horizontalScrollView;
	StateListDrawable st;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
}
