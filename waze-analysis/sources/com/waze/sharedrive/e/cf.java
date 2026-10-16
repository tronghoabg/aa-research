package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f38481a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ch f38483c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f38484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(h.c.e eVar, ch chVar) {
        super(3, eVar);
        this.f38483c = chVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        cf cfVar = new cf((h.c.e) obj3, this.f38483c);
        cfVar.f38484d = (kotlinx.coroutines.b.l) obj;
        cfVar.f38482b = obj2;
        return cfVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[RETURN] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f38481a
            if (r1 == 0) goto La
            e.b.c.b(r6)
            goto L4c
        La:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f38484d
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            java.lang.Object r1 = r5.f38482b
            r2 = r5
            h.c.e r2 = (h.c.e) r2
            com.waze.sharedrive.d.r r1 = (com.waze.sharedrive.d.r) r1
            boolean r3 = r1 instanceof com.waze.sharedrive.d.p
            r4 = 0
            if (r3 != 0) goto L35
            boolean r3 = r1 instanceof com.waze.sharedrive.d.q
            if (r3 == 0) goto L24
            com.waze.sharedrive.d.q r1 = (com.waze.sharedrive.d.q) r1
            goto L25
        L24:
            r1 = r4
        L25:
            if (r1 == 0) goto L2c
            com.waze.sharedrive.d.p r1 = r1.b()
            goto L2d
        L2c:
            r1 = r4
        L2d:
            if (r1 == 0) goto L30
            goto L35
        L30:
            kotlinx.coroutines.b.k r1 = kotlinx.coroutines.b.ai.G(r4)
            goto L42
        L35:
            com.waze.sharedrive.e.ch r1 = r5.f38483c
            com.waze.sharedrive.e.cd r3 = new com.waze.sharedrive.e.cd
            r3.<init>(r1, r4)
            h.g.a.p r3 = (h.g.a.p) r3
            kotlinx.coroutines.b.k r1 = kotlinx.coroutines.b.ai.E(r3)
        L42:
            r3 = 1
            r5.f38481a = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.g(r6, r1, r2)
            if (r5 != r0) goto L4c
            return r0
        L4c:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.cf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
