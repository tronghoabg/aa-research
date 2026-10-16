package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32316a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f32317b;

    /* renamed from: c, reason: collision with root package name */
    private final ag f32318c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32319d;

    public l(com.waze.shared_infra.i.e eVar, kotlinx.coroutines.b.k kVar, ag agVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(kVar, "userUpdate");
        h.g.b.x.f(agVar, "sessionTokenRepository");
        this.f32316a = eVar;
        this.f32317b = kVar;
        this.f32318c = agVar;
        this.f32319d = "SessionManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.network.f.k
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.network.f.k r0 = (com.waze.network.f.k) r0
            int r1 = r0.f32315c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32315c = r1
            goto L18
        L13:
            com.waze.network.f.k r0 = new com.waze.network.f.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32313a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32315c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L48
        L27:
            r6 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r6)
            r6 = r5
            com.waze.network.f.l r6 = (com.waze.network.f.l) r6     // Catch: java.lang.Throwable -> L27
            com.waze.network.f.ag r6 = r5.f32318c     // Catch: java.lang.Throwable -> L27
            com.waze.authentication.x r2 = new com.waze.authentication.x     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27
            r0.f32315c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L48
            return r1
        L48:
            com.waze.network.f.af r6 = (com.waze.network.f.af) r6     // Catch: java.lang.Throwable -> L27
            goto L4f
        L4b:
            java.lang.Object r6 = e.b.c.a(r6)
        L4f:
            java.lang.Throwable r6 = h.m.c(r6)
            if (r6 == 0) goto L6a
            com.waze.shared_infra.i.e r5 = r5.f32316a
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "failed to fetch token: "
            java.lang.String r6 = r0.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.g(r6)
        L6a:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.l.f(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (kotlinx.coroutines.b.ai.d(r5, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.network.f.i
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.network.f.i r0 = (com.waze.network.f.i) r0
            int r1 = r0.f32309c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32309c = r1
            goto L18
        L13:
            com.waze.network.f.i r0 = new com.waze.network.f.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32307a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32309c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            goto L4b
        L36:
            e.b.c.b(r6)
            com.waze.shared_infra.i.e r6 = r5.f32316a
            java.lang.String r2 = "session manager is running"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.g(r2)
            r0.f32309c = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L4b
            goto L64
        L4b:
            kotlinx.coroutines.b.k r6 = r5.f32317b
            com.waze.network.f.j r2 = new com.waze.network.f.j
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r5 = kotlinx.coroutines.b.ai.K(r6, r2)
            r0.f32309c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.d(r5, r0)
            if (r5 == r1) goto L64
        L61:
            h.ab r5 = h.ab.f48028a
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.l.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f32319d;
    }
}
