package androidx.compose.ui.unit.fontscaling;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MathUtils {
    public static final int $stable = 0;
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f2, float f3, float f4, float f5, float f6) {
        return lerp(f2, f3, Math.max(0.0f, Math.min(1.0f, lerpInv(f4, f5, f6))));
    }

    public final float lerp(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public final float lerpInv(float f2, float f3, float f4) {
        if (f2 == f3) {
            return 0.0f;
        }
        return (f4 - f2) / (f3 - f2);
    }
}
