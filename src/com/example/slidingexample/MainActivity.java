package com.example.slidingexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_hide_left:
				final View leftPane = findViewById(R.id.left_pane);
				if (leftPane.getVisibility() == View.GONE) {
					item.setTitle(R.string.hide_left_pane);
					leftPane.setVisibility(View.VISIBLE);
				} else {
					item.setTitle(R.string.show_left_pane);
					leftPane.setVisibility(View.GONE);
				}
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}
