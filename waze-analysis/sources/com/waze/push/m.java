package com.waze.push;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements org.a.d.a.a {
    public final l a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        m mVar2 = this;
        if (mVar2 instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) mVar2).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(l.class);
        } else {
            bVarC = mVar2.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(l.class);
        }
        return (l) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
