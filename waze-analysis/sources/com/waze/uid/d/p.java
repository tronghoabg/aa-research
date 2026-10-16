package com.waze.uid.d;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements org.a.d.a.a {
    public final q a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        p pVar = this;
        if (pVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) pVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(q.class);
        } else {
            bVarC = pVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(q.class);
        }
        return (q) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
