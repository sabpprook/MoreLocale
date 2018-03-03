package com.mars3712.morelocale;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$LocalePickerActivity")));
        finish();
    }
}
