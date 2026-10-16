package com.waze.b;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ t f16170a = new t();

    public final u a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        t tVar = this;
        if (tVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) tVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(u.class);
        } else {
            bVarC = tVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(u.class);
        }
        return (u) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
