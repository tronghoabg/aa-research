package com.waze.modules.navigation;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements bp, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f30428a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30429b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.b.g f30430c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f30431d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f30432e;

    public f(kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar, com.waze.navigate.b.g gVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(gVar, "navigationStatsSender");
        this.f30428a = afVar;
        this.f30429b = eVar;
        this.f30430c = gVar;
        this.f30432e = kotlinx.coroutines.h.i.c();
    }

    public static final /* synthetic */ void f(f fVar, com.waze.av.d.t tVar) {
        com.waze.navigate.b.f fVar2;
        ah ahVarA = tVar.e().a();
        ah ahVar = ah.f30285a;
        switch (ahVarA.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                fVar2 = null;
                break;
            case 1:
                fVar2 = com.waze.navigate.b.f.f31061a;
                break;
            case 2:
                fVar2 = com.waze.navigate.b.f.f31062b;
                break;
            case 7:
                fVar2 = com.waze.navigate.b.f.f31063c;
                break;
            case 12:
            case 21:
                fVar2 = com.waze.navigate.b.f.f31065e;
                break;
            default:
                throw new h.i();
        }
        if (fVar2 != null) {
            fVar.f30430c.f(fVar2);
        }
    }

    private final kotlinx.coroutines.am h(com.waze.av.d.t tVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        kotlinx.coroutines.aj.z(this.f30428a, null, null, new e(this, tVar, completableDeferredJ, null), 3);
        return completableDeferredJ;
    }

    public final com.waze.shared_infra.i.e a() {
        return this.f30429b;
    }

    @Override // com.waze.modules.navigation.bp
    public final com.waze.shared_infra.s.c b(ao aoVar) {
        h.g.b.x.f(aoVar, "params");
        return new com.waze.shared_infra.s.c(h(new br(aoVar)));
    }

    @Override // com.waze.modules.navigation.bp
    public final com.waze.shared_infra.s.c g(ao aoVar, com.waze.google_assistant.an anVar) {
        h.g.b.x.f(aoVar, "params");
        h.g.b.x.f(anVar, "futureNavigationTime");
        return new com.waze.shared_infra.s.c(h(new bq(aoVar, anVar)));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
