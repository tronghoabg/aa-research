package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dh implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ dh f41356a = new dh();

    public final dq a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        dh dhVar = this;
        if (dhVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) dhVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(dq.class);
        } else {
            bVarC = dhVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(dq.class);
        }
        return (dq) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
