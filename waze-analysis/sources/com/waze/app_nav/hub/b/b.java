package com.waze.app_nav.hub.b;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ b f15257a = new b();

    public final c a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        b bVar = this;
        if (bVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) bVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        } else {
            bVarC = bVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        }
        return (c) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
