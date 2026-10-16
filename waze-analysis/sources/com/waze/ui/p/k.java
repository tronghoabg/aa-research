package com.waze.ui.p;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f43204a = new k();

    public final u a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        k kVar = this;
        if (kVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) kVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(u.class);
        } else {
            bVarC = kVar.getKoin().a().c();
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
