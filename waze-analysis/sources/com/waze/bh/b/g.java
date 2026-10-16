package com.waze.bh.b;

import com.waze.authentication.l;
import com.waze.sharedui.f.k;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16765a;

    /* renamed from: b, reason: collision with root package name */
    private final k f16766b;

    /* renamed from: c, reason: collision with root package name */
    private final l f16767c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.network.a.a f16768d;

    public g(com.waze.shared_infra.i.e eVar, k kVar, l lVar, com.waze.network.a.a aVar) {
        x.f(eVar, "logger");
        x.f(kVar, "networkGateway");
        x.f(lVar, "credentialProvider");
        x.f(aVar, "clientInfoProvider");
        this.f16765a = eVar;
        this.f16766b = kVar;
        this.f16767c = lVar;
        this.f16768d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bh.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.bh.b.d
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bh.b.d r0 = (com.waze.bh.b.d) r0
            int r1 = r0.f16758c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16758c = r1
            goto L18
        L13:
            com.waze.bh.b.d r0 = new com.waze.bh.b.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16756a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16758c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L73
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            i.b.l.cc r7 = i.b.l.cd.newBuilder()
            com.waze.i.z r2 = com.waze.i.aa.newBuilder()
            r2.a(r6)
            com.google.v.du r6 = r2.build()
            com.waze.i.aa r6 = (com.waze.i.aa) r6
            r7.D(r6)
            com.google.v.du r6 = r7.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.shared_infra.i.e r7 = r5.f16765a
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "notifyQrScanned: Request: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.sharedui.f.k r7 = r5.f16766b
            com.waze.sharedui.f.d r2 = com.waze.bh.b.h.a()
            r0.f16758c = r3
            java.lang.Object r7 = com.waze.sharedui.f.n.b(r7, r2, r6, r0)
            if (r7 == r1) goto Ld6
        L73:
            com.waze.sharedui.f.n r7 = (com.waze.sharedui.f.n) r7
            boolean r6 = r7 instanceof com.waze.sharedui.f.i
            if (r6 == 0) goto L9a
            com.waze.shared_infra.i.e r5 = r5.f16765a
            com.waze.sharedui.f.i r7 = (com.waze.sharedui.f.i) r7
            java.lang.Object r6 = r7.a()
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.i.ac r6 = r6.getNotifyQrTokenWasScannedResponse()
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "notifyQrScanned: succeeded: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            goto Lcd
        L9a:
            boolean r6 = r7 instanceof com.waze.sharedui.f.j
            if (r6 == 0) goto Ld0
            com.waze.shared_infra.i.e r5 = r5.f16765a
            com.waze.sharedui.f.j r7 = (com.waze.sharedui.f.j) r7
            com.waze.sharedui.b r6 = r7.a()
            java.lang.String r6 = r6.getErrorCode()
            com.waze.sharedui.b r7 = r7.a()
            java.lang.String r7 = r7.getErrorMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyQrScanned: Error code: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " message: "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.b(r6)
        Lcd:
            h.ab r5 = h.ab.f48028a
            return r5
        Ld0:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bh.b.g.a(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bh.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.bh.b.e
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bh.b.e r0 = (com.waze.bh.b.e) r0
            int r1 = r0.f16761c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16761c = r1
            goto L18
        L13:
            com.waze.bh.b.e r0 = new com.waze.bh.b.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16759a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16761c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L73
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            i.b.l.cc r7 = i.b.l.cd.newBuilder()
            com.waze.i.v r2 = com.waze.i.w.newBuilder()
            r2.a(r6)
            com.google.v.du r6 = r2.build()
            com.waze.i.w r6 = (com.waze.i.w) r6
            r7.x(r6)
            com.google.v.du r6 = r7.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.shared_infra.i.e r7 = r5.f16765a
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "notifyUserRefused: Request: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.sharedui.f.k r7 = r5.f16766b
            com.waze.sharedui.f.d r2 = com.waze.bh.b.h.c()
            r0.f16761c = r3
            java.lang.Object r7 = com.waze.sharedui.f.n.b(r7, r2, r6, r0)
            if (r7 == r1) goto Ld6
        L73:
            com.waze.sharedui.f.n r7 = (com.waze.sharedui.f.n) r7
            boolean r6 = r7 instanceof com.waze.sharedui.f.i
            if (r6 == 0) goto L9a
            com.waze.shared_infra.i.e r5 = r5.f16765a
            com.waze.sharedui.f.i r7 = (com.waze.sharedui.f.i) r7
            java.lang.Object r6 = r7.a()
            i.b.l.cd r6 = (i.b.l.cd) r6
            com.waze.i.ac r6 = r6.getNotifyQrTokenWasScannedResponse()
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "notifyUserRefused: succeeded: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            goto Lcd
        L9a:
            boolean r6 = r7 instanceof com.waze.sharedui.f.j
            if (r6 == 0) goto Ld0
            com.waze.shared_infra.i.e r5 = r5.f16765a
            com.waze.sharedui.f.j r7 = (com.waze.sharedui.f.j) r7
            com.waze.sharedui.b r6 = r7.a()
            java.lang.String r6 = r6.getErrorCode()
            com.waze.sharedui.b r7 = r7.a()
            java.lang.String r7 = r7.getErrorMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyQrScanned: Error code: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " message: "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.b(r6)
        Lcd:
            h.ab r5 = h.ab.f48028a
            return r5
        Ld0:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bh.b.g.b(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bh.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bh.b.g.c(java.lang.String, h.c.e):java.lang.Object");
    }
}
