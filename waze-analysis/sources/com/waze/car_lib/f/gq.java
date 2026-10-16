package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gq extends ih {

    /* renamed from: d, reason: collision with root package name */
    private final gr f19623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(gr grVar, com.waze.install.a aVar, com.waze.shared_infra.o.a aVar2) {
        super(grVar, aVar, aVar2);
        h.g.b.x.f(grVar, "controller");
        h.g.b.x.f(aVar, "geoConfigController");
        h.g.b.x.f(aVar2, "stringProvider");
        this.f19623d = grVar;
    }

    @Override // com.waze.car_lib.f.ih, com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19623d;
    }

    @Override // com.waze.car_lib.f.ih
    /* renamed from: f */
    public final /* synthetic */ il b() {
        return this.f19623d;
    }
}
