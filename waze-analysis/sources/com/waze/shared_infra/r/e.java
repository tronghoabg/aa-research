package com.waze.shared_infra.r;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f37961a;

    public e(org.a.d.a.a aVar) {
        this.f37961a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.shared_infra.r.o, java.lang.Object] */
    @Override // h.g.a.a
    public final o invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f37961a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(o.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(o.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
