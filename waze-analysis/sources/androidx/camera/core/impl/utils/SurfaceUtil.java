package androidx.camera.core.impl.utils;

import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SurfaceUtil {
    public static final String JNI_LIB_NAME = "surface_util_jni";
    private static final String TAG = "SurfaceUtil";

    /* compiled from: WazeSource */
    public class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    static {
        System.loadLibrary(JNI_LIB_NAME);
    }

    private SurfaceUtil() {
    }

    public static SurfaceInfo getSurfaceInfo(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.format = iArrNativeGetSurfaceInfo[0];
        surfaceInfo.width = iArrNativeGetSurfaceInfo[1];
        surfaceInfo.height = iArrNativeGetSurfaceInfo[2];
        return surfaceInfo;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
