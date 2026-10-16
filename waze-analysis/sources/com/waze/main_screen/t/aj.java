package com.waze.main_screen.t;

import com.waze.map.canvas.bj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f27475a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.asks.as f27476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f27477c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f27478d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bj f27479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(boolean z, com.waze.asks.as asVar, am amVar, boolean z2, bj bjVar, h.c.e eVar) {
        super(2, eVar);
        this.f27475a = z;
        this.f27476b = asVar;
        this.f27477c = amVar;
        this.f27478d = z2;
        this.f27479e = bjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aj(this.f27475a, this.f27476b, this.f27477c, this.f27478d, this.f27479e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
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
            boolean r2 = r1.f27475a
            if (r2 != 0) goto L3e
            com.waze.asks.as r2 = r1.f27476b
            if (r2 != 0) goto L3e
            com.waze.main_screen.t.am r2 = r1.f27477c
            com.waze.reports_v2.presentation.a.az r0 = r2.m()
            boolean r0 = r0.m()
            if (r0 != 0) goto L3e
            boolean r0 = r1.f27478d
            if (r0 == 0) goto L1e
            goto L3e
        L1e:
            com.waze.map.canvas.bj r1 = r1.f27479e
            boolean r1 = com.waze.map.el.d(r1)
            if (r1 != 0) goto L32
            com.waze.main_screen.c.an r1 = r2.b()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26116b
            r1.g(r2)
            goto L4b
        L32:
            com.waze.main_screen.c.an r1 = r2.b()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26115a
            r1.g(r2)
            goto L4b
        L3e:
            com.waze.main_screen.t.am r1 = r1.f27477c
            com.waze.main_screen.c.an r1 = r1.b()
            if (r1 == 0) goto L4b
            com.waze.main_screen.c.am r2 = com.waze.main_screen.c.am.f26117c
            r1.g(r2)
        L4b:
            h.ab r1 = h.ab.f48028a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.t.aj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
