package com.peerless2012.alldirectionscrollviewdemo;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	private ScrollView scrollView;
	private HorizontalScrollView horizontalScrollView;
	LinearLayout layout;
	TextView textView;
	StateListDrawable st;
	private View touchDelegateParent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		touchDelegateParent = findViewById(R.id.touch_delegate_parent);
		textView = (TextView) findViewById(R.id.touch_delegate_target);
		textView.setOnClickListener(this);
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		Log.i("MainActivity", "onWindowFocusChanged    " + hasFocus);
		if (hasFocus) {
			Rect rect = new Rect();
			int left = textView.getLeft();
			int top = textView.getTop();
			int right = textView.getRight();
			int bottom = textView.getBottom();
			int width = textView.getWidth();
			int height = textView.getHeight();
			rect.set(left - 100, top - 100, right +100, bottom +100);
			TouchDelegate delegate = new TouchDelegate(rect, textView);
			touchDelegateParent.setTouchDelegate(delegate);
		}
		super.onWindowFocusChanged(hasFocus);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.touch_delegate_target) {
			Toast.makeText(getApplicationContext(), "我被点击了",
					Toast.LENGTH_SHORT).show();
		}
	}
}
