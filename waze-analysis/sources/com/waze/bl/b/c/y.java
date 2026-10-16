package com.waze.bl.b.c;

import com.waze.reports_v2.c.ds;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements com.waze.bl.c.c.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16992a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.d f16993b;

    /* renamed from: c, reason: collision with root package name */
    private final ds f16994c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f16995d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f16996e;

    public y(com.waze.shared_infra.i.e eVar, com.waze.reports_v2.b.d dVar, ds dsVar, com.waze.shared_infra.i.b bVar, com.waze.shared_infra.q.e eVar2) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(dVar, "reportAlertApi");
        h.g.b.x.f(dsVar, "reportPositionSaver");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(eVar2, "wazeClock");
        this.f16992a = eVar;
        this.f16993b = dVar;
        this.f16994c = dsVar;
        this.f16995d = bVar;
        this.f16996e = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.bl.b.c.w
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.b.c.w r0 = (com.waze.bl.b.c.w) r0
            int r1 = r0.f16986c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16986c = r1
            goto L18
        L13:
            com.waze.bl.b.c.w r0 = new com.waze.bl.b.c.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16984a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16986c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L69
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            goto L43
        L36:
            e.b.c.b(r6)
            com.waze.reports_v2.c.ds r6 = r5.f16994c
            r0.f16986c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L6c
        L43:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
            if (r6 != 0) goto L6b
            r6 = r5
            com.waze.bl.b.c.y r6 = (com.waze.bl.b.c.y) r6
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r2 = "SendConversationalReportAlertUseCase : report location is null"
            r6.<init>(r2)
            com.waze.shared_infra.i.b r2 = r5.f16995d
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            com.waze.shared_infra.h.b.f(r2, r6)
            com.waze.shared_infra.i.e r2 = r5.f16992a
            java.lang.String r4 = "report location is null, trying to use current location as fallback."
            r2.c(r4, r6)
            com.waze.reports_v2.c.ds r5 = r5.f16994c
            r0.f16986c = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 == r1) goto L6c
        L69:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
        L6b:
            return r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.y.c(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r14 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bl.c.c.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.reports_v2.b.at r12, com.waze.reports_v2.b.i r13, h.c.e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.waze.bl.b.c.x
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.bl.b.c.x r0 = (com.waze.bl.b.c.x) r0
            int r1 = r0.f16990d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16990d = r1
            goto L18
        L13:
            com.waze.bl.b.c.x r0 = new com.waze.bl.b.c.x
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f16988b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16990d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r14)
            goto La4
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            java.lang.Object r12 = r0.f16987a
            r13 = r12
            com.waze.reports_v2.b.i r13 = (com.waze.reports_v2.b.i) r13
            com.waze.reports_v2.b.at r12 = r0.f16991e
            r2 = r12
            com.waze.reports_v2.b.at r2 = (com.waze.reports_v2.b.at) r2
            e.b.c.b(r14)
            goto L50
        L41:
            e.b.c.b(r14)
            r0.f16991e = r12
            r0.f16987a = r13
            r0.f16990d = r4
            java.lang.Object r14 = r11.c(r0)
            if (r14 == r1) goto Lcc
        L50:
            r6 = r12
            r10 = r13
            r5 = r14
            com.waze.sharedui.e.c r5 = (com.waze.sharedui.e.c) r5
            if (r5 != 0) goto L5a
            com.waze.bl.c.c.h r11 = com.waze.bl.c.c.h.f17029a
            return r11
        L5a:
            java.lang.Long r12 = r5.i()
            if (r12 == 0) goto L6c
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            j$.time.Instant r12 = j$.time.Instant.ofEpochSecond(r12)
            if (r12 != 0) goto L8a
        L6c:
            r12 = r11
            com.waze.bl.b.c.y r12 = (com.waze.bl.b.c.y) r12
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.String r13 = "SendConversationalReportAlertUseCase : location update time is null"
            r12.<init>(r13)
            com.waze.shared_infra.i.b r13 = r11.f16995d
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            com.waze.shared_infra.h.b.f(r13, r12)
            com.waze.shared_infra.i.e r13 = r11.f16992a
            java.lang.String r14 = "location.lastUpdateTimeEpochSec is null, using current time."
            r13.h(r14, r12)
            com.waze.shared_infra.q.e r12 = r11.f16996e
            j$.time.Instant r12 = r12.b()
        L8a:
            com.waze.reports_v2.b.a r4 = new com.waze.reports_v2.b.a
            long r7 = r12.getEpochSecond()
            com.waze.rtalerts.y r9 = com.waze.rtalerts.y.f35168c
            r4.<init>(r5, r6, r7, r9, r10)
            com.waze.reports_v2.b.d r11 = r11.f16993b
            r12 = 0
            r0.f16991e = r12
            r0.f16987a = r12
            r0.f16990d = r3
            java.lang.Object r14 = r11.a(r4, r0)
            if (r14 == r1) goto Lcc
        La4:
            com.waze.reports_v2.a.a.a.d r14 = (com.waze.reports_v2.a.a.a.d) r14
            boolean r11 = r14 instanceof com.waze.reports_v2.b.c
            if (r11 == 0) goto Lb9
            com.waze.bl.c.c.i r11 = new com.waze.bl.c.c.i
            com.waze.reports_v2.b.c r14 = (com.waze.reports_v2.b.c) r14
            long r12 = r14.c()
            int r12 = (int) r12
            r11.<init>(r12)
            com.waze.bl.c.c.j r11 = (com.waze.bl.c.c.j) r11
            return r11
        Lb9:
            com.waze.reports_v2.b.b r11 = com.waze.reports_v2.b.b.f34087a
            boolean r11 = h.g.b.x.n(r14, r11)
            if (r11 == 0) goto Lc6
            com.waze.bl.c.c.h r11 = com.waze.bl.c.c.h.f17029a
            com.waze.bl.c.c.j r11 = (com.waze.bl.c.c.j) r11
            return r11
        Lc6:
            h.i r11 = new h.i
            r11.<init>()
            throw r11
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.y.b(com.waze.reports_v2.b.at, com.waze.reports_v2.b.i, h.c.e):java.lang.Object");
    }
}
