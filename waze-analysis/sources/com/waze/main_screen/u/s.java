package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.bn.b f27733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.u.a.b f27734c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f27735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(com.waze.bn.b bVar, com.waze.main_screen.u.a.b bVar2, w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f27733b = bVar;
        this.f27734c = bVar2;
        this.f27735d = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f27733b, this.f27734c, this.f27735d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (kotlinx.coroutines.aj.q(h.o.a.m(r5.f27734c.a()), r5) == r0) goto L12;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f27732a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L12
            if (r1 == r3) goto Le
            e.b.c.b(r6)
            goto L47
        Le:
            e.b.c.b(r6)
            goto L31
        L12:
            e.b.c.b(r6)
            com.waze.bn.b r6 = r5.f27733b
            kotlinx.coroutines.b.ch r6 = r6.a()
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            com.waze.main_screen.u.p r1 = new com.waze.main_screen.u.p
            r4 = 0
            r1.<init>(r4, r2, r4)
            h.g.a.p r1 = (h.g.a.p) r1
            r4 = r5
            h.c.e r4 = (h.c.e) r4
            r5.f27732a = r3
            java.lang.Object r6 = kotlinx.coroutines.b.ai.k(r6, r1, r4)
            if (r6 != r0) goto L31
            goto L46
        L31:
            com.waze.main_screen.u.a.b r6 = r5.f27734c
            long r3 = r6.a()
            long r3 = h.o.a.m(r3)
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f27732a = r2
            java.lang.Object r6 = kotlinx.coroutines.aj.q(r3, r6)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            com.waze.main_screen.u.w r5 = r5.f27735d
            com.waze.main_screen.u.w.t(r5)
            kotlinx.coroutines.b.ch r6 = r5.a()
            java.lang.Object r6 = r6.d()
            boolean r6 = r6 instanceof com.waze.ui.u.s
            if (r6 == 0) goto L5f
            com.waze.ui.u.m r6 = com.waze.ui.u.m.f43462a
            com.waze.ui.u.p r6 = (com.waze.ui.u.p) r6
            r5.b(r6)
        L5f:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.u.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
