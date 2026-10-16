package com.waze.modules.c;

import com.waze.config.ConfigValues;
import com.waze.ix;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cl implements ch {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29967a;

    /* renamed from: b, reason: collision with root package name */
    private final cr f29968b;

    /* renamed from: c, reason: collision with root package name */
    private final ds f29969c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.f.k f29970d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.d f29971e;

    /* renamed from: f, reason: collision with root package name */
    private final dx f29972f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f29973g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.ab.h f29974h;

    public cl(com.waze.shared_infra.i.e eVar, cr crVar, ds dsVar, com.waze.sharedui.f.k kVar, com.waze.main_screen.ab.h hVar, com.waze.map.d dVar, ix ixVar, dx dxVar, com.waze.shared_infra.i.b bVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(crVar, "requestBuilder");
        h.g.b.x.f(dsVar, "tripOverviewRequestBuilder");
        h.g.b.x.f(kVar, "networkGateway");
        h.g.b.x.f(hVar, "statsProvider");
        h.g.b.x.f(dVar, "compressedPolylineUtils");
        h.g.b.x.f(ixVar, "configuration");
        h.g.b.x.f(dxVar, "visualImpactConfiguration");
        h.g.b.x.f(bVar, "exceptionReporter");
        this.f29967a = eVar;
        this.f29968b = crVar;
        this.f29969c = dsVar;
        this.f29970d = kVar;
        this.f29974h = hVar;
        this.f29971e = dVar;
        this.f29972f = dxVar;
        this.f29973g = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.waze.modules.c.ce r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.modules.c.cj
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.modules.c.cj r0 = (com.waze.modules.c.cj) r0
            int r1 = r0.f29961c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29961c = r1
            goto L18
        L13:
            com.waze.modules.c.cj r0 = new com.waze.modules.c.cj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29959a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29961c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.waze.modules.c.dq r7 = r0.f29962d
            r0 = r7
            com.waze.modules.c.dq r0 = (com.waze.modules.c.dq) r0
            e.b.c.b(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e.b.c.b(r8)
            goto L48
        L3b:
            e.b.c.b(r8)
            com.waze.modules.c.ds r8 = r6.f29969c
            r0.f29961c = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 == r1) goto Lcb
        L48:
            com.waze.shared_infra.i.e r7 = r6.f29967a
            com.waze.modules.c.dq r8 = (com.waze.modules.c.dq) r8
            java.util.Objects.toString(r8)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "calculateRouteTripOverview: Request: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.sharedui.f.k r7 = r6.f29970d
            int r2 = com.waze.sharedui.api.a.f38785a
            com.waze.sharedui.f.d r2 = com.waze.sharedui.api.a.J()
            i.b.l.cd r4 = r8.b()
            r0.f29962d = r8
            r0.f29961c = r3
            java.lang.Object r7 = com.waze.sharedui.f.n.b(r7, r2, r4, r0)
            if (r7 == r1) goto Lcb
            r5 = r8
            r8 = r7
            r7 = r5
        L77:
            com.waze.sharedui.f.n r8 = (com.waze.sharedui.f.n) r8
            boolean r0 = r8 instanceof com.waze.sharedui.f.i
            if (r0 == 0) goto Lb3
            com.waze.sharedui.f.i r8 = (com.waze.sharedui.f.i) r8
            java.lang.Object r8 = r8.a()
            i.b.l.cd r8 = (i.b.l.cd) r8
            com.waze.bg.e.a.ic r8 = r8.getGetTripOverviewResponseV2Alpha()
            if (r8 == 0) goto L9f
            int r7 = r7.a()
            com.waze.map.d r0 = r6.f29971e
            com.waze.modules.c.dx r6 = r6.f29972f
            com.waze.modules.c.dk r6 = com.waze.modules.c.dt.a(r8, r7, r0, r6)
            com.waze.sharedui.f.i r7 = new com.waze.sharedui.f.i
            r7.<init>(r6)
            com.waze.sharedui.f.n r7 = (com.waze.sharedui.f.n) r7
            return r7
        L9f:
            com.waze.sharedui.f.j r6 = new com.waze.sharedui.f.j
            r7 = -1
            java.lang.String r8 = "fail to parse response"
            com.waze.sharedui.b r7 = com.waze.sharedui.i.a(r7, r8)
            java.lang.String r8 = "makeError(...)"
            h.g.b.x.e(r7, r8)
            r6.<init>(r7)
            com.waze.sharedui.f.n r6 = (com.waze.sharedui.f.n) r6
            return r6
        Lb3:
            boolean r6 = r8 instanceof com.waze.sharedui.f.j
            if (r6 == 0) goto Lc5
            com.waze.sharedui.f.j r6 = new com.waze.sharedui.f.j
            com.waze.sharedui.f.j r8 = (com.waze.sharedui.f.j) r8
            com.waze.sharedui.b r7 = r8.a()
            r6.<init>(r7)
            com.waze.sharedui.f.n r6 = (com.waze.sharedui.f.n) r6
            return r6
        Lc5:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cl.e(com.waze.modules.c.ce, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.modules.c.ce r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cl.f(com.waze.modules.c.ce, h.c.e):java.lang.Object");
    }

    @Override // com.waze.modules.c.ch
    public final Object a(ce ceVar, h.c.e eVar) {
        if (ceVar.c().d().g()) {
            this.f29973g.a(new Exception("calculateRoute called with invalid destination, use case = ".concat(com.waze.gas.a.c(ceVar.a()))), null);
            this.f29967a.d("calculateRoute called with invalid destination");
            com.waze.sharedui.b bVarA = com.waze.sharedui.i.a(-1, "invalid destination");
            h.g.b.x.e(bVarA, "makeError(...)");
            return new com.waze.sharedui.f.j(bVarA);
        }
        if (!ceVar.d().g()) {
            return (ceVar.a() == cg.f29948a && ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b().booleanValue()) ? e(ceVar, eVar) : f(ceVar, eVar);
        }
        this.f29967a.b("calculateRoute called with invalid origin, GPS not available?");
        com.waze.sharedui.b bVarA2 = com.waze.sharedui.i.a(-1, "invalid origin");
        h.g.b.x.e(bVarA2, "makeError(...)");
        return new com.waze.sharedui.f.j(bVarA2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.modules.c.ch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.modules.c.cf r17, h.c.e r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cl.b(com.waze.modules.c.cf, h.c.e):java.lang.Object");
    }
}
