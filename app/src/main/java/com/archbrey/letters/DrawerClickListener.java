package com.archbrey.letters;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class DrawerClickListener implements OnItemClickListener  {

    private static Context clickListenerContext;
    private AppItem[] appItemForListener;
    private static PackageManager pmForListener;

    public DrawerClickListener (Context c, AppItem[] appItem, PackageManager pm){
        clickListenerContext = c;
        appItemForListener=appItem;
        pmForListener = pm;
    } //public DrawerClickListener(Context c, MainActivity.AppItem[] appItem, PackageManager pm)


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Intent launchIntent = pmForListener.getLaunchIntentForPackage(appItemForListener[position].pkgname);

        AppItem launched;
            launched = new AppItem();
            launched= appItemForListener[position];
            new GetAppList().addRecentApp (launched);

            clickListenerContext.startActivity(launchIntent);

    }// public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)

} //public class DrawerClicklistener implements onItemClickListener