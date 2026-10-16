package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42596a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f42597b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba f42598c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba f42599d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f42600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bq(cg cgVar, ba baVar, ba baVar2, t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f42597b = cgVar;
        this.f42598c = baVar;
        this.f42599d = baVar2;
        this.f42600e = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bq(this.f42597b, this.f42598c, this.f42599d, this.f42600e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (com.waze.ui.l.ba.H(r7.f42599d, r7.f42600e, new com.waze.ui.l.ci(), 0.0f, r7, 12) == r0) goto L12;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f42596a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            e.b.c.b(r8)
            goto L44
        Ld:
            e.b.c.b(r8)
            goto L25
        L11:
            e.b.c.b(r8)
            com.waze.ui.l.ba r8 = r7.f42598c
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f42596a = r2
            r2 = 1060320051(0x3f333333, float:0.7)
            java.lang.Object r8 = com.waze.ui.l.cg.C(r8, r2, r1)
            if (r8 != r0) goto L25
            goto L43
        L25:
            com.waze.ui.l.ba r1 = r7.f42599d
            com.waze.ui.l.t r8 = r7.f42600e
            r2 = r8
            com.waze.ui.l.ad r2 = (com.waze.ui.l.ad) r2
            com.waze.ui.l.ci r8 = new com.waze.ui.l.ci
            r8.<init>()
            r3 = r8
            com.waze.ui.l.ck r3 = (com.waze.ui.l.ck) r3
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r8 = 2
            r7.f42596a = r8
            r6 = 12
            r4 = 0
            java.lang.Object r7 = com.waze.ui.l.ba.H(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.bq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
