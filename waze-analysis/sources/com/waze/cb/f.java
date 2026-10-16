package com.waze.cb;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f22079a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22080b;

    public /* synthetic */ f(k kVar, int i2) {
        this.f22080b = i2;
        this.f22079a = kVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f22080b;
        k kVar = this.f22079a;
        if (i2 != 0) {
            kVar.f22094c.invoke();
            com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
            com.waze.shared_infra.q.i iVar = kVar.f22093b;
            sVarC.D(com.waze.uid.stats.r.f44787b, iVar != null ? Long.valueOf(iVar.b()) : null);
            return ab.f48028a;
        }
        kVar.f22092a.invoke();
        com.waze.uid.stats.s sVarC2 = com.waze.uid.d.q.f44463a.a().c();
        com.waze.shared_infra.q.i iVar2 = kVar.f22093b;
        sVarC2.D(com.waze.uid.stats.r.f44786a, iVar2 != null ? Long.valueOf(iVar2.b()) : null);
        return ab.f48028a;
    }
}
