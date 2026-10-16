package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dv implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ dv f37090a = new dv();

    public final eb a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        dv dvVar = this;
        if (dvVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) dvVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(eb.class);
        } else {
            bVarC = dvVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(eb.class);
        }
        return (eb) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
