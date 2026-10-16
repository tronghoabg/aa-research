package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ku implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ku f25069a = new ku();

    public final kw a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        ku kuVar = this;
        if (kuVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) kuVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(kw.class);
        } else {
            bVarC = kuVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(kw.class);
        }
        return (kw) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
