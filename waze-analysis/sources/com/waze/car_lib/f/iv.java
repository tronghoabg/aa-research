package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iv extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.i f19730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(com.waze.shared_infra.i.i iVar, kotlinx.coroutines.af afVar) {
        super(iy.f19733a, afVar);
        h.g.b.x.f(iVar, "logsReporter");
        h.g.b.x.f(afVar, "scope");
        this.f19730a = iVar;
    }

    public final void a() {
        this.f19730a.a();
        H(ix.f19732a);
    }
}
