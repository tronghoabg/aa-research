package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class df implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28748a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28749b;

    public /* synthetic */ df(di diVar, int i2) {
        this.f28749b = i2;
        this.f28748a = diVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, org.a.d.a.a] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f28749b;
        if (i2 == 0) {
            return di.b((di) this.f28748a);
        }
        ?? r3 = this.f28748a;
        if (i2 != 1) {
            if (r3 instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
                int i3 = h.g.b.ar.f48106a;
                return bVarL.a(new h.g.b.m(com.waze.map.f.f.class), null, null);
            }
            org.a.d.k.b bVarC = r3.getKoin().a().c();
            int i4 = h.g.b.ar.f48106a;
            return bVarC.a(new h.g.b.m(com.waze.map.f.f.class), null, null);
        }
        if (r3 instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL2 = ((org.a.d.a.b) r3).l();
            int i5 = h.g.b.ar.f48106a;
            return bVarL2.a(new h.g.b.m(com.waze.map.f.f.class), null, null);
        }
        org.a.d.k.b bVarC2 = r3.getKoin().a().c();
        int i6 = h.g.b.ar.f48106a;
        return bVarC2.a(new h.g.b.m(com.waze.map.f.f.class), null, null);
    }

    public df(org.a.d.a.a aVar, int i2) {
        this.f28749b = i2;
        this.f28748a = aVar;
    }
}
