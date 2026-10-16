package com.google.android.datatransport.cct;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static void b(String str, String str2, Object obj) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strG = g(str);
        if (Log.isLoggable(strG, 6)) {
            Log.e(strG, str2, th);
        }
    }

    public static void e(String str, Object obj) {
        String strG = g("CctTransportBackend");
        if (Log.isLoggable(strG, 4)) {
            Log.i(strG, String.format(str, obj));
        }
    }

    public static void f(String str, Object obj) {
        String strG = g("CctTransportBackend");
        if (Log.isLoggable(strG, 5)) {
            Log.w(strG, String.format(str, obj));
        }
    }

    private static String g(String str) {
        return "TRuntime.".concat(str);
    }
}
