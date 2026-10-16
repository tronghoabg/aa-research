package com.waze.car_lib.r;

import com.waze.navigate.gb;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    private final gb f21633a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21634b;

    public ff(gb gbVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(gbVar, "tollInfoState");
        h.g.b.x.f(aVar, "stringProvider");
        this.f21633a = gbVar;
        this.f21634b = aVar;
    }

    public final kotlinx.coroutines.b.k b() {
        return new fe(this.f21633a.W(), this, 0);
    }
}
