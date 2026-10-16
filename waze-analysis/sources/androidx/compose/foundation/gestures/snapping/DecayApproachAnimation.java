package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DecayApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public DecayApproachAnimation(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public Object approachAnimation(ScrollScope scrollScope, float f2, float f3, l<? super Float, ab> lVar, e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
        Object objAnimateDecay = SnapFlingBehaviorKt.animateDecay(scrollScope, f2, AnimationStateKt.AnimationState$default(0.0f, f3, 0L, 0L, false, 28, null), this.decayAnimationSpec, lVar, eVar);
        return objAnimateDecay == a.f48038a ? objAnimateDecay : (AnimationResult) objAnimateDecay;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f2, Float f3, l<? super Float, ab> lVar, e eVar) {
        return approachAnimation(scrollScope, f2.floatValue(), f3.floatValue(), lVar, (e<? super AnimationResult<Float, AnimationVector1D>>) eVar);
    }
}
