package com.bytedance.sdk.openadsdk.orq;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class zjm {
    public static WeakReference<uef> uef;

    /* renamed from: oa, reason: collision with root package name */
    protected static final float[] f26090oa = new float[3];
    protected static final float[] yo = new float[3];
    protected static final float[] moa = new float[9];
    protected static final float[] lw = new float[3];

    public static void moa(Context context, SensorEventListener sensorEventListener, int i5) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<uef> weakReference = uef;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xs.uef("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void oa(Context context, SensorEventListener sensorEventListener, int i5) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<uef> weakReference = uef;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xs.uef("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void uef(Context context, SensorEventListener sensorEventListener) {
    }

    public static void yo(Context context, SensorEventListener sensorEventListener, int i5) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<uef> weakReference = uef;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xs.uef("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void uef(uef uefVar) {
        uef = new WeakReference<>(uefVar);
    }

    public static void uef(Context context, SensorEventListener sensorEventListener, int i5) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<uef> weakReference = uef;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xs.uef("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void uef(Context context, long j8) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j8);
    }
}
