package com.waze.copilot.data.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f22935a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22936b;

    public p(com.waze.sharedui.f.f fVar, com.waze.shared_infra.i.e eVar) {
        x.f(fVar, "elementSender");
        x.f(eVar, "logger");
        this.f22935a = fVar;
        this.f22936b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.a.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.copilot.data.a.o
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.copilot.data.a.o r0 = (com.waze.copilot.data.a.o) r0
            int r1 = r0.f22934c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22934c = r1
            goto L18
        L13:
            com.waze.copilot.data.a.o r0 = new com.waze.copilot.data.a.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22932a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22934c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L63
        L27:
            r6 = move-exception
            goto L67
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r6)
            com.waze.copilot.x r6 = com.waze.copilot.y.newBuilder()
            com.google.v.du r6 = r6.build()
            java.lang.String r2 = "build(...)"
            h.g.b.x.e(r6, r2)
            com.waze.copilot.y r6 = (com.waze.copilot.y) r6
            i.b.l.cc r4 = i.b.l.cd.newBuilder()
            r4.q(r6)
            com.google.v.du r6 = r4.build()
            h.g.b.x.e(r6, r2)
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.sharedui.f.f r2 = r5.f22935a     // Catch: java.lang.Throwable -> L27
            int r4 = com.waze.sharedui.api.a.f38785a     // Catch: java.lang.Throwable -> L27
            com.waze.sharedui.f.d r4 = com.waze.sharedui.api.a.G()     // Catch: java.lang.Throwable -> L27
            r0.f22934c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L66
        L63:
            com.waze.copilot.aa r6 = (com.waze.copilot.aa) r6     // Catch: java.lang.Throwable -> L27
            goto L6b
        L66:
            return r1
        L67:
            java.lang.Object r6 = e.b.c.a(r6)
        L6b:
            java.lang.Throwable r0 = h.m.c(r6)
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "getOrElse(...)"
            h.g.b.x.e(r6, r0)
            com.waze.copilot.aa r6 = (com.waze.copilot.aa) r6
            boolean r0 = r6.hasNewContentCount()
            if (r0 == 0) goto La7
            boolean r0 = r6.hasMostRecentlyModifiedTimestampSec()
            if (r0 != 0) goto L85
            goto La7
        L85:
            com.waze.copilot.data.a.m r0 = new com.waze.copilot.data.a.m
            long r1 = r6.getNewContentCount()
            long r3 = r6.getMostRecentlyModifiedTimestampSec()
            r0.<init>(r1, r3)
            com.waze.shared_infra.i.e r5 = r5.f22936b
            r0.toString()
            java.lang.String r6 = r0.toString()
            java.lang.String r1 = "got is new marketplace content available response="
            java.lang.String r6 = r1.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            return r0
        La7:
            com.waze.copilot.data.a.u r5 = new com.waze.copilot.data.a.u
            r5.<init>()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r5 = e.b.c.a(r5)
            return r5
        Lb3:
            java.lang.Object r5 = e.b.c.a(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.a.p.a(h.c.e):java.lang.Object");
    }
}
