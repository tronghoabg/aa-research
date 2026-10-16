package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ av f40549a = new av();

    public final ax a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        av avVar = this;
        if (avVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) avVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ax.class);
        } else {
            bVarC = avVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ax.class);
        }
        return (ax) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
