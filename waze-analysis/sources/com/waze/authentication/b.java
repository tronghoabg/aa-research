package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f15753a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15754b;

    public b(org.a.d.a.a aVar, int i2) {
        this.f15754b = i2;
        this.f15753a = aVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f15754b;
        org.a.d.a.a aVar = this.f15753a;
        if (i2 != 0) {
            if (aVar instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL = ((org.a.d.a.b) aVar).l();
                int i3 = h.g.b.ar.f48106a;
                return bVarL.a(new h.g.b.m(al.class), null, null);
            }
            org.a.d.k.b bVarC = aVar.getKoin().a().c();
            int i4 = h.g.b.ar.f48106a;
            return bVarC.a(new h.g.b.m(al.class), null, null);
        }
        if (aVar instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL2 = ((org.a.d.a.b) aVar).l();
            int i5 = h.g.b.ar.f48106a;
            return bVarL2.a(new h.g.b.m(ar.class), null, null);
        }
        org.a.d.k.b bVarC2 = aVar.getKoin().a().c();
        int i6 = h.g.b.ar.f48106a;
        return bVarC2.a(new h.g.b.m(ar.class), null, null);
    }
}
