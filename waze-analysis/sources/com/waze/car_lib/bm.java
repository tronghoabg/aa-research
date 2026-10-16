package com.waze.car_lib;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class bm extends com.waze.shared_infra.coordinators.o {

    /* renamed from: a, reason: collision with root package name */
    public CarContext f19200a;

    /* renamed from: b, reason: collision with root package name */
    public org.a.d.k.b f19201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(com.waze.shared_infra.coordinators.p pVar) {
        super(pVar, 2);
        h.g.b.x.f(pVar, "coordinatorConfig");
    }

    public final CarContext a() {
        CarContext carContext = this.f19200a;
        if (carContext != null) {
            return carContext;
        }
        h.g.b.x.j("carContext");
        return null;
    }

    public final org.a.d.k.b c() {
        org.a.d.k.b bVar = this.f19201b;
        if (bVar != null) {
            return bVar;
        }
        h.g.b.x.j("koinScope");
        return null;
    }

    public final void d(CarContext carContext) {
        h.g.b.x.f(carContext, "<set-?>");
        this.f19200a = carContext;
    }

    public final void e(org.a.d.k.b bVar) {
        h.g.b.x.f(bVar, "<set-?>");
        this.f19201b = bVar;
    }

    public bm() {
        this((byte[]) null);
    }

    public /* synthetic */ bm(byte[] bArr) {
        this(com.waze.shared_infra.coordinators.t.a());
    }
}
