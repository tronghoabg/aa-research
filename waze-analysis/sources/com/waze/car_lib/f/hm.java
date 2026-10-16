package com.waze.car_lib.f;

import com.waze.mywaze.MyWazeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hm extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.ah f19671a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19672b;

    /* renamed from: c, reason: collision with root package name */
    private final MyWazeNativeManager f19673c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.c.a f19674d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.settings.ds f19675e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.o.i f19676f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.r.b.b f19677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.waze.av.b.ah ahVar, com.waze.shared_infra.o.a aVar, MyWazeNativeManager myWazeNativeManager, com.waze.car_lib.c.a aVar2, com.waze.settings.ds dsVar, com.waze.car_lib.o.i iVar, com.waze.car_lib.r.b.b bVar, kotlinx.coroutines.af afVar) {
        super(ho.f19679a, afVar);
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(myWazeNativeManager, "myWazeNativeManager");
        h.g.b.x.f(aVar2, "auditReporter");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(iVar, "aaosSettingsTreeGenerator");
        h.g.b.x.f(bVar, "hncSettingsStateHolder");
        h.g.b.x.f(afVar, "scope");
        this.f19671a = ahVar;
        this.f19672b = aVar;
        this.f19673c = myWazeNativeManager;
        this.f19674d = aVar2;
        this.f19675e = dsVar;
        this.f19676f = iVar;
        this.f19677g = bVar;
        ahVar.e();
    }

    public final com.waze.av.b.ah a() {
        return this.f19671a;
    }

    public final void b(com.waze.av.b.aa aaVar) {
        h.g.b.x.f(aaVar, "wazePlace");
        kotlinx.coroutines.aj.z(G(), null, null, new hl(aaVar, this, null), 3);
        i(ia.f19692a);
    }

    public final void c(com.waze.settings.b.f fVar) {
        h.g.b.x.f(fVar, "selectedFilter");
        H(new hs(fVar));
    }

    public final void d() {
        com.waze.settings.tree.d.n nVarH = com.waze.car_lib.o.ae.h(this.f19677g, this.f19672b, new b(this, 4, (int[]) null));
        if (nVarH != null) {
            h(nVarH);
        }
    }

    public final void e() {
        H(ht.f19684a);
    }

    public final void f() {
        h(this.f19676f.b());
    }

    public final void g() {
        h(this.f19676f.c(this.f19672b, this.f19673c, this.f19674d, this.f19675e));
    }

    public final void h(com.waze.settings.tree.d.n nVar) {
        H(new hy(nVar));
    }

    public final void i(com.waze.car_lib.p.dh dhVar) {
        h.g.b.x.f(dhVar, "reason");
        H(new hn(dhVar));
    }
}
