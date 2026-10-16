package com.waze.gw;

import android.location.Location;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
final class WazeLocationBridge {
    private static final String TAG = "WazeGW-Location";
    private static Object deviceSource;
    private static boolean loggedReady;
    private static Method publish;
    private static Object sink;

    private WazeLocationBridge() {
    }

    static synchronized boolean publish(Location location) {
        if (location == null) {
            return false;
        }
        try {
            if (sink == null || deviceSource == null || publish == null) {
                resolve();
            }
            publish.invoke(sink, location, deviceSource);
            return true;
        } catch (Throwable th) {
            sink = null;
            deviceSource = null;
            publish = null;
            Log.w(TAG, "Waze location bridge unavailable: " + th.getClass().getSimpleName());
            return false;
        }
    }

    private static void resolve() throws Exception {
        Class<?> cls = Class.forName("com.waze.location.y");
        Object objInvoke = Class.forName("com.waze.web.r").getMethod(CmcdData.STREAMING_FORMAT_HLS, Class.class).invoke(null, cls);
        if (objInvoke == null) {
            throw new IllegalStateException("location sink unavailable");
        }
        Class<?> cls2 = Class.forName("com.waze.location.bf");
        Object obj = cls2.getField("c").get(null);
        Method method = cls.getMethod("d", Location.class, cls2);
        sink = objInvoke;
        deviceSource = obj;
        publish = method;
        if (!loggedReady) {
            loggedReady = true;
            Log.i(TAG, "Waze location bridge ready");
        }
    }
}
