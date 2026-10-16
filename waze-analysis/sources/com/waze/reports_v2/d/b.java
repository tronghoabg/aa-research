package com.waze.reports_v2.d;

import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ b f34556a = new b();

    public final j a() {
        org.a.d.k.b bVarC;
        m mVar;
        b bVar = this;
        if (bVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) bVar).l();
            int i2 = ar.f48106a;
            mVar = new m(j.class);
        } else {
            bVarC = bVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(j.class);
        }
        return (j) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
