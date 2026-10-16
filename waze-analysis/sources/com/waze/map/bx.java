package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bx extends h.g.b.u implements h.g.a.p {
    bx(Object obj) {
        super(2, obj, bz.class, "onPositionUpdated", "onPositionUpdated(ILcom/waze/map/controller/MapViewController$ScreenPoint;)V", 0);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        com.waze.map.b.dw dwVar = (com.waze.map.b.dw) obj2;
        h.g.b.x.f(dwVar, "p1");
        bz.c((bz) this.receiver, iIntValue, dwVar);
        return h.ab.f48028a;
    }
}
