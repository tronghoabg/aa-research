package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MonoSplineKt {
    private static final boolean MonoSplineIsExtrapolate = true;

    public static final float hermiteDifferential(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        return (f2 * ((f6 - ((f3 + f3) * ((f6 + f6) + f7))) + (((f6 + f7) * 3.0f) * f8))) - (((f3 - f8) * 6.0f) * (f4 - f5));
    }

    public static final float hermiteInterpolate(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        float f9 = f3 - (f8 + f8);
        float f10 = f3 * f8;
        return ((((f2 * f6) * (f9 + f10)) + ((f7 * f2) * (f10 - f8))) + f4) - (((3.0f * f8) - (f10 + f10)) * (f4 - f5));
    }
}
