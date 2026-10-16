package com.waze.parking;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ c f32953a = new c();

    public final d a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        c cVar = this;
        if (cVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) cVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(d.class);
        } else {
            bVarC = cVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(d.class);
        }
        return (d) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
