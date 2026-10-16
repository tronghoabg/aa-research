package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f20400a;

    public f(org.a.d.a.a aVar) {
        this.f20400a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.ar, java.lang.Object] */
    @Override // h.g.a.a
    public final com.waze.ar invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f20400a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ar.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ar.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
