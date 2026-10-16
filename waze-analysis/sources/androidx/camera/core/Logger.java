package androidx.camera.core;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(String str, String str2) {
        if (isLogLevelEnabled(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (isLogLevelEnabled(str, 6)) {
            Log.e(str, str2);
        }
    }

    static int getMinLogLevel() {
        return sMinLogLevel;
    }

    public static void i(String str, String str2) {
        if (isLogLevelEnabled(str, 4)) {
            Log.i(str, str2);
        }
    }

    public static boolean isDebugEnabled(String str) {
        return isLogLevelEnabled(str, 3);
    }

    public static boolean isErrorEnabled(String str) {
        return isLogLevelEnabled(str, 6);
    }

    public static boolean isInfoEnabled(String str) {
        return isLogLevelEnabled(str, 4);
    }

    private static boolean isLogLevelEnabled(String str, int i2) {
        return sMinLogLevel <= i2 || Log.isLoggable(str, i2);
    }

    public static boolean isVerboseEnabled(String str) {
        return isLogLevelEnabled(str, 2);
    }

    public static boolean isWarnEnabled(String str) {
        return isLogLevelEnabled(str, 5);
    }

    static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    static void setMinLogLevel(int i2) {
        sMinLogLevel = i2;
    }

    public static void w(String str, String str2) {
        if (isLogLevelEnabled(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static String truncateTag(String str) {
        return str;
    }
}
