package com.bytedance.sdk.openadsdk.orq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class lw {
    public static int bcc = 2;
    public static int cz = 4;
    public static int dj = 16;
    public static int ivm = 0;
    protected static long lw = 15360;
    protected static int moa = 30;

    /* renamed from: oa, reason: collision with root package name */
    protected static String f26071oa = null;
    protected static String uef = "images";
    public static int wrv = 32;
    public static int xs = 1;
    protected static int yo = 1;
    public static int zjm = 8;

    public static boolean oa(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean uef(Context context, String str) {
        return false;
    }

    public static float oa(Context context) {
        return context == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap uef(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean uef(Context context, int i5) {
        boolean zUef;
        boolean zUef2;
        if (ivm == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zUef = uef(context, "android.permission.READ_MEDIA_IMAGES");
                zUef2 = true;
            } else {
                zUef = uef(context, "android.permission.READ_EXTERNAL_STORAGE");
                zUef2 = uef(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zUef3 = uef(context, "android.permission.CAMERA");
            boolean zUef4 = uef(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zUef && zUef2) {
                ivm |= xs;
            }
            if (zUef3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                ivm |= bcc;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                ivm |= cz;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                ivm |= zjm;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                ivm |= dj;
            }
            if (zUef4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                ivm |= wrv;
            }
        }
        return (ivm & i5) != 0;
    }

    public static boolean uef(Context context) {
        boolean z2;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 33) {
            z2 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z2 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z10 = false;
            }
            return !z10 && z2;
        }
        z10 = true;
        if (z10) {
        }
    }
}
