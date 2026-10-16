package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final AnimationSpec<Float> animationSpec;

    public TargetApproachAnimation(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public Object approachAnimation(ScrollScope scrollScope, float f2, float f3, l<? super Float, ab> lVar, e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope, Math.abs(f2) * Math.signum(f3), f2, AnimationStateKt.AnimationState$default(0.0f, f3, 0L, 0L, false, 28, null), this.animationSpec, lVar, eVar);
        return objAnimateWithTarget == a.f48038a ? objAnimateWithTarget : (AnimationResult) objAnimateWithTarget;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f2, Float f3, l<? super Float, ab> lVar, e eVar) {
        return approachAnimation(scrollScope, f2.floatValue(), f3.floatValue(), lVar, (e<? super AnimationResult<Float, AnimationVector1D>>) eVar);
    }
}
