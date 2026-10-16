package defpackage;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class uyt {
    private static final yob a = yob.c("com/google/android/libraries/geo/systems/flogger/NoPiiLog");

    public static void a(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("android.util.Log").getMethod("w", String.class, String.class).invoke(null, "GMM-SatelliteConnectivity", str);
        } catch (ReflectiveOperationException e) {
            ((ynz) ((ynz) a.a(uys.a).p(e)).ai((char) 9726)).u("Failed to log to Logcat");
        }
    }
}
