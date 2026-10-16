package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f34165a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34166b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.aa f34167c;

    /* renamed from: d, reason: collision with root package name */
    private final ds f34168d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34169e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34170f;

    /* renamed from: g, reason: collision with root package name */
    private final h.c.j f34171g;

    /* renamed from: h, reason: collision with root package name */
    private int f34172h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f34173i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34174j;

    public ad(String str, String str2, com.waze.reports_v2.b.aa aaVar, ds dsVar, com.waze.shared_infra.q.e eVar, com.waze.reports_v2.d.j jVar, h.c.j jVar2) {
        h.g.b.x.f(str, "conversationId");
        h.g.b.x.f(str2, "ugcContextId");
        h.g.b.x.f(aaVar, "api");
        h.g.b.x.f(dsVar, "reportPositionSaver");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(jVar, "reportingStatsSender");
        h.g.b.x.f(jVar2, "coroutineContext");
        this.f34165a = str;
        this.f34166b = str2;
        this.f34167c = aaVar;
        this.f34168d = dsVar;
        this.f34169e = eVar;
        this.f34170f = jVar;
        this.f34171g = jVar2;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationalReportingController");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34174j = eVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r12, com.waze.reports_v2.b.ac r13, h.g.a.l r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.ad.h(java.lang.String, com.waze.reports_v2.b.ac, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r2 != r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r20, java.lang.String r21, com.waze.reports_v2.b.ac r22, h.c.e r23) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.ad.b(java.lang.String, java.lang.String, com.waze.reports_v2.b.ac, h.c.e):java.lang.Object");
    }

    public final Object c(String str, String str2, com.waze.reports_v2.b.ac acVar, h.c.e eVar) {
        this.f34174j.a("Request to send prompt: ".concat(str));
        int i2 = this.f34172h + 1;
        this.f34172h = i2;
        this.f34170f.v(this.f34166b, this.f34165a, str, i2, str2, acVar);
        return h(str2, acVar, new ac(this, str, str2, acVar, (h.c.e) null, 0), eVar);
    }

    public final String d() {
        return this.f34165a;
    }

    public final String e() {
        return this.f34166b;
    }

    public final boolean f() {
        return this.f34173i;
    }
}
