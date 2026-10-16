package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class aw {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f32552a;

    public static int a(Context context, String str, int i5) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i5) : i5;
    }

    public static void b(Context context, String str, int i5) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i5).apply();
        }
    }

    public static long a(Context context, String str, long j8) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getLong(str, j8) : j8;
    }

    public static void b(Context context, String str, long j8) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(str, j8).apply();
        }
    }

    public static SharedPreferences a(Context context) {
        if (f32552a == null) {
            f32552a = context.getSharedPreferences("ss_config", 0);
        }
        return f32552a;
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }
}
