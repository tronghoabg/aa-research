package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f17867a;

    /* renamed from: b, reason: collision with root package name */
    Object f17868b;

    /* renamed from: c, reason: collision with root package name */
    int f17869c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ am f17870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(am amVar, h.c.e eVar) {
        super(2, eVar);
        this.f17870d = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f17870d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r2.b(r1, r3, r7) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[LOOP:0: B:15:0x0081->B:17:0x0087, LOOP_END] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f17869c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L11
            e.b.c.b(r8)
            goto Lab
        L11:
            java.lang.Object r1 = r7.f17868b
            com.waze.sharedui.e.c r1 = (com.waze.sharedui.e.c) r1
            java.lang.Object r2 = r7.f17867a
            com.waze.bw.b.a.p r2 = (com.waze.bw.b.a.p) r2
            e.b.c.b(r8)
            goto L64
        L1d:
            e.b.c.b(r8)
            goto L39
        L21:
            e.b.c.b(r8)
            com.waze.bw.c.c.am r8 = r7.f17870d
            com.waze.sharedui.e.g r8 = com.waze.bw.c.c.am.k(r8)
            kotlinx.coroutines.b.k r8 = r8.d()
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f17869c = r3
            java.lang.Object r8 = kotlinx.coroutines.b.ai.h(r8, r1)
            if (r8 == r0) goto Lae
        L39:
            com.waze.bw.c.c.am r1 = r7.f17870d
            com.waze.sharedui.e.c r8 = (com.waze.sharedui.e.c) r8
            com.waze.bw.b.a.p r3 = com.waze.bw.c.c.am.m(r1)
            com.waze.av.b.ah r4 = com.waze.bw.c.c.am.e(r1)
            com.waze.shared_infra.q.e r1 = com.waze.bw.c.c.am.j(r1)
            long r5 = r1.a()
            kotlinx.coroutines.b.k r1 = com.waze.av.b.at.o(r4, r5)
            r4 = r7
            h.c.e r4 = (h.c.e) r4
            r7.f17867a = r3
            r7.f17868b = r8
            r7.f17869c = r2
            java.lang.Object r1 = kotlinx.coroutines.b.ai.h(r1, r4)
            if (r1 == r0) goto Lae
            r2 = r1
            r1 = r8
            r8 = r2
            r2 = r3
        L64:
            com.waze.bw.c.c.am r3 = r7.f17870d
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.waze.bw.c.a.j r3 = com.waze.bw.c.c.am.p(r3)
            int r3 = r3.a()
            java.util.List r8 = h.a.i.am(r8, r3)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L81:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r8.next()
            com.waze.av.b.aa r4 = (com.waze.av.b.aa) r4
            java.util.List r4 = a.a.I(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            h.a.i.aD(r3, r4)
            goto L81
        L97:
            java.util.List r3 = (java.util.List) r3
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r4 = 0
            r7.f17867a = r4
            r7.f17868b = r4
            r4 = 3
            r7.f17869c = r4
            java.lang.Object r7 = r2.b(r1, r3, r8)
            if (r7 != r0) goto Lab
            goto Lae
        Lab:
            h.ab r7 = h.ab.f48028a
            return r7
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.c.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
