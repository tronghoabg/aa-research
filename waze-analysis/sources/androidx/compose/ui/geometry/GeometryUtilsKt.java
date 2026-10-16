package androidx.compose.ui.geometry;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f2, int i2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i2, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i3 = (int) f3;
        if (f3 - i3 >= 0.5f) {
            i3++;
        }
        float f4 = i3 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }
}
