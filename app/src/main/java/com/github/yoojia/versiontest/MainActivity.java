package com.github.yoojia.versiontest;

import android.app.Activity;
import android.os.Bundle;

import com.github.yoojia.versions.NextVersions;
import com.github.yoojia.versions.impl.JSONSource;

/**
 * Created by Yoojia.Chen
 * yoojia.chen@gmail.com
 * 2015-01-04
 */
public class MainActivity extends Activity{

    private NextVersions mNextVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNextVersions = new NextVersions(this);
        mNextVersions.addSource(new JSONSource("https://raw.githubusercontent.com/yoojia/AnyVersion/develop/version.json"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNextVersions.checkUpdate();
    }
}
