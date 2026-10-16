package com.waze.ac;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ f f13850a = new f();

    public final r a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        f fVar = this;
        if (fVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) fVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(r.class);
        } else {
            bVarC = fVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(r.class);
        }
        return (r) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
