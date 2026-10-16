package com.waze.car_lib.i.a;

import androidx.car.app.CarContext;
import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final h f19852a;

    /* renamed from: b, reason: collision with root package name */
    private final u f19853b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19854c;

    public b(h hVar, u uVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(uVar, "rendererPresenter");
        h.g.b.x.f(eVar, "logger");
        this.f19852a = hVar;
        this.f19853b = uVar;
        this.f19854c = eVar;
    }

    public final a a(CarContext carContext, Lifecycle lifecycle) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(lifecycle, "lifecycle");
        return new a(carContext, this.f19852a, this.f19853b, lifecycle, this.f19854c);
    }
}
