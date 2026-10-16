package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.asks.as f27048a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27049b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f27050c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f27051d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.bj f27052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(com.waze.asks.as asVar, bf bfVar, boolean z, boolean z2, com.waze.map.canvas.bj bjVar, h.c.e eVar) {
        super(2, eVar);
        this.f27048a = asVar;
        this.f27049b = bfVar;
        this.f27050c = z;
        this.f27051d = z2;
        this.f27052e = bjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new as(this.f27048a, this.f27049b, this.f27050c, this.f27051d, this.f27052e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r2)
            com.waze.asks.as r2 = r1.f27048a
            if (r2 != 0) goto L3e
            com.waze.main_screen.p.bf r2 = r1.f27049b
            com.waze.reports_v2.presentation.a.az r0 = r2.r()
            boolean r0 = r0.m()
            if (r0 != 0) goto L3e
            boolean r0 = r1.f27050c
            if (r0 != 0) goto L3e
            boolean r0 = r1.f27051d
            if (r0 == 0) goto L1e
            goto L3e
        L1e:
            com.waze.map.canvas.bj r1 = r1.f27052e
            boolean r1 = com.waze.map.el.d(r1)
            if (r1 != 0) goto L32
            com.waze.main_screen.c.an r1 = r2.f()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26116b
            r1.g(r2)
            goto L4b
        L32:
            com.waze.main_screen.c.an r1 = r2.f()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26115a
            r1.g(r2)
            goto L4b
        L3e:
            com.waze.main_screen.p.bf r1 = r1.f27049b
            com.waze.main_screen.c.an r1 = r1.f()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26117c
            r1.g(r2)
        L4b:
            h.ab r1 = h.ab.f48028a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.as.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
