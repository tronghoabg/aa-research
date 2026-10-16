package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EdgeEffectCompat_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = dLog;
        DecelMinusOne = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float flingDistance(Density density, float f2) {
        float density2 = density.getDensity() * 386.0878f;
        float fAbs = Math.abs(f2) * Inflection;
        float f3 = PlatformFlingScrollFriction;
        double d2 = density2 * 160.0f * 0.84f;
        return (float) (f3 * d2 * Math.exp((DecelerationRate / DecelMinusOne) * Math.log(fAbs / (f3 * d2))));
    }
}
