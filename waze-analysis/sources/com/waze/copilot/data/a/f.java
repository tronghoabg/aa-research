package com.waze.copilot.data.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f22921a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22922b;

    public f(com.waze.sharedui.f.f fVar, com.waze.shared_infra.i.e eVar) {
        x.f(fVar, "elementSender");
        x.f(eVar, "logger");
        this.f22921a = fVar;
        this.f22922b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.copilot.data.a.e
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.data.a.e r0 = (com.waze.copilot.data.a.e) r0
            int r1 = r0.f22920c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22920c = r1
            goto L18
        L13:
            com.waze.copilot.data.a.e r0 = new com.waze.copilot.data.a.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f22918a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22920c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L28
            goto Laf
        L28:
            r5 = move-exception
            goto Lb2
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r8)
            if (r5 != 0) goto L46
            if (r6 != 0) goto L46
            if (r7 == 0) goto L3d
            goto L46
        L3d:
            com.waze.copilot.data.a.h r4 = com.waze.copilot.data.a.h.f22926a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = e.b.c.a(r4)
            return r4
        L46:
            com.waze.copilot.p r8 = com.waze.copilot.q.newBuilder()
            if (r5 == 0) goto L5c
            com.waze.copilot.l r2 = com.waze.copilot.n.newBuilder()
            r2.a(r5)
            com.google.v.du r5 = r2.build()
            com.waze.copilot.n r5 = (com.waze.copilot.n) r5
            r8.a(r5)
        L5c:
            if (r6 == 0) goto L6e
            com.waze.copilot.l r5 = com.waze.copilot.n.newBuilder()
            r5.b(r6)
            com.google.v.du r5 = r5.build()
            com.waze.copilot.n r5 = (com.waze.copilot.n) r5
            r8.a(r5)
        L6e:
            if (r7 == 0) goto L80
            com.waze.copilot.l r5 = com.waze.copilot.n.newBuilder()
            r5.c(r7)
            com.google.v.du r5 = r5.build()
            com.waze.copilot.n r5 = (com.waze.copilot.n) r5
            r8.a(r5)
        L80:
            com.google.v.du r5 = r8.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            com.waze.copilot.q r5 = (com.waze.copilot.q) r5
            i.b.l.cc r7 = i.b.l.cd.newBuilder()
            r7.o(r5)
            com.google.v.du r5 = r7.build()
            h.g.b.x.e(r5, r6)
            i.b.l.cd r5 = (i.b.l.cd) r5
            r6 = r4
            com.waze.copilot.data.a.f r6 = (com.waze.copilot.data.a.f) r6     // Catch: java.lang.Throwable -> L28
            com.waze.sharedui.f.f r6 = r4.f22921a     // Catch: java.lang.Throwable -> L28
            int r7 = com.waze.sharedui.api.a.f38785a     // Catch: java.lang.Throwable -> L28
            com.waze.sharedui.f.d r7 = com.waze.sharedui.api.a.k()     // Catch: java.lang.Throwable -> L28
            r0.f22920c = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r6.a(r7, r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto Laf
            return r1
        Laf:
            com.waze.copilot.w r8 = (com.waze.copilot.w) r8     // Catch: java.lang.Throwable -> L28
            goto Lb6
        Lb2:
            java.lang.Object r8 = e.b.c.a(r5)
        Lb6:
            java.lang.Throwable r5 = h.m.c(r8)
            if (r5 != 0) goto Ldc
            java.lang.String r5 = "getOrElse(...)"
            h.g.b.x.e(r8, r5)
            com.waze.copilot.w r8 = (com.waze.copilot.w) r8
            com.waze.copilot.data.a.g r5 = com.waze.t.b.bz.f(r8)
            com.waze.shared_infra.i.e r4 = r4.f22922b
            java.util.Objects.toString(r5)
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "got copilot assets="
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.a(r6)
            return r5
        Ldc:
            com.waze.shared_infra.i.e r4 = r4.f22922b
            java.lang.String r6 = r5.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "failed to get copilot assets: error="
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.b(r6)
            java.lang.Object r4 = e.b.c.a(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.a.f.a(java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }
}
