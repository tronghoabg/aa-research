package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f18324a;

    public at(org.a.d.a.a aVar) {
        this.f18324a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.c.d.ax, java.lang.Object] */
    @Override // h.g.a.a
    public final ax invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f18324a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ax.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(ax.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
