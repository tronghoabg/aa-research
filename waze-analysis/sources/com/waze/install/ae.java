package com.waze.install;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24730a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24731b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f24732c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f24733d;

    /* renamed from: e, reason: collision with root package name */
    private final x f24734e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f24735f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f24736g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.l f24737h;

    /* renamed from: i, reason: collision with root package name */
    private final h.g.a.l f24738i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.tide.o f24739j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.aq.o f24740k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.al.a.a f24741l;
    private final String m;

    public ae(Context context, com.waze.shared_infra.i.e eVar, h.f fVar, kotlinx.coroutines.b.k kVar, x xVar, h.g.a.l lVar, com.waze.app_nav.hub.b.c cVar, h.g.a.l lVar2, h.g.a.l lVar3, com.waze.tide.o oVar, com.waze.aq.o oVar2, com.waze.al.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(fVar, "credentialsRepository");
        h.g.b.x.f(kVar, "userUpdates");
        h.g.b.x.f(xVar, "installationRequirements");
        h.g.b.x.f(lVar, "hasLocationPermissions");
        h.g.b.x.f(cVar, "wazePopupManager");
        h.g.b.x.f(lVar2, "downloadSystemLanguage");
        h.g.b.x.f(lVar3, "needNotificationPermission");
        h.g.b.x.f(oVar, "tideController");
        h.g.b.x.f(oVar2, "integrityApiManager");
        h.g.b.x.f(aVar, "consentBumpRepository");
        this.f24730a = context;
        this.f24731b = eVar;
        this.f24732c = fVar;
        this.f24733d = kVar;
        this.f24734e = xVar;
        this.f24735f = lVar;
        this.f24736g = cVar;
        this.f24737h = lVar2;
        this.f24738i = lVar3;
        this.f24739j = oVar;
        this.f24740k = oVar2;
        this.f24741l = aVar;
        this.m = "InstallationRequirementsMonitor";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.install.ae r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.install.ab
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.install.ab r0 = (com.waze.install.ab) r0
            int r1 = r0.f24725c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24725c = r1
            goto L18
        L13:
            com.waze.install.ab r0 = new com.waze.install.ab
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f24723a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f24725c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L48
        L2f:
            e.b.c.b(r5)
            com.waze.al.a.a r5 = r4.f24741l
            kotlinx.coroutines.b.ch r5 = r5.a()
            com.waze.install.ac r2 = new com.waze.install.ac
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f24725c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.install.ae.h(com.waze.install.ae, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object i(ae aeVar, h.c.e eVar) {
        Object objE = kotlinx.coroutines.b.ai.e(aeVar.f24734e.a(), new ad(aeVar, null), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    public static final /* synthetic */ void n(ae aeVar, com.waze.shared_infra.h.b bVar) {
        if (bVar instanceof com.waze.shared_infra.r.t) {
            if (((com.waze.shared_infra.r.t) bVar).j()) {
                aeVar.f24731b.g("user is logged out, requesting credentials");
                aeVar.f24734e.e(v.f24796a);
                return;
            }
            return;
        }
        if (bVar instanceof com.waze.shared_infra.r.s) {
            if (((Boolean) aeVar.f24738i.invoke(aeVar.f24730a)).booleanValue()) {
                aeVar.f24731b.g("no notification permission");
                aeVar.f24734e.e(t.f24794a);
            }
            if (aeVar.f24739j.d()) {
                aeVar.f24731b.g("no bluetooth permission");
                aeVar.f24734e.e(p.f24790a);
            }
        }
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objD = kotlinx.coroutines.aj.d(new aa(this, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.m;
    }
}
