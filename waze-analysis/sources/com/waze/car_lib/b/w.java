package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19141a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19142b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f19143c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f19144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ap apVar, kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        super(2, eVar);
        this.f19143c = apVar;
        this.f19144d = adVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        w wVar = new w(this.f19143c, this.f19144d, eVar);
        wVar.f19142b = obj;
        return wVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create((com.waze.an.a.r) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r12 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (com.waze.car_lib.b.ap.k(r12.f19143c, r12.f19144d, (com.waze.an.a.l) r13, r12) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (r12.f19144d.g(null, r12) == r0) goto L42;
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
            int r1 = r12.f19141a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L17
            if (r1 == r3) goto Le
            goto L17
        Le:
            java.lang.Object r12 = r12.f19142b
            com.waze.an.a.r r12 = (com.waze.an.a.r) r12
            e.b.c.b(r13)
            goto L93
        L17:
            e.b.c.b(r13)
            goto Lcf
        L1c:
            e.b.c.b(r13)
            java.lang.Object r13 = r12.f19142b
            com.waze.an.a.r r13 = (com.waze.an.a.r) r13
            boolean r1 = r13 instanceof com.waze.an.a.b
            r5 = 0
            if (r1 == 0) goto L7f
            com.waze.car_lib.b.ap r8 = r12.f19143c
            kotlinx.coroutines.a.ad r7 = r12.f19144d
            r10 = r13
            com.waze.an.a.b r10 = (com.waze.an.a.b) r10
            r13 = r12
            h.c.e r13 = (h.c.e) r13
            r12.f19141a = r4
            kotlinx.coroutines.b.ch r12 = r10.b()
            java.lang.Object r12 = r12.d()
            com.waze.j r12 = (com.waze.j) r12
            com.waze.g r12 = r12.c()
            if (r12 == 0) goto L52
            com.waze.f r12 = com.waze.f.f23757a
            r10.d(r12)
            java.lang.Object r12 = r7.g(r5, r13)
            if (r12 == r0) goto L7c
            h.ab r12 = h.ab.f48028a
            goto L7c
        L52:
            h.g.b.am r9 = new h.g.b.am
            r9.<init>()
            kotlinx.coroutines.b.ch r12 = r10.b()
            kotlinx.coroutines.b.k r12 = (kotlinx.coroutines.b.k) r12
            com.waze.car_lib.b.z r6 = new com.waze.car_lib.b.z
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            h.g.a.p r6 = (h.g.a.p) r6
            kotlinx.coroutines.b.k r12 = kotlinx.coroutines.b.ai.K(r12, r6)
            com.waze.car_lib.b.ad r1 = new com.waze.car_lib.b.ad
            r1.<init>(r9, r10, r5, r4)
            h.g.a.q r1 = (h.g.a.q) r1
            kotlinx.coroutines.b.k r12 = kotlinx.coroutines.b.ai.J(r12, r1)
            java.lang.Object r12 = kotlinx.coroutines.b.ai.d(r12, r13)
            if (r12 == r0) goto L7c
            h.ab r12 = h.ab.f48028a
        L7c:
            if (r12 != r0) goto Lcf
            goto Lce
        L7f:
            boolean r1 = r13 instanceof com.waze.an.a.a.j
            if (r1 == 0) goto L99
            kotlinx.coroutines.a.ad r1 = r12.f19144d
            r2 = r12
            h.c.e r2 = (h.c.e) r2
            r12.f19142b = r13
            r12.f19141a = r3
            java.lang.Object r12 = r1.g(r5, r2)
            if (r12 == r0) goto Lce
            r12 = r13
        L93:
            com.waze.an.a.a.j r12 = (com.waze.an.a.a.j) r12
            r12.f()
            goto Lcf
        L99:
            boolean r1 = r13 instanceof com.waze.an.a.l
            if (r1 == 0) goto Laf
            com.waze.car_lib.b.ap r1 = r12.f19143c
            kotlinx.coroutines.a.ad r3 = r12.f19144d
            com.waze.an.a.l r13 = (com.waze.an.a.l) r13
            r4 = r12
            h.c.e r4 = (h.c.e) r4
            r12.f19141a = r2
            java.lang.Object r12 = com.waze.car_lib.b.ap.k(r1, r3, r13, r4)
            if (r12 != r0) goto Lcf
            goto Lce
        Laf:
            boolean r1 = r13 instanceof com.waze.an.a.p
            if (r1 != 0) goto Lc0
            boolean r1 = r13 instanceof com.waze.an.a.q
            if (r1 != 0) goto Lc0
            if (r13 != 0) goto Lba
            goto Lc0
        Lba:
            h.i r12 = new h.i
            r12.<init>()
            throw r12
        Lc0:
            kotlinx.coroutines.a.ad r13 = r12.f19144d
            r1 = r12
            h.c.e r1 = (h.c.e) r1
            r2 = 4
            r12.f19141a = r2
            java.lang.Object r12 = r13.g(r5, r1)
            if (r12 != r0) goto Lcf
        Lce:
            return r0
        Lcf:
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.b.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
