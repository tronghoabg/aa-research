package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransformableStateKt$animatePanBy$3 extends g implements p<TransformScope, e<? super ab>, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ long $offset;
    final /* synthetic */ ap $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$3(ap apVar, long j2, AnimationSpec<Offset> animationSpec, long j3, e<? super TransformableStateKt$animatePanBy$3> eVar) {
        super(2, eVar);
        this.$previous = apVar;
        this.$offset = j2;
        this.$animationSpec = animationSpec;
        this.$centroid = j3;
    }

    static final ab invokeSuspend$lambda$0(ap apVar, TransformScope transformScope, long j2, AnimationScope animationScope) {
        TransformScope.CC.m2347transformByWithCentroidIEwrmTk$default(transformScope, j2, 0.0f, Offset.m7984minusMKHz9U(((Offset) animationScope.getValue()).m7990unboximpl(), apVar.f48104a), 0.0f, 10, null);
        apVar.f48104a = ((Offset) animationScope.getValue()).m7990unboximpl();
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TransformableStateKt$animatePanBy$3 transformableStateKt$animatePanBy$3 = new TransformableStateKt$animatePanBy$3(this.$previous, this.$offset, this.$animationSpec, this.$centroid, eVar);
        transformableStateKt$animatePanBy$3.L$0 = obj;
        return transformableStateKt$animatePanBy$3;
    }

    @Override // h.g.a.p
    public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
        return ((TransformableStateKt$animatePanBy$3) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m7969boximpl(this.$previous.f48104a), null, 0L, 0L, false, 60, null);
            long j2 = this.$offset;
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final ap apVar = this.$previous;
            final long j3 = this.$centroid;
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, Offset.m7969boximpl(j2), animationSpec, false, new l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$3$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return TransformableStateKt$animatePanBy$3.invokeSuspend$lambda$0(apVar, transformScope, j3, (AnimationScope) obj2);
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
