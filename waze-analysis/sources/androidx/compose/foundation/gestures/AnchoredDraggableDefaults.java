package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final AnimationSpec<Float> SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    private static final l<Float, Float> PositionalThreshold = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Float.valueOf(AnchoredDraggableDefaults.PositionalThreshold$lambda$0(((Float) obj).floatValue()));
        }
    };
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    private AnchoredDraggableDefaults() {
    }

    static final float PositionalThreshold$lambda$0(float f2) {
        return f2 / 2.0f;
    }

    public final <T> TargetedFlingBehavior flingBehavior(AnchoredDraggableState<T> anchoredDraggableState, l<? super Float, Float> lVar, AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lVar = PositionalThreshold;
        }
        if ((i3 & 4) != 0) {
            animationSpec = SnapAnimationSpec;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952742024, i2, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1554)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i2 & 6) == 4) | composer.changed(density) | ((((i2 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i2 & 48) == 32) | composer.changed(animationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, lVar, animationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    public final l<Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }
}
