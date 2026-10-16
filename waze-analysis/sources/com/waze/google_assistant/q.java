package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements org.a.d.a.a {
    public final aa a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        q qVar = this;
        if (qVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) qVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(aa.class);
        } else {
            bVarC = qVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(aa.class);
        }
        return (aa) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
