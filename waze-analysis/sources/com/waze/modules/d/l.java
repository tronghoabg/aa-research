package com.waze.modules.d;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f30231a;

    public l(org.a.d.a.a aVar) {
        this.f30231a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.be.b, java.lang.Object] */
    @Override // h.g.a.a
    public final com.waze.be.b invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f30231a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.be.b.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.be.b.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
