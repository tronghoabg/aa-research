package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j2, e<? super LazyLayoutItemAnimation$animatePlacementDelta$1> eVar) {
        super(2, eVar);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j2;
    }

    static final ab invokeSuspend$lambda$0(LazyLayoutItemAnimation lazyLayoutItemAnimation, long j2, Animatable animatable) {
        lazyLayoutItemAnimation.m2934setPlacementDeltagyyYBs(IntOffset.m11299minusqkQi6aY(((IntOffset) animatable.getValue()).m11305unboximpl(), j2));
        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r13.this$0.placementDeltaAnimation, androidx.compose.ui.unit.IntOffset.m11287boximpl(r3), r1, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$$ExternalSyntheticLambda0(r14, r3), r13, 4, null) != r0) goto L31;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            e.b.c.b(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            goto Laa
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L19:
            java.lang.Object r1 = r13.L$0
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            e.b.c.b(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            goto L65
        L21:
            e.b.c.b(r14)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.Animatable r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            boolean r14 = r14.isRunning()     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r1 = r13.$spec
            if (r14 == 0) goto L3f
            boolean r14 = r1 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> Lb5
            if (r14 == 0) goto L39
            androidx.compose.animation.core.SpringSpec r1 = (androidx.compose.animation.core.SpringSpec) r1     // Catch: java.util.concurrent.CancellationException -> Lb5
            goto L3d
        L39:
            androidx.compose.animation.core.SpringSpec r1 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.access$getInterruptionSpec$p()     // Catch: java.util.concurrent.CancellationException -> Lb5
        L3d:
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1     // Catch: java.util.concurrent.CancellationException -> Lb5
        L3f:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.Animatable r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            boolean r14 = r14.isRunning()     // Catch: java.util.concurrent.CancellationException -> Lb5
            if (r14 != 0) goto L6e
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.Animatable r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            long r4 = r13.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.ui.unit.IntOffset.m11287boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> Lb5
            r5 = r13
            h.c.e r5 = (h.c.e) r5     // Catch: java.util.concurrent.CancellationException -> Lb5
            r13.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> Lb5
            r13.label = r3     // Catch: java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r14 = r14.snapTo(r4, r5)     // Catch: java.util.concurrent.CancellationException -> Lb5
            if (r14 != r0) goto L65
            goto La9
        L65:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            h.g.a.a r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            r14.invoke()     // Catch: java.util.concurrent.CancellationException -> Lb5
        L6e:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.Animatable r14 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r14 = r14.getValue()     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.ui.unit.IntOffset r14 = (androidx.compose.ui.unit.IntOffset) r14     // Catch: java.util.concurrent.CancellationException -> Lb5
            long r3 = r14.m11305unboximpl()     // Catch: java.util.concurrent.CancellationException -> Lb5
            long r5 = r13.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lb5
            long r3 = androidx.compose.ui.unit.IntOffset.m11299minusqkQi6aY(r3, r5)     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.animation.core.Animatable r5 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r14)     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.ui.unit.IntOffset r6 = androidx.compose.ui.unit.IntOffset.m11287boximpl(r3)     // Catch: java.util.concurrent.CancellationException -> Lb5
            r7 = r1
            androidx.compose.animation.core.AnimationSpec r7 = (androidx.compose.animation.core.AnimationSpec) r7     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$$ExternalSyntheticLambda0 r9 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$$ExternalSyntheticLambda0     // Catch: java.util.concurrent.CancellationException -> Lb5
            r9.<init>()     // Catch: java.util.concurrent.CancellationException -> Lb5
            r10 = r13
            h.c.e r10 = (h.c.e) r10     // Catch: java.util.concurrent.CancellationException -> Lb5
            r14 = 0
            r13.L$0 = r14     // Catch: java.util.concurrent.CancellationException -> Lb5
            r13.label = r2     // Catch: java.util.concurrent.CancellationException -> Lb5
            r11 = 4
            r12 = 0
            r8 = 0
            java.lang.Object r14 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
            if (r14 != r0) goto Laa
        La9:
            return r0
        Laa:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r14 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            r0 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(r14, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r13.this$0     // Catch: java.util.concurrent.CancellationException -> Lb5
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(r13, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
        Lb5:
            h.ab r13 = h.ab.f48028a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
