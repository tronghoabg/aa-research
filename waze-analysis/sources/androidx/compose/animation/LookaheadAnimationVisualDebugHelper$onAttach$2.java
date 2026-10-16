package androidx.compose.animation;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadAnimationVisualDebugHelper$onAttach$2 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ LookaheadAnimationVisualDebugHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookaheadAnimationVisualDebugHelper$onAttach$2(LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper, e<? super LookaheadAnimationVisualDebugHelper$onAttach$2> eVar) {
        super(2, eVar);
        this.this$0 = lookaheadAnimationVisualDebugHelper;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LookaheadAnimationVisualDebugHelper$onAttach$2(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LookaheadAnimationVisualDebugHelper$onAttach$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12.this$0.restartProgress, new java.lang.Float(1.0f), androidx.compose.animation.core.AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(1000, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0, 4, null), null, null, r12, 12, null) != r0) goto L15;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            e.b.c.b(r13)
            goto L6f
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L18:
            e.b.c.b(r13)
            goto L37
        L1c:
            e.b.c.b(r13)
            androidx.compose.animation.LookaheadAnimationVisualDebugHelper r13 = r12.this$0
            androidx.compose.animation.core.Animatable r13 = androidx.compose.animation.LookaheadAnimationVisualDebugHelper.access$getRestartProgress$p(r13)
            java.lang.Float r1 = new java.lang.Float
            r4 = 0
            r1.<init>(r4)
            r4 = r12
            h.c.e r4 = (h.c.e) r4
            r12.label = r2
            java.lang.Object r13 = r13.snapTo(r1, r4)
            if (r13 != r0) goto L37
            goto L72
        L37:
            androidx.compose.animation.LookaheadAnimationVisualDebugHelper r13 = r12.this$0
            androidx.compose.animation.core.Animatable r4 = androidx.compose.animation.LookaheadAnimationVisualDebugHelper.access$getRestartProgress$p(r13)
            java.lang.Float r5 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r13)
            androidx.compose.animation.core.Easing r13 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r1 = 0
            r2 = 1000(0x3e8, float:1.401E-42)
            r6 = 0
            androidx.compose.animation.core.TweenSpec r13 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r6, r13, r3, r1)
            r6 = r13
            androidx.compose.animation.core.DurationBasedAnimationSpec r6 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r6
            androidx.compose.animation.core.RepeatMode r7 = androidx.compose.animation.core.RepeatMode.Restart
            r10 = 4
            r11 = 0
            r8 = 0
            androidx.compose.animation.core.InfiniteRepeatableSpec r13 = androidx.compose.animation.core.AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(r6, r7, r8, r10, r11)
            r6 = r13
            androidx.compose.animation.core.AnimationSpec r6 = (androidx.compose.animation.core.AnimationSpec) r6
            r9 = r12
            h.c.e r9 = (h.c.e) r9
            r12.label = r3
            r10 = 12
            r7 = 0
            r8 = 0
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r12 == r0) goto L72
        L6f:
            h.ab r12 = h.ab.f48028a
            return r12
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.LookaheadAnimationVisualDebugHelper$onAttach$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
