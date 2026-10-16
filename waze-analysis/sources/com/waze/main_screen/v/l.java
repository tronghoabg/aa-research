package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final c f27807a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27808b;

    public l(c cVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cVar, "promotionalChipApi");
        h.g.b.x.f(eVar, "logger");
        this.f27807a = cVar;
        this.f27808b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.main_screen.v.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.main_screen.v.k
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.main_screen.v.k r0 = (com.waze.main_screen.v.k) r0
            int r1 = r0.f27806c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27806c = r1
            goto L18
        L13:
            com.waze.main_screen.v.k r0 = new com.waze.main_screen.v.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27804a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27806c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r5)
            h.m r5 = (h.m) r5
            java.lang.Object r5 = r5.b()
            goto L42
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r5)
            com.waze.main_screen.v.c r5 = r4.f27807a
            r0.f27806c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L59
        L42:
            java.lang.Throwable r0 = h.m.c(r5)
            if (r0 == 0) goto L4f
            com.waze.shared_infra.i.e r4 = r4.f27808b
            java.lang.String r1 = "failed to load promotional chips"
            r4.c(r1, r0)
        L4f:
            boolean r4 = r5 instanceof h.l
            java.util.List r0 = h.a.i.h()
            if (r4 == 0) goto L58
            return r0
        L58:
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.v.l.a(h.c.e):java.lang.Object");
    }

    @Override // com.waze.main_screen.v.j
    public final Object b(String str, h.c.e eVar) {
        Object objB = this.f27807a.b(str, eVar);
        return objB == h.c.a.a.f48038a ? objB : h.ab.f48028a;
    }

    @Override // com.waze.main_screen.v.j
    public final Object c(String str, h.c.e eVar) {
        Object objC = this.f27807a.c(str, eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }
}
