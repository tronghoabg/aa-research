package androidx.camera.camera2.internal;

import androidx.core.math.MathUtils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZoomMath {
    public static final ZoomMath INSTANCE = new ZoomMath();

    private ZoomMath() {
    }

    private final boolean areFloatsEqual(float f2, float f3) {
        return nearZero$camera_camera2(f2 - f3);
    }

    public final float getLinearZoomFromZoomRatio(float f2, float f3, float f4) {
        if (areFloatsEqual(f3, f4) || nearZero$camera_camera2(f2)) {
            return 0.0f;
        }
        if (areFloatsEqual(f2, f4)) {
            return 1.0f;
        }
        if (areFloatsEqual(f2, f3)) {
            return 0.0f;
        }
        float f5 = 1.0f / f3;
        return MathUtils.clamp((f5 - (1.0f / f2)) / (f5 - (1.0f / f4)), 0.0f, 1.0f);
    }

    public final float getZoomRatioFromLinearZoom(float f2, float f3, float f4) {
        if (areFloatsEqual(f2, 1.0f)) {
            return f4;
        }
        if (areFloatsEqual(f2, 0.0f)) {
            return f3;
        }
        float f5 = 1.0f / f3;
        return MathUtils.clamp(1.0f / (f5 - ((f5 - (1.0f / f4)) * f2)), f3, f4);
    }

    public final boolean nearZero$camera_camera2(float f2) {
        double dAbs = Math.abs(f2);
        double dUlp = Math.ulp(Math.abs(f2));
        return dAbs < dUlp + dUlp;
    }
}
