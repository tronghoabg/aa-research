package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            float f14 = 1.0f;
            if (i3 >= i2) {
                fArr2[i2] = 1.0f;
                fArr[i2] = 1.0f;
                return;
            }
            float f15 = 1.0f;
            while (true) {
                f2 = ((f15 - f12) / 2.0f) + f12;
                f3 = f14 - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f16 = (((f3 * P1) + (f2 * P2)) * f4) + f5;
                f6 = i3 / i2;
                f7 = f14;
                float f17 = f15;
                if (Math.abs(f16 - f6) < 1.0E-5d) {
                    break;
                }
                if (f16 > f6) {
                    f15 = f2;
                    f14 = f7;
                } else {
                    f12 = f2;
                    f14 = f7;
                    f15 = f17;
                }
            }
            float f18 = 0.5f;
            fArr[i3] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f19 = f7;
            while (true) {
                f8 = ((f19 - f13) / 2.0f) + f13;
                f9 = f7 - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f20 = (((f9 * f18) + f8) * f10) + f11;
                float f21 = f19;
                if (Math.abs(f20 - f6) >= 1.0E-5d) {
                    if (f20 > f6) {
                        f19 = f8;
                    } else {
                        f13 = f8;
                        f19 = f21;
                    }
                    f18 = 0.5f;
                }
            }
            fArr2[i3] = (f10 * ((f9 * P1) + (f8 * P2))) + f11;
            i3++;
        }
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
