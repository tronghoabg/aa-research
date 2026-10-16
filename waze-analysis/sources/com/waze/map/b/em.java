package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class em implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fd f28263a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28264b;

    em(fd fdVar, int i2) {
        this.f28264b = i2;
        this.f28263a = fdVar;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f28264b != 0) {
            String strC = ((com.waze.map.ct) obj).c();
            h.g.b.x.f(strC, "it");
            fd fdVar = this.f28263a;
            fd.Q(fdVar, new com.waze.car_lib.e.d(fdVar, strC, 12, null));
            return h.ab.f48028a;
        }
        String strC2 = ((com.waze.map.ct) obj).c();
        h.g.b.x.f(strC2, "it");
        fd fdVar2 = this.f28263a;
        fd.Q(fdVar2, new com.waze.car_lib.e.d(fdVar2, strC2, 13, null));
        return h.ab.f48028a;
    }
}
