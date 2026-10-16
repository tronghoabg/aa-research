package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.j f34524a;

    /* renamed from: b, reason: collision with root package name */
    private final dp f34525b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.dg f34526c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34527d;

    public n(com.waze.reports_v2.b.j jVar, dp dpVar, com.waze.navigate.dg dgVar) {
        h.g.b.x.f(jVar, "repository");
        h.g.b.x.f(dpVar, "dataProvider");
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        this.f34524a = jVar;
        this.f34525b = dpVar;
        this.f34526c = dgVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AvailableReportsCategoriesUseCase");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34527d = eVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.reports_v2.c.n r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.n.b(com.waze.reports_v2.c.n, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(com.waze.reports_v2.c.n r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.reports_v2.c.m
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.reports_v2.c.m r0 = (com.waze.reports_v2.c.m) r0
            int r1 = r0.f34522c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34522c = r1
            goto L18
        L13:
            com.waze.reports_v2.c.m r0 = new com.waze.reports_v2.c.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f34520a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34522c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.reports_v2.c.n r4 = r0.f34523d
            r0 = r4
            com.waze.reports_v2.c.n r0 = (com.waze.reports_v2.c.n) r0
            e.b.c.b(r5)
            goto L43
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r5)
            com.waze.reports_v2.b.j r5 = r4.f34524a
            r0.f34523d = r4
            r0.f34522c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L7a
        L43:
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L50
            java.util.List r4 = h.a.i.h()
            return r4
        L50:
            com.waze.reports_v2.c.dp r4 = r4.f34525b
            boolean r0 = r4.d()
            if (r0 == 0) goto L65
            java.util.Collection r5 = (java.util.Collection) r5
            com.waze.reports_v2.b.ah r0 = new com.waze.reports_v2.b.ah
            com.waze.reports_v2.b.ad r1 = com.waze.reports_v2.b.ad.f34022f
            r0.<init>(r1)
            java.util.List r5 = h.a.i.ag(r5, r0)
        L65:
            boolean r4 = r4.b()
            if (r4 == 0) goto L6c
            return r5
        L6c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.waze.reports_v2.b.ah r4 = new com.waze.reports_v2.b.ah
            com.waze.reports_v2.b.ad r0 = com.waze.reports_v2.b.ad.f34019c
            r4.<init>(r0)
            java.util.List r4 = h.a.i.ae(r5, r4)
            return r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.n.d(com.waze.reports_v2.c.n, h.c.e):java.lang.Object");
    }

    public final Object a(h.c.e eVar) {
        return b(this, eVar);
    }

    public final Object c(h.c.e eVar) {
        return d(this, eVar);
    }
}
