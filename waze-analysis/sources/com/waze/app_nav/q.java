package com.waze.app_nav;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ q f15437a = new q();

    public final w a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        q qVar = this;
        if (qVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) qVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(w.class);
        } else {
            bVarC = qVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(w.class);
        }
        return (w) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
