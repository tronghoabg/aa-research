package com.waze.z.a;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45666a;

    /* renamed from: b, reason: collision with root package name */
    int f45667b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ as f45668c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Animatable f45669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(as asVar, Animatable animatable, h.c.e eVar) {
        super(2, eVar);
        this.f45668c = asVar;
        this.f45669d = animatable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aq(this.f45668c, this.f45669d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        if (r13 == r0) goto L15;
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
            int r1 = r12.f45667b
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            e.b.c.b(r13)
            goto L72
        Lf:
            int r1 = r12.f45666a
            e.b.c.b(r13)
            goto L4c
        L15:
            e.b.c.b(r13)
            com.waze.z.a.as r13 = r12.f45668c
            long r4 = r13.b()
            long r6 = r13.a()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r4
            float r1 = (float) r6
            float r4 = (float) r8
            float r4 = r4 / r1
            float r1 = h.k.n.f(r4, r3)
            float r4 = r3 - r1
            long r5 = r13.a()
            float r13 = (float) r5
            androidx.compose.animation.core.Animatable r5 = r12.f45669d
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r1 = r12
            h.c.e r1 = (h.c.e) r1
            float r4 = r4 * r13
            int r13 = (int) r4
            r12.f45666a = r13
            r12.f45667b = r2
            java.lang.Object r1 = r5.snapTo(r6, r1)
            if (r1 == r0) goto L7c
            r1 = r13
        L4c:
            androidx.compose.animation.core.Animatable r4 = r12.f45669d
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            androidx.compose.animation.core.Easing r13 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r2 = 0
            r3 = 0
            r6 = 2
            androidx.compose.animation.core.TweenSpec r13 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r1, r3, r13, r6, r2)
            androidx.compose.animation.core.AnimationSpec r13 = (androidx.compose.animation.core.AnimationSpec) r13
            r9 = r12
            h.c.e r9 = (h.c.e) r9
            r12.f45667b = r6
            r10 = 12
            r11 = 0
            r7 = 0
            r8 = 0
            r6 = r13
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L72
            goto L7c
        L72:
            androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
            r13.getEndReason()
            androidx.compose.animation.core.AnimationEndReason r12 = androidx.compose.animation.core.AnimationEndReason.BoundReached
            h.ab r12 = h.ab.f48028a
            return r12
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.aq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
