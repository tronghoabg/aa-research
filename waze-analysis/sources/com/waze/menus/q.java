package com.waze.menus;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j.d f29753a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.j.d dVar, int i2) {
        super(dVar.d(), dVar.g(), dVar.e() == 6);
        h.g.b.x.f(dVar, "autocompleteResult");
        this.f29753a = dVar;
        this.f29754b = i2;
        m(dVar.n());
        com.waze.shared_infra.h.c cVarF = dVar.f();
        h.g.b.x.e(cVarF, "getCoordinate(...)");
        i(cVarF);
        String strG = g();
        if (strG == null || h.n.o.G(strG)) {
            l(dVar.c());
        } else {
            k(dVar.c());
        }
        if (dVar.e() != 4 || dVar.j() == null) {
            return;
        }
        j(dVar.j());
    }

    public final int a() {
        return this.f29754b;
    }

    public final com.waze.j.d b() {
        return this.f29753a;
    }
}
