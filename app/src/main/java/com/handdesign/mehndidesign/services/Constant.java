package com.handdesign.mehndidesign.services;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.view.Display;

import com.google.android.gms.ads.AdSize;

public class Constant {
    public static int interstitialLoadCount = 0;
    public static String ABOUT_URL = "https://shorifulislam377.top/";
    public static String POLICY_URL = "https://sites.google.com/view/mehendidesignapp/home";
    public static String CONTACT_URL = "https://shorifulislam377.top/";
    public static boolean isConnected(Context ctx) {
        ConnectivityManager connectivityManager = ((ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
    public static AdSize getAdSize(Activity ctx) {
        Display display = ctx.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(ctx, adWidth);
    }
}
