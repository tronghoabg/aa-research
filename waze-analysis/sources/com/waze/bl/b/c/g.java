package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16939a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.closure.domain.c f16940b;

    /* renamed from: c, reason: collision with root package name */
    private volatile b f16941c;

    public g(com.waze.shared_infra.i.e eVar, com.waze.closure.domain.c cVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cVar, "closureCandidatesProvider");
        this.f16939a = eVar;
        this.f16940b = cVar;
        this.f16941c = d.f16934a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.bl.b.c.f
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.b.c.f r0 = (com.waze.bl.b.c.f) r0
            int r1 = r0.f16938c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16938c = r1
            goto L18
        L13:
            com.waze.bl.b.c.f r0 = new com.waze.bl.b.c.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16936a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16938c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.closure.domain.c r6 = r4.f16940b
            r0.f16938c = r3
            java.lang.Object r6 = r6.getClosureCandidates(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            r5 = r6
            java.util.List r5 = (java.util.List) r5
            com.waze.bl.b.c.e r0 = new com.waze.bl.b.c.e
            r0.<init>(r5)
            com.waze.bl.b.c.b r0 = (com.waze.bl.b.c.b) r0
            r4.f16941c = r0
            com.waze.shared_infra.i.e r4 = r4.f16939a
            int r5 = r5.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fetched closure candidates: (count="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.a(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.g.a(int, h.c.e):java.lang.Object");
    }

    public final b b() {
        return this.f16941c;
    }
}
