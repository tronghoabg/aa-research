package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ne implements com.waze.shared_infra.r.o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.network.f.ag f31845a;

    public ne(com.waze.network.f.ag agVar) {
        h.g.b.x.f(agVar, "sessionTokenRepository");
        this.f31845a = agVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.r.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.nd
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.nd r0 = (com.waze.nd) r0
            int r1 = r0.f31844c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31844c = r1
            goto L18
        L13:
            com.waze.nd r0 = new com.waze.nd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31842a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f31844c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L48
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            r5 = r4
            com.waze.ne r5 = (com.waze.ne) r5     // Catch: java.lang.Throwable -> L48
            com.waze.network.f.ag r4 = r4.f31845a     // Catch: java.lang.Throwable -> L48
            com.waze.authentication.x r5 = new com.waze.authentication.x     // Catch: java.lang.Throwable -> L48
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L48
            r0.f31844c = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            com.waze.network.f.af r5 = (com.waze.network.f.af) r5     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            r4 = move-exception
            java.lang.Object r5 = e.b.c.a(r4)
        L4d:
            java.lang.Throwable r4 = h.m.c(r5)
            if (r4 == 0) goto L64
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "failed to login: "
            java.lang.String r4 = r5.concat(r4)
            com.waze.shared_infra.i.h.j(r4)
        L64:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ne.a(h.c.e):java.lang.Object");
    }
}
