package com.lnjr.viewpapertext1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hcwd on 2019/9/30.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollertor.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollertor.removeActivity(this);
    }
}
