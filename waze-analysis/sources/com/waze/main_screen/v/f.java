package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f27790a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27791b;

    public f(com.waze.sharedui.f.f fVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(fVar, "elementSender");
        h.g.b.x.f(eVar, "logger");
        this.f27790a = fVar;
        this.f27791b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, com.waze.k.o r7, h.c.e r8) {
        /*
            r5 = this;
            java.lang.String r0 = "failed to update promotional chip action: code="
            boolean r1 = r8 instanceof com.waze.main_screen.v.e
            if (r1 == 0) goto L15
            r1 = r8
            com.waze.main_screen.v.e r1 = (com.waze.main_screen.v.e) r1
            int r2 = r1.f27789c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f27789c = r2
            goto L1a
        L15:
            com.waze.main_screen.v.e r1 = new com.waze.main_screen.v.e
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.f27787a
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.f27789c
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L95
            goto L65
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r8)
            com.waze.k.p r8 = com.waze.k.q.newBuilder()
            r8.b(r6)
            r8.a(r7)
            java.lang.String r6 = "apply(...)"
            h.g.b.x.e(r8, r6)
            i.b.l.cc r6 = com.waze.sharedui.api.c.a()
            r6.V(r8)
            com.google.v.du r6 = r6.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.sharedui.f.f r7 = r5.f27790a     // Catch: java.lang.Throwable -> L95
            int r8 = com.waze.sharedui.api.a.f38785a     // Catch: java.lang.Throwable -> L95
            com.waze.sharedui.f.d r8 = com.waze.sharedui.api.a.L()     // Catch: java.lang.Throwable -> L95
            r1.f27789c = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r8 = r7.a(r8, r6, r1)     // Catch: java.lang.Throwable -> L95
            if (r8 == r2) goto L94
        L65:
            java.lang.String r6 = "sendElementExceptionally(...)"
            h.g.b.x.e(r8, r6)     // Catch: java.lang.Throwable -> L95
            com.waze.k.s r8 = (com.waze.k.s) r8     // Catch: java.lang.Throwable -> L95
            i.b.ah r6 = r8.getStatus()     // Catch: java.lang.Throwable -> L95
            i.b.ag r6 = r6.getCode()     // Catch: java.lang.Throwable -> L95
            i.b.ag r7 = i.b.ag.OK     // Catch: java.lang.Throwable -> L95
            if (r6 == r7) goto L99
            com.waze.shared_infra.i.e r5 = r5.f27791b     // Catch: java.lang.Throwable -> L95
            i.b.ah r6 = r8.getStatus()     // Catch: java.lang.Throwable -> L95
            i.b.ag r6 = r6.getCode()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L95
            r7.append(r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> L95
            r5.b(r6)     // Catch: java.lang.Throwable -> L95
            goto L99
        L94:
            return r2
        L95:
            r5 = move-exception
            e.b.c.a(r5)
        L99:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.v.f.e(java.lang.String, com.waze.k.o, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.waze.main_screen.v.i] */
    @Override // com.waze.main_screen.v.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r14) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.v.f.a(h.c.e):java.lang.Object");
    }

    @Override // com.waze.main_screen.v.c
    public final Object b(String str, h.c.e eVar) {
        Object objE = e(str, com.waze.k.o.CLICKED, eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    @Override // com.waze.main_screen.v.c
    public final Object c(String str, h.c.e eVar) {
        Object objE = e(str, com.waze.k.o.SHOWN, eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }
}
