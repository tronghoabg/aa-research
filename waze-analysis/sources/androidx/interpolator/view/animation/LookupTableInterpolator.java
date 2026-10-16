package androidx.interpolator.view.animation;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class LookupTableInterpolator {
    private LookupTableInterpolator() {
    }

    static float interpolate(float[] fArr, float f2, float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) ((r0 - 1) * f3), fArr.length - 2);
        float f4 = (f3 - (iMin * f2)) / f2;
        float f5 = fArr[iMin];
        return f5 + (f4 * (fArr[iMin + 1] - f5));
    }
}
