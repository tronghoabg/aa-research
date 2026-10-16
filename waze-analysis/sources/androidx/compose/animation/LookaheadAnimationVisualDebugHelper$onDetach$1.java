package androidx.compose.animation;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadAnimationVisualDebugHelper$onDetach$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ LookaheadAnimationVisualDebugHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookaheadAnimationVisualDebugHelper$onDetach$1(LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper, e<? super LookaheadAnimationVisualDebugHelper$onDetach$1> eVar) {
        super(2, eVar);
        this.this$0 = lookaheadAnimationVisualDebugHelper;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LookaheadAnimationVisualDebugHelper$onDetach$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LookaheadAnimationVisualDebugHelper$onDetach$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.this$0.restartProgress.stop(r4) != r0) goto L15;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r5)
            goto L42
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            e.b.c.b(r5)
            goto L31
        L1c:
            e.b.c.b(r5)
            androidx.compose.animation.LookaheadAnimationVisualDebugHelper r5 = r4.this$0
            androidx.compose.animation.core.Animatable r5 = androidx.compose.animation.LookaheadAnimationVisualDebugHelper.access$getReverseProgress$p(r5)
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r3
            java.lang.Object r5 = r5.stop(r1)
            if (r5 != r0) goto L31
            goto L45
        L31:
            androidx.compose.animation.LookaheadAnimationVisualDebugHelper r5 = r4.this$0
            androidx.compose.animation.core.Animatable r5 = androidx.compose.animation.LookaheadAnimationVisualDebugHelper.access$getRestartProgress$p(r5)
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r2
            java.lang.Object r4 = r5.stop(r1)
            if (r4 == r0) goto L45
        L42:
            h.ab r4 = h.ab.f48028a
            return r4
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.LookaheadAnimationVisualDebugHelper$onDetach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
