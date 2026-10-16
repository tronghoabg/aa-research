package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private final bn f21215a;

    /* renamed from: b, reason: collision with root package name */
    private final bp f21216b;

    /* renamed from: c, reason: collision with root package name */
    private final ff f21217c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.navigate.db f21218d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.navigate.eo f21219e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21220f;

    public ck(bn bnVar, bp bpVar, ff ffVar, com.waze.navigate.db dbVar, com.waze.navigate.eo eoVar) {
        h.g.b.x.f(bnVar, "etaViewModel");
        h.g.b.x.f(bpVar, "instructionsViewModel");
        h.g.b.x.f(ffVar, "tollInfoViewModel");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        this.f21215a = bnVar;
        this.f21216b = bpVar;
        this.f21217c = ffVar;
        this.f21218d = dbVar;
        this.f21219e = eoVar;
        this.f21220f = kotlinx.coroutines.b.ck.b(null);
    }

    public final kotlinx.coroutines.b.k f(kotlinx.coroutines.af afVar, CarContext carContext, boolean z) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "carContext");
        kotlinx.coroutines.aj.z(afVar, null, null, new cj(this, carContext, z, null), 3);
        return this.f21220f;
    }
}
