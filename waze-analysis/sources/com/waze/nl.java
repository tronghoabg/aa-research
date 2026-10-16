package com.waze;

import android.content.SharedPreferences;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nl {

    /* renamed from: a, reason: collision with root package name */
    public static final ni f32526a = new ni(0);

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f32527b = h.g.a(new android.support.v4.a.a.c(11));

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.stats.ax f32528c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.network.d.h f32529d;

    /* renamed from: e, reason: collision with root package name */
    private final SharedPreferences f32530e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f32531f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32532g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f32533h;

    public nl(com.waze.stats.ax axVar, com.waze.network.d.h hVar, com.waze.shared_infra.r.y yVar, SharedPreferences sharedPreferences, com.waze.sharedui.profile.b bVar, com.waze.uid.b.ab abVar, com.waze.copilot.data.b.a aVar, kotlinx.coroutines.ab abVar2, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(axVar, "statsReporter");
        h.g.b.x.f(hVar, "authenticationRepository");
        h.g.b.x.f(yVar, "userState");
        h.g.b.x.f(sharedPreferences, "sharedPreferences");
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(abVar, "uidEventsController");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(abVar2, "dispatcher");
        h.g.b.x.f(eVar, "logger");
        this.f32528c = axVar;
        this.f32529d = hVar;
        this.f32530e = sharedPreferences;
        this.f32531f = aVar;
        this.f32532g = eVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(abVar2);
        this.f32533h = afVarE;
        eVar.a("Initializing WazeUserCleanupManager");
        h.g.b.ap apVar = new h.g.b.ap();
        kotlinx.coroutines.b.ch chVarF = bVar.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new dn(chVarF, 9)), new nh(this, apVar, null)), afVarE);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(yVar.a(), new eh(this, (h.c.e) null, 4)), afVarE);
    }

    public static final nl a() {
        return (nl) f32527b.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.b(r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.nl r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.nj
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.nj r0 = (com.waze.nj) r0
            int r1 = r0.f32522c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32522c = r1
            goto L18
        L13:
            com.waze.nj r0 = new com.waze.nj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32520a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32522c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L55
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
            com.waze.shared_infra.i.e r6 = r5.f32532g
            java.lang.String r2 = "User changed. Cleaning up stats and access token"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.e(r2)
            r0.f32522c = r4
            java.lang.Object r6 = r5.j(r0)
            if (r6 != r1) goto L4b
            goto L58
        L4b:
            com.waze.network.d.h r5 = r5.f32529d
            r0.f32522c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L58
        L55:
            h.ab r5 = h.ab.f48028a
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nl.f(com.waze.nl, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void g(nl nlVar) {
        nlVar.f32532g.g("onLogin: cleanup unauthenticated stats");
        kotlinx.coroutines.aj.z(nlVar.f32533h, null, null, new ck(nlVar, (h.c.e) null, 16), 3);
    }

    public static final /* synthetic */ void h(nl nlVar) {
        nlVar.f32532g.g("onLogout: clearing user data");
        kotlinx.coroutines.aj.z(nlVar.f32533h, null, null, new ck(nlVar, (h.c.e) null, 17, (byte[]) null), 3);
        nlVar.k();
        nlVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(h.c.e eVar) {
        Object objA = this.f32528c.a(eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }

    private final void k() {
        this.f32532g.g("clearing Keys shared preferences");
        this.f32530e.edit().clear().apply();
    }

    private final void l() {
        this.f32532g.g("clearing uid data");
        com.waze.shared_infra.i.h.k("UidEventsController", "clear persistence storage");
        com.waze.uid.d.q.f44463a.a().f44465c.b();
    }

    public final void i() {
        this.f32532g.g("doDeleteAccountCleanup clearing user data");
        k();
        l();
    }
}
