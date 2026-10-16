package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class gm implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.waze.shared_infra.h.c f29159b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29160c;

    public /* synthetic */ gm(int i2, com.waze.shared_infra.h.c cVar, int i3) {
        this.f29160c = i3;
        this.f29158a = i2;
        this.f29159b = cVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f29160c;
        if (i2 == 0) {
            com.waze.shared_infra.h.c cVar = this.f29159b;
            return WazeMapNativeManager.onWazerClicked$lambda$0(this.f29158a, cVar, (com.waze.map.canvas.a.c) obj);
        }
        if (i2 == 1) {
            com.waze.shared_infra.h.c cVar2 = this.f29159b;
            return WazeMapNativeManager.onExternalPoiClicked$lambda$0(this.f29158a, cVar2, (com.waze.map.canvas.a.c) obj);
        }
        if (i2 != 2) {
            com.waze.shared_infra.h.c cVar3 = this.f29159b;
            return WazeMapNativeManager.onAlertClicked$lambda$0(this.f29158a, cVar3, (com.waze.map.canvas.a.c) obj);
        }
        com.waze.shared_infra.h.c cVar4 = this.f29159b;
        return WazeMapNativeManager.onParkingPinClicked$lambda$0(this.f29158a, cVar4, (com.waze.map.canvas.a.c) obj);
    }
}
