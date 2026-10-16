package com.waze.config;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ g f22636a = new g();

    public final h a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        g gVar = this;
        if (gVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) gVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(h.class);
        } else {
            bVarC = gVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(h.class);
        }
        return (h) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
