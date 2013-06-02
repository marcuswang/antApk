package com.easymorse.antApk;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class AntApkActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        try {
            ApplicationInfo appInfo = getPackageManager().getApplicationInfo
                    (getPackageName(), PackageManager.GET_META_DATA);
           String qudao = appInfo.metaData.getString("qudao");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
