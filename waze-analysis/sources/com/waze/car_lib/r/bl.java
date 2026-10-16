package com.waze.car_lib.r;

import com.waze.navigate.DriveToNativeManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f21058a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21059b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21060c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21061d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21062e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f21063f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f21064g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f21065h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f21066i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f21067j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f21068k;

    public bl(com.waze.settings.f.b.b bVar, DriveToNativeManager driveToNativeManager, com.waze.car_lib.f.cl clVar, com.waze.settings.eb ebVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bVar, "hovSettingsStateHolder");
        h.g.b.x.f(driveToNativeManager, "driveNativeManager");
        h.g.b.x.f(clVar, "controller");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f21062e = bVar;
        this.f21068k = driveToNativeManager;
        this.f21063f = clVar;
        this.f21067j = ebVar;
        this.f21066i = eVar;
        this.f21061d = com.waze.car_lib.p.i.f20808a;
        this.f21060c = kotlinx.coroutines.b.ck.b(h.a.i.h());
        this.f21059b = kotlinx.coroutines.b.ck.b(h.a.i.d(h.a.i.h()));
        this.f21058a = kotlinx.coroutines.b.ck.b(0);
        this.f21065h = kotlinx.coroutines.b.ck.b("");
        this.f21064g = kotlinx.coroutines.b.ck.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r7v26, types: [com.waze.settings.f.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [kotlinx.coroutines.b.bn, kotlinx.coroutines.b.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.car_lib.r.ac f(com.waze.car_lib.r.bl r5, java.util.List r6, java.util.List r7, java.lang.String r8, com.waze.car_lib.r.ab r9, int r10) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.bl.f(com.waze.car_lib.r.bl, java.util.List, java.util.List, java.lang.String, com.waze.car_lib.r.ab, int):com.waze.car_lib.r.ac");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.b.bn, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public static final /* synthetic */ void g(bl blVar) {
        if (blVar.j()) {
            ?? r0 = blVar.f21058a;
            r0.e(Integer.valueOf(((Number) r0.d()).intValue() + 1));
            ?? r1 = blVar.f21066i;
            ?? r4 = blVar.f21059b;
            r1.a("displaying chunk " + r0.d() + " out of " + (((List) r4.d()).size() - 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.settings.f.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.settings.eb, java.lang.Object] */
    public static /* synthetic */ h.ab h(bl blVar, com.waze.settings.f.b.a aVar) {
        blVar.f21064g.e(true);
        boolean zC = aVar.c();
        blVar.f21062e.e(aVar.a(), !zC);
        if (!zC) {
            blVar.f21067j.l(new com.waze.settings.dx(aVar.b()));
        }
        return h.ab.f48028a;
    }

    private final List i(List list) {
        List<com.waze.settings.f.b.a> list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        for (com.waze.settings.f.b.a aVar : list2) {
            arrayList.add(new com.waze.car_lib.p.f(aVar.c(), aVar.d(), aVar.b(), new com.waze.asks.ak(this, aVar, 2)));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.b.bn, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    private final boolean j() {
        return ((Number) this.f21058a.d()).intValue() < ((List) this.f21059b.d()).size() + (-1);
    }

    private static final boolean k(String str, String str2) {
        String str3 = str;
        if (str3.length() > 0) {
            return h.n.o.F(str2, str3, true);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.waze.network.b.al, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.waze.main_screen.u.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.waze.car_lib.c.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.bw.a.b.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.waze.sound.bs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.waze.bn.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.waze.map.b.n, java.lang.Object] */
    public final bk a(com.waze.car_lib.f.ax axVar) {
        h.g.b.x.f(axVar, "coordinator");
        com.waze.bw.a.b.v vVarA = this.f21065h.a();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MapScreenViewModel");
        h.g.b.x.e(eVarD, "create(...)");
        ?? r5 = this.f21060c;
        com.waze.car_lib.b.bo boVar = (com.waze.car_lib.b.bo) this.f21061d;
        ?? r7 = this.f21059b;
        com.waze.car_lib.b.f fVar = (com.waze.car_lib.b.f) this.f21063f;
        com.waze.network.b.y yVar = (com.waze.network.b.y) this.f21066i;
        return new bk(axVar, this.f21058a, r5, boVar, r7, fVar, this.f21062e, this.f21064g, vVarA, yVar, this.f21067j, this.f21068k, eVarD);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.settings.f.b.b, java.lang.Object] */
    public final kotlinx.coroutines.b.ch b(kotlinx.coroutines.af afVar, int i2) {
        h.g.b.x.f(afVar, "scope");
        ?? r0 = this.f21062e;
        r0.d();
        kotlinx.coroutines.b.k kVarT = kotlinx.coroutines.b.ai.t(r0.b(), r0.c(), ((com.waze.car_lib.f.cl) this.f21063f).a(), this.f21058a, kotlinx.coroutines.b.ai.w((kotlinx.coroutines.b.k) this.f21065h, 250L), new ad(this, i2, null));
        int i3 = kotlinx.coroutines.b.bz.f51630a;
        return kotlinx.coroutines.b.ai.V(kVarT, afVar, kotlinx.coroutines.b.by.b(), this.f21061d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void c() {
        if (((Boolean) this.f21064g.d()).booleanValue()) {
            com.waze.navigate.bt.reroute$default((com.waze.navigate.bt) this.f21068k, false, null, 2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.b.bn, kotlinx.coroutines.b.k] */
    public final void d() {
        ((com.waze.car_lib.f.cl) this.f21063f).c();
        this.f21058a.e(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void e(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f21065h.e(str);
    }

    public bl(com.waze.bn.b bVar, com.waze.sound.bs bsVar, kotlinx.coroutines.b.k kVar, com.waze.car_lib.b.bo boVar, com.waze.map.b.n nVar, com.waze.car_lib.b.f fVar, com.waze.network.b.al alVar, com.waze.bw.a.b.k kVar2, com.waze.network.b.y yVar, com.waze.main_screen.u.c cVar, com.waze.car_lib.c.i iVar) {
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(kVar, "configValueShutdownEnabled");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(kVar2, "startStateCarViewModelFactory");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(cVar, "getPredictionDataUseCase");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        this.f21059b = bVar;
        this.f21060c = bsVar;
        this.f21058a = kVar;
        this.f21061d = boVar;
        this.f21062e = nVar;
        this.f21063f = fVar;
        this.f21064g = alVar;
        this.f21065h = kVar2;
        this.f21066i = yVar;
        this.f21067j = cVar;
        this.f21068k = iVar;
    }
}
