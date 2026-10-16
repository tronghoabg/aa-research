package com.waze.bl.b.c;

import com.waze.reports_v2.b.am;
import com.waze.reports_v2.c.ds;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements com.waze.bl.c.c.p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16928a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bl.c.c.l f16929b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f16930c;

    /* renamed from: d, reason: collision with root package name */
    private final am f16931d;

    /* renamed from: e, reason: collision with root package name */
    private final ds f16932e;

    public ac(com.waze.shared_infra.i.e eVar, com.waze.bl.c.c.l lVar, com.waze.shared_infra.i.b bVar, am amVar, ds dsVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(lVar, "config");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(amVar, "mapIssueApi");
        h.g.b.x.f(dsVar, "reportPositionSaver");
        this.f16928a = eVar;
        this.f16929b = lVar;
        this.f16930c = bVar;
        this.f16931d = amVar;
        this.f16932e = dsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
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
            boolean r0 = r6 instanceof com.waze.bl.b.c.aa
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.b.c.aa r0 = (com.waze.bl.b.c.aa) r0
            int r1 = r0.f16922c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16922c = r1
            goto L18
        L13:
            com.waze.bl.b.c.aa r0 = new com.waze.bl.b.c.aa
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16920a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16922c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L6b
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
            com.waze.reports_v2.c.ds r6 = r5.f16932e
            r0.f16922c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L6e
        L43:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
            if (r6 != 0) goto L6d
            r6 = r5
            com.waze.bl.b.c.ac r6 = (com.waze.bl.b.c.ac) r6
            com.waze.shared_infra.i.b r6 = r5.f16930c
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r4 = "SendConversationalMapIssueReportUseCase : report location is null"
            r2.<init>(r4)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.waze.shared_infra.h.b.f(r6, r2)
            com.waze.shared_infra.i.e r6 = r5.f16928a
            java.lang.String r2 = "report location is null, trying to use current location as fallback."
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.b(r2)
            com.waze.reports_v2.c.ds r5 = r5.f16932e
            r0.f16922c = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 == r1) goto L6e
        L6b:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
        L6d:
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.ac.c(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r13 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bl.c.c.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.reports_v2.b.af r11, java.lang.String r12, h.c.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.waze.bl.b.c.ab
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.bl.b.c.ab r0 = (com.waze.bl.b.c.ab) r0
            int r1 = r0.f16925c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16925c = r1
            goto L18
        L13:
            com.waze.bl.b.c.ab r0 = new com.waze.bl.b.c.ab
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f16923a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16925c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r13)
            goto L75
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.String r12 = r0.f16927e
            r11 = r12
            java.lang.String r11 = (java.lang.String) r11
            com.waze.reports_v2.b.af r11 = r0.f16926d
            r2 = r11
            com.waze.reports_v2.b.af r2 = (com.waze.reports_v2.b.af) r2
            e.b.c.b(r13)
            goto L4f
        L40:
            e.b.c.b(r13)
            r0.f16926d = r11
            r0.f16927e = r12
            r0.f16925c = r4
            java.lang.Object r13 = r10.c(r0)
            if (r13 == r1) goto L97
        L4f:
            r6 = r11
            r7 = r12
            r5 = r13
            com.waze.sharedui.e.c r5 = (com.waze.sharedui.e.c) r5
            if (r5 != 0) goto L59
            com.waze.bl.c.c.m r10 = com.waze.bl.c.c.m.f17031a
            return r10
        L59:
            com.waze.bl.c.c.l r11 = r10.f16929b
            com.waze.reports_v2.b.aj r4 = new com.waze.reports_v2.b.aj
            boolean r8 = r11.a()
            com.waze.reports_v2.b.ai r9 = com.waze.reports_v2.b.ai.f34053b
            r4.<init>(r5, r6, r7, r8, r9)
            com.waze.reports_v2.b.am r10 = r10.f16931d
            r11 = 0
            r0.f16926d = r11
            r0.f16927e = r11
            r0.f16925c = r3
            java.lang.Object r13 = r10.a(r4, r0)
            if (r13 == r1) goto L97
        L75:
            com.waze.reports_v2.a.a.a.d r13 = (com.waze.reports_v2.a.a.a.d) r13
            com.waze.reports_v2.b.al r10 = com.waze.reports_v2.b.al.f34061a
            boolean r10 = h.g.b.x.n(r13, r10)
            if (r10 == 0) goto L84
            com.waze.bl.c.c.n r10 = com.waze.bl.c.c.n.f17032a
            com.waze.bl.c.c.o r10 = (com.waze.bl.c.c.o) r10
            return r10
        L84:
            com.waze.reports_v2.b.ak r10 = com.waze.reports_v2.b.ak.f34060a
            boolean r10 = h.g.b.x.n(r13, r10)
            if (r10 == 0) goto L91
            com.waze.bl.c.c.m r10 = com.waze.bl.c.c.m.f17031a
            com.waze.bl.c.c.o r10 = (com.waze.bl.c.c.o) r10
            return r10
        L91:
            h.i r10 = new h.i
            r10.<init>()
            throw r10
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.ac.b(com.waze.reports_v2.b.af, java.lang.String, h.c.e):java.lang.Object");
    }
}
