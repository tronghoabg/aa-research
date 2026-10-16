package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f36864a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f36865b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f36866c;

    public bf(kotlinx.coroutines.af afVar, kotlinx.coroutines.b.k kVar, kotlinx.coroutines.b.k kVar2) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "isNavigatingFlow");
        h.g.b.x.f(kVar2, "configChangeFlow");
        this.f36864a = afVar;
        this.f36865b = com.waze.shared_infra.i.a.d("RoutingSettingsChangeMonitor");
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new be(false, false));
        this.f36866c = bnVarB;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVar, new bc(this, null)), afVar);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVar2, new cz(this, (h.c.e) null, 1)), afVar);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(bnVarB, new dp(this, (h.c.e) null, 1)), afVar);
    }

    public final com.waze.shared_infra.i.e a() {
        return this.f36865b;
    }

    public final boolean c() {
        return ((be) this.f36866c.d()).a();
    }
}
