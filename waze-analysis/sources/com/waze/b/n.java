package com.waze.b;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ n f16157a = new n();

    public final o a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        n nVar = this;
        if (nVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) nVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(o.class);
        } else {
            bVarC = nVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(o.class);
        }
        return (o) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
