package com.josepborrell.dibuixennegre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SingleTouchActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(new SingleTouchEventView(this, null));
  }
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    
    return true;
  }
} 