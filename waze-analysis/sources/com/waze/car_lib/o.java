package com.waze.car_lib;

import androidx.car.app.CarContext;
import e.a.dw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final CarContext f20448a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f20449b;

    /* renamed from: c, reason: collision with root package name */
    private final org.a.d.k.b f20450c;

    public o(CarContext carContext, kotlinx.coroutines.af afVar, org.a.d.k.b bVar) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(afVar, "lifecycleScope");
        h.g.b.x.f(bVar, "sessionScope");
        this.f20448a = carContext;
        this.f20449b = afVar;
        this.f20450c = bVar;
        dw.g(bVar, new n(bVar, afVar, h.a.i.h(), 1));
        dw.g(bVar, new n(bVar, this, h.a.i.h(), 0));
    }

    public final CarContext a() {
        return this.f20448a;
    }

    public final org.a.d.k.b b() {
        return this.f20450c;
    }
}
