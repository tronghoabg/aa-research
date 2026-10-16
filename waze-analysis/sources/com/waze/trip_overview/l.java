package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f41484a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f41485b;

    public l(Object obj, int i2) {
        this.f41485b = i2;
        this.f41484a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.ComponentCallbacks, java.lang.Object, org.a.d.a.a] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f41485b;
        if (i2 == 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f41484a);
            int i3 = h.g.b.ar.f48106a;
            return bVarD.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        }
        ?? r3 = this.f41484a;
        if (i2 == 1) {
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(r3);
            int i4 = h.g.b.ar.f48106a;
            return bVarD2.a(new h.g.b.m(ac.class), null, null);
        }
        if (r3 instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
            int i5 = h.g.b.ar.f48106a;
            return bVarL.a(new h.g.b.m(ac.class), null, null);
        }
        org.a.d.k.b bVarC = r3.getKoin().a().c();
        int i6 = h.g.b.ar.f48106a;
        return bVarC.a(new h.g.b.m(ac.class), null, null);
    }
}
