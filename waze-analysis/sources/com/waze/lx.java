package com.waze;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lx implements org.a.d.a.a {
    public final Context a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        lx lxVar = this;
        if (lxVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) lxVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(Context.class);
        } else {
            bVarC = lxVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(Context.class);
        }
        return (Context) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
