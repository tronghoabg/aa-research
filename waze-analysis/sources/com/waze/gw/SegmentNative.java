package com.waze.gw;

import android.util.Log;

/* loaded from: classes10.dex */
final class SegmentNative {
    private static final boolean LOADED;
    private static final String TAG = "WazeGW";

    private static native int configureSpeedDropFilterNative(boolean z);

    private static native long getCurrentServerSegmentId();

    static {
        boolean z;
        try {
            System.loadLibrary("wazegw");
            z = true;
        } catch (Throwable th) {
            Log.w(TAG, "native segment bridge unavailable: " + th.getClass().getSimpleName());
            z = false;
        }
        LOADED = z;
    }

    private SegmentNative() {
    }

    static long currentServerSegmentId() {
        if (!LOADED) {
            return -1L;
        }
        try {
            return getCurrentServerSegmentId();
        } catch (Throwable th) {
            return -1L;
        }
    }

    static int configureSpeedDropFilter(boolean z) {
        if (!LOADED) {
            return -1;
        }
        try {
            return configureSpeedDropFilterNative(z);
        } catch (Throwable th) {
            Log.w(TAG, "native speed-drop filter unavailable: " + th.getClass().getSimpleName());
            return -1;
        }
    }
}
