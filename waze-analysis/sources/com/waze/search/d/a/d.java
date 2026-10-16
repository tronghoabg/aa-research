package com.waze.search.d.a;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements FlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    private final DecayAnimationSpec f35608a;

    public d(DecayAnimationSpec decayAnimationSpec) {
        x.f(decayAnimationSpec, "flingDecay");
        this.f35608a = decayAnimationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r22, float r23, h.c.e<? super java.lang.Float> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof com.waze.search.d.a.c
            if (r2 == 0) goto L17
            r2 = r1
            com.waze.search.d.a.c r2 = (com.waze.search.d.a.c) r2
            int r3 = r2.f35606c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35606c = r3
            goto L1c
        L17:
            com.waze.search.d.a.c r2 = new com.waze.search.d.a.c
            r2.<init>(r0, r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.f35604a
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r7.f35606c
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            h.g.b.an r0 = r7.f35607d
            r2 = r0
            h.g.b.an r2 = (h.g.b.an) r2
            e.b.c.b(r1)
            goto L7f
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            e.b.c.b(r1)
            float r1 = java.lang.Math.abs(r23)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L83
            h.g.b.an r11 = new h.g.b.an
            r11.<init>()
            r13 = r23
            r11.f48102a = r13
            h.g.b.an r9 = new h.g.b.an
            r9.<init>()
            r19 = 28
            r20 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r12, r13, r14, r16, r18, r19, r20)
            androidx.compose.animation.core.DecayAnimationSpec r0 = r0.f35608a
            com.waze.ads.c r6 = new com.waze.ads.c
            r12 = 15
            r13 = 0
            r10 = r22
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r7.f35607d = r11
            r7.f35606c = r4
            r8 = 2
            r9 = 0
            r5 = 0
            r4 = r0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == r2) goto L82
            r0 = r11
        L7f:
            float r0 = r0.f48102a
            goto L85
        L82:
            return r2
        L83:
            r0 = r23
        L85:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.d.a.d.performFling(androidx.compose.foundation.gestures.ScrollScope, float, h.c.e):java.lang.Object");
    }
}
