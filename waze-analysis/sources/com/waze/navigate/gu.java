package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gu extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31455a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.am f31456b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.l f31457c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.places.a.b f31458d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.l.b.d f31459e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f31460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gu(kotlinx.coroutines.am amVar, com.waze.places.a.b bVar, com.waze.av.b.l lVar, com.waze.main_screen.l.b.d dVar, h.c.e eVar) {
        super(2, eVar);
        this.f31456b = amVar;
        this.f31458d = bVar;
        this.f31457c = lVar;
        this.f31459e = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        gu guVar = new gu(this.f31456b, this.f31458d, this.f31457c, this.f31459e, eVar);
        guVar.f31460f = obj;
        return guVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6.f31458d.a(com.waze.ad.c.b.e(r7), com.waze.navigate.gw.d(r6.f31457c, r7, com.waze.main_screen.l.b.d.g()), r6) == r0) goto L19;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f31455a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L6c
            goto L7a
        Ld:
            java.lang.Object r1 = r6.f31460f
            kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L6c
            goto L2b
        L15:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f31460f
            kotlinx.coroutines.af r7 = (kotlinx.coroutines.af) r7
            kotlinx.coroutines.am r1 = r6.f31456b     // Catch: java.lang.Exception -> L6c
            r3 = r6
            h.c.e r3 = (h.c.e) r3     // Catch: java.lang.Exception -> L6c
            r6.f31460f = r7     // Catch: java.lang.Exception -> L6c
            r6.f31455a = r2     // Catch: java.lang.Exception -> L6c
            java.lang.Object r7 = r1.c(r3)     // Catch: java.lang.Exception -> L6c
            if (r7 == r0) goto L6b
        L2b:
            com.waze.av.d.k r7 = (com.waze.av.d.k) r7     // Catch: java.lang.Exception -> L6c
            if (r7 != 0) goto L3f
            com.waze.navigate.gw r6 = com.waze.navigate.gw.f31465a     // Catch: java.lang.Exception -> L6c
            com.waze.shared_infra.i.e r6 = com.waze.navigate.gw.e()     // Catch: java.lang.Exception -> L6c
            java.lang.String r7 = "resolveFreshVenue background: fetch returned null"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Exception -> L6c
            r6.a(r7)     // Catch: java.lang.Exception -> L6c
            h.ab r6 = h.ab.f48028a     // Catch: java.lang.Exception -> L6c
            return r6
        L3f:
            com.waze.navigate.gw r1 = com.waze.navigate.gw.f31465a     // Catch: java.lang.Exception -> L6c
            com.waze.shared_infra.i.e r1 = com.waze.navigate.gw.e()     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = "freshVenue fetched in background"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L6c
            r1.a(r2)     // Catch: java.lang.Exception -> L6c
            com.waze.places.a.b r1 = r6.f31458d     // Catch: java.lang.Exception -> L6c
            com.waze.av.b.n r2 = com.waze.ad.c.b.e(r7)     // Catch: java.lang.Exception -> L6c
            com.waze.av.b.l r3 = r6.f31457c     // Catch: java.lang.Exception -> L6c
            long r4 = com.waze.main_screen.l.b.d.g()     // Catch: java.lang.Exception -> L6c
            boolean r7 = com.waze.navigate.gw.d(r3, r7, r4)     // Catch: java.lang.Exception -> L6c
            r3 = r6
            h.c.e r3 = (h.c.e) r3     // Catch: java.lang.Exception -> L6c
            r4 = 0
            r6.f31460f = r4     // Catch: java.lang.Exception -> L6c
            r4 = 2
            r6.f31455a = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r6 = r1.a(r2, r7, r3)     // Catch: java.lang.Exception -> L6c
            if (r6 != r0) goto L7a
        L6b:
            return r0
        L6c:
            r6 = move-exception
            com.waze.navigate.gw r7 = com.waze.navigate.gw.f31465a
            com.waze.shared_infra.i.e r7 = com.waze.navigate.gw.e()
            java.lang.String r0 = "Failed to update fresh venue in background"
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7.c(r0, r6)
        L7a:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.gu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
