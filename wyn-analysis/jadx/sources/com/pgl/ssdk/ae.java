package com.pgl.ssdk;

import A7.AbstractC0279p0;
import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static int f32492a;

    /* renamed from: b, reason: collision with root package name */
    public static int f32493b;

    /* renamed from: c, reason: collision with root package name */
    public static int f32494c;

    /* renamed from: d, reason: collision with root package name */
    public static int f32495d;

    /* renamed from: e, reason: collision with root package name */
    public static int f32496e;

    /* renamed from: f, reason: collision with root package name */
    private static int f32497f;

    /* renamed from: g, reason: collision with root package name */
    private static int f32498g;

    /* renamed from: h, reason: collision with root package name */
    private static int f32499h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f32497f = (int) displayMetrics.density;
            f32496e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f32498g = (int) displayMetrics.xdpi;
            f32499h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f32492a = displayMetrics.widthPixels;
            f32493b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f32494c = mode.getPhysicalWidth();
            f32495d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i5 = -1;
        if (context != null) {
            try {
                i5 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i5);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f32496e);
        sb2.append("[<!>]");
        sb2.append(f32492a);
        sb2.append(",");
        sb2.append(f32493b);
        sb2.append("[<!>]");
        sb2.append(f32494c);
        sb2.append("x");
        return AbstractC0279p0.j(f32495d, "[<!>]", sb2);
    }
}
