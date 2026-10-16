package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f24727a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f24728b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f24729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f24729c = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ad adVar = new ad(this.f24729c, eVar);
        adVar.f24728b = obj;
        return adVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ad) create((w) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (kotlinx.coroutines.aj.q(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, r4) == r0) goto L26;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0081: INVOKE (r3 I:com.waze.shared_infra.s.d) INTERFACE call: com.waze.shared_infra.s.d.a():void A[MD:():void (m)] (LINE:130), block:B:27:0x006f */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f24727a
            r2 = 1
            if (r1 == 0) goto L19
            java.lang.Object r3 = r4.f24728b
            if (r1 == r2) goto L11
            com.waze.shared_infra.s.d r3 = (com.waze.shared_infra.s.d) r3
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L17
            goto L56
        L11:
            com.waze.shared_infra.s.d r3 = (com.waze.shared_infra.s.d) r3
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L17
            goto L45
        L17:
            r5 = move-exception
            goto L6f
        L19:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f24728b
            com.waze.install.w r5 = (com.waze.install.w) r5
            com.waze.install.u r1 = com.waze.install.u.f24795a
            boolean r5 = h.g.b.x.n(r5, r1)
            if (r5 != 0) goto L2b
            h.ab r4 = h.ab.f48028a
            return r4
        L2b:
            com.waze.install.ae r5 = r4.f24729c
            com.waze.app_nav.hub.b.c r1 = com.waze.install.ae.d(r5)
            java.lang.String r3 = "SystemLanguage:showProgressPopup"
            com.waze.shared_infra.s.d r3 = com.waze.sharedui.api.i.c(r1, r3)
            h.g.a.l r5 = com.waze.install.ae.k(r5)     // Catch: java.lang.Throwable -> L17
            r4.f24728b = r3     // Catch: java.lang.Throwable -> L17
            r4.f24727a = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L17
            if (r5 == r0) goto L6e
        L45:
            r5 = r4
            h.c.e r5 = (h.c.e) r5     // Catch: java.lang.Throwable -> L17
            r4.f24728b = r3     // Catch: java.lang.Throwable -> L17
            r1 = 2
            r4.f24727a = r1     // Catch: java.lang.Throwable -> L17
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r5 = kotlinx.coroutines.aj.q(r1, r5)     // Catch: java.lang.Throwable -> L17
            if (r5 != r0) goto L56
            goto L6e
        L56:
            com.waze.install.ae r4 = r4.f24729c
            com.waze.install.x r4 = com.waze.install.ae.e(r4)
            int r5 = h.g.b.ar.f48106a
            h.g.b.m r5 = new h.g.b.m
            java.lang.Class<com.waze.install.u> r0 = com.waze.install.u.class
            r5.<init>(r0)
            r4.f(r5)
            r3.a()
            h.ab r4 = h.ab.f48028a
            return r4
        L6e:
            return r0
        L6f:
            com.waze.install.ae r4 = r4.f24729c
            com.waze.install.x r4 = com.waze.install.ae.e(r4)
            int r0 = h.g.b.ar.f48106a
            h.g.b.m r0 = new h.g.b.m
            java.lang.Class<com.waze.install.u> r1 = com.waze.install.u.class
            r0.<init>(r1)
            r4.f(r0)
            r3.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.install.ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
