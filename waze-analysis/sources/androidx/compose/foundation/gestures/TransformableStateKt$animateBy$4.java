package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransformableStateKt$animateBy$4 extends g implements p<TransformScope, e<? super ab>, Object> {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ aq<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateBy$4(aq<AnimationData> aqVar, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, long j2, e<? super TransformableStateKt$animateBy$4> eVar) {
        super(2, eVar);
        this.$previousState = aqVar;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
        this.$centroid = j2;
    }

    static final ab invokeSuspend$lambda$0(aq aqVar, TransformScope transformScope, long j2, AnimationScope animationScope) {
        transformScope.mo2171transformByWithCentroidIEwrmTk(j2, ((AnimationData) aqVar.f48105a).getZoom() == 0.0f ? 1.0f : ((AnimationData) animationScope.getValue()).getZoom() / ((AnimationData) aqVar.f48105a).getZoom(), Offset.m7984minusMKHz9U(((AnimationData) animationScope.getValue()).m2152getOffsetF1C5BW0(), ((AnimationData) aqVar.f48105a).m2152getOffsetF1C5BW0()), ((AnimationData) animationScope.getValue()).getDegrees() - ((AnimationData) aqVar.f48105a).getDegrees());
        aqVar.f48105a = animationScope.getValue();
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TransformableStateKt$animateBy$4 transformableStateKt$animateBy$4 = new TransformableStateKt$animateBy$4(this.$previousState, this.$targetState, this.$animationSpec, this.$centroid, eVar);
        transformableStateKt$animateBy$4.L$0 = obj;
        return transformableStateKt$animateBy$4;
    }

    @Override // h.g.a.p
    public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
        return ((TransformableStateKt$animateBy$4) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.f48105a, TransformableStateKt.ZeroAnimationVelocity, 0L, 0L, false, 56, null);
            AnimationData animationData = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final aq<AnimationData> aqVar = this.$previousState;
            final long j2 = this.$centroid;
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, animationData, delegatingAnimationSpec, false, new l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$4$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return TransformableStateKt$animateBy$4.invokeSuspend$lambda$0(aqVar, transformScope, j2, (AnimationScope) obj2);
                }
            }, this, 4, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
