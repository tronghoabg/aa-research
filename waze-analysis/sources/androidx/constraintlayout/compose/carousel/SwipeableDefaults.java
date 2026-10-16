package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.SpringSpec;
import h.a.i;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = 125.0f;

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 10.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f2, f3);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m11645getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public final ResistanceConfig resistanceConfig(Set<Float> set, float f2, float f3) {
        if (set.size() <= 1) {
            return null;
        }
        Set<Float> set2 = set;
        Float fL = i.L(set2);
        x.c(fL);
        float fFloatValue = fL.floatValue();
        Float fM = i.M(set2);
        x.c(fM);
        return new ResistanceConfig(fFloatValue - fM.floatValue(), f2, f3);
    }
}
