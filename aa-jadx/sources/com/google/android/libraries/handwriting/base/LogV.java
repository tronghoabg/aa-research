package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class LogV {
    private static int mLogVerbosity;

    public static java.lang.String arrayToString(float[] fArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    public static void i(int i, java.lang.String str, java.lang.String str2) {
        if (mLogVerbosity >= i) {
            android.util.Log.i(str, str2);
        }
    }

    public static int logVerbosity() {
        return mLogVerbosity;
    }

    public static void setLogVerbosity(int i) {
        mLogVerbosity = i;
    }

    public static void i(int i, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (mLogVerbosity >= i) {
            android.util.Log.i(str, str2, th);
        }
    }

    public static <T> java.lang.String arrayToString(T[] tArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < tArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(tArr[i]);
        }
        return sb.toString();
    }

    public static java.lang.String arrayToString(short[] sArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append((int) sArr[i]);
        }
        return sb.toString();
    }
}
