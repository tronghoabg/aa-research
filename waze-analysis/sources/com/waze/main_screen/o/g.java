package com.waze.main_screen.o;

import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f26696a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26697b;

    public g(com.waze.sharedui.f.f fVar, com.waze.shared_infra.i.e eVar) {
        x.f(fVar, "elementSender");
        x.f(eVar, "logger");
        this.f26696a = fVar;
        this.f26697b = eVar;
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
            java.lang.String r0 = "failed to update main menu banner action: code="
            boolean r1 = r8 instanceof com.waze.main_screen.o.f
            if (r1 == 0) goto L15
            r1 = r8
            com.waze.main_screen.o.f r1 = (com.waze.main_screen.o.f) r1
            int r2 = r1.f26695c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f26695c = r2
            goto L1a
        L15:
            com.waze.main_screen.o.f r1 = new com.waze.main_screen.o.f
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.f26693a
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.f26695c
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
            com.waze.sharedui.f.f r7 = r5.f26696a     // Catch: java.lang.Throwable -> L95
            int r8 = com.waze.sharedui.api.a.f38785a     // Catch: java.lang.Throwable -> L95
            com.waze.sharedui.f.d r8 = com.waze.sharedui.api.a.K()     // Catch: java.lang.Throwable -> L95
            r1.f26695c = r4     // Catch: java.lang.Throwable -> L95
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
            com.waze.shared_infra.i.e r5 = r5.f26697b     // Catch: java.lang.Throwable -> L95
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
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.g.e(java.lang.String, com.waze.k.o, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.main_screen.o.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.g.a(h.c.e):java.lang.Object");
    }

    @Override // com.waze.main_screen.o.d
    public final Object b(String str, h.c.e eVar) {
        Object objE = e(str, com.waze.k.o.CLICKED, eVar);
        return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
    }

    @Override // com.waze.main_screen.o.d
    public final Object c(String str, h.c.e eVar) {
        Object objE = e(str, com.waze.k.o.SHOWN, eVar);
        return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
    }
}
