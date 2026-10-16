package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final g f16946a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bl.c.c.c f16947b;

    public i(com.waze.shared_infra.i.e eVar, g gVar, com.waze.bl.c.c.c cVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(gVar, "closureCandidatesStore");
        h.g.b.x.f(cVar, "config");
        this.f16946a = gVar;
        this.f16947b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.bl.b.c.i r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.bl.b.c.h
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.b.c.h r0 = (com.waze.bl.b.c.h) r0
            int r1 = r0.f16944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16944c = r1
            goto L18
        L13:
            com.waze.bl.b.c.h r0 = new com.waze.bl.b.c.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16942a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16944c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.waze.bl.b.c.i r5 = r0.f16945d
            com.waze.bl.b.c.i r5 = (com.waze.bl.b.c.i) r5
            e.b.c.b(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r6)
            com.waze.bl.b.c.g r6 = r5.f16946a
            com.waze.bl.b.c.b r2 = r6.b()
            boolean r4 = r2 instanceof com.waze.bl.b.c.e
            if (r4 == 0) goto L47
            com.waze.bl.b.c.e r2 = (com.waze.bl.b.c.e) r2
            java.util.List r5 = r2.b()
            goto L62
        L47:
            com.waze.bl.b.c.d r4 = com.waze.bl.b.c.d.f16934a
            boolean r2 = h.g.b.x.n(r2, r4)
            if (r2 == 0) goto L9b
            com.waze.bl.c.c.c r2 = r5.f16947b
            int r2 = r2.a()
            r0.f16945d = r5
            r0.f16944c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L9a
        L5f:
            r5 = r6
            java.util.List r5 = (java.util.List) r5
        L62:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.i.q(r5, r0)
            r6.<init>(r0)
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L76:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r5.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L87
            h.a.i.p()
        L87:
            com.waze.closure.a.a r1 = (com.waze.closure.a.a) r1
            java.lang.String r0 = java.lang.String.valueOf(r2)
            com.waze.bl.c.c.b r3 = new com.waze.bl.c.c.b
            r3.<init>(r0, r0, r1)
            r6.add(r3)
            r0 = r2
            goto L76
        L97:
            java.util.List r6 = (java.util.List) r6
            return r6
        L9a:
            return r1
        L9b:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.i.a(com.waze.bl.b.c.i, h.c.e):java.lang.Object");
    }
}
