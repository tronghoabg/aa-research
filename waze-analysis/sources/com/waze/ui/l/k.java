package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    long f42696a;

    /* renamed from: b, reason: collision with root package name */
    float f42697b;

    /* renamed from: c, reason: collision with root package name */
    int f42698c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ac f42699d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Animatable f42700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(ac acVar, Animatable animatable, h.c.e eVar) {
        super(2, eVar);
        this.f42699d = acVar;
        this.f42700e = animatable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f42699d, this.f42700e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r9, new java.lang.Float(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default((int) h.o.a.m(r7), 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, null, r17, 12, null) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
    
        if (r9.snapTo(new java.lang.Float(1.0f), r17) == r1) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f42698c
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            e.b.c.b(r18)
            goto Ld8
        L13:
            float r2 = r0.f42697b
            long r7 = r0.f42696a
            e.b.c.b(r18)
            goto L67
        L1b:
            e.b.c.b(r18)
            com.waze.ui.l.ac r2 = r0.f42699d
            int r7 = h.o.e.f48279a
            long r7 = h.o.e.c()
            long r9 = r2.b()
            long r7 = h.o.f.b(r7, r9)
            h.o.a r7 = h.o.a.z(r7)
            h.o.a r8 = h.o.a.z(r5)
            java.lang.Comparable r7 = h.k.n.o(r7, r8)
            h.o.a r7 = (h.o.a) r7
            long r7 = r7.w()
            long r9 = r2.a()
            double r11 = h.o.a.a(r7, r9)
            r13 = 0
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = h.k.n.d(r11, r13, r15)
            float r2 = (float) r9
            androidx.compose.animation.core.Animatable r9 = r0.f42700e
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r2)
            r11 = r0
            h.c.e r11 = (h.c.e) r11
            r0.f42696a = r7
            r0.f42697b = r2
            r0.f42698c = r3
            java.lang.Object r3 = r9.snapTo(r10, r11)
            if (r3 == r1) goto Ldb
        L67:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto Ld8
            com.waze.ui.l.ac r2 = r0.f42699d
            long r9 = r2.a()
            h.o.c r11 = h.o.a.f48264a
            int r9 = h.o.a.c(r9, r5)
            if (r9 <= 0) goto Ld8
            long r9 = r2.a()
            long r7 = h.o.a.q(r9, r7)
            h.o.a r2 = h.o.a.z(r7)
            h.o.a r7 = h.o.a.z(r5)
            java.lang.Comparable r2 = h.k.n.o(r2, r7)
            h.o.a r2 = (h.o.a) r2
            long r7 = r2.w()
            int r2 = h.o.a.c(r7, r5)
            androidx.compose.animation.core.Animatable r9 = r0.f42700e
            if (r2 <= 0) goto Lc6
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r3)
            long r2 = h.o.a.m(r7)
            int r2 = (int) r2
            androidx.compose.animation.core.Easing r3 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r5 = 0
            r6 = 0
            androidx.compose.animation.core.TweenSpec r2 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r6, r3, r4, r5)
            r11 = r2
            androidx.compose.animation.core.AnimationSpec r11 = (androidx.compose.animation.core.AnimationSpec) r11
            r14 = r0
            h.c.e r14 = (h.c.e) r14
            r0.f42698c = r4
            r15 = 12
            r16 = 0
            r12 = 0
            r13 = 0
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r1) goto Ld8
            goto Ldb
        Lc6:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r3)
            r3 = r0
            h.c.e r3 = (h.c.e) r3
            r4 = 3
            r0.f42698c = r4
            java.lang.Object r0 = r9.snapTo(r2, r3)
            if (r0 != r1) goto Ld8
            goto Ldb
        Ld8:
            h.ab r0 = h.ab.f48028a
            return r0
        Ldb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
