package com.google.android.libraries.handwriting.base;

import android.util.Log;

/* loaded from: classes3.dex */
public class LogV {
    private static int mLogVerbosity;

    public static String arrayToString(float[] fArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    public static void i(int i, String str, String str2) {
        if (mLogVerbosity >= i) {
            Log.i(str, str2);
        }
    }

    public static int logVerbosity() {
        return mLogVerbosity;
    }

    public static void setLogVerbosity(int i) {
        mLogVerbosity = i;
    }

    public static void i(int i, String str, String str2, Throwable th) {
        if (mLogVerbosity >= i) {
            Log.i(str, str2, th);
        }
    }

    public static <T> String arrayToString(T[] tArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(tArr[i]);
        }
        return sb.toString();
    }

    public static String arrayToString(short[] sArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append((int) sArr[i]);
        }
        return sb.toString();
    }
}
