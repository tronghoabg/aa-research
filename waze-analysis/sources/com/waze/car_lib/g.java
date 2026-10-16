package com.waze.car_lib;

import com.waze.navigate.db;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final db f19788a;

    public g(db dbVar) {
        h.g.b.x.f(dbVar, "navigationController");
        this.f19788a = dbVar;
    }

    public final kotlinx.coroutines.b.k a(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "isCameraTrackingUserLocation");
        return kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(new f(this.f19788a.e()), kVar, new c(null)));
    }
}
