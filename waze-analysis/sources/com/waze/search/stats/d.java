package com.waze.search.stats;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ d f36021a = new d();

    public final s a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        d dVar = this;
        if (dVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) dVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(s.class);
        } else {
            bVarC = dVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(s.class);
        }
        return (s) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
