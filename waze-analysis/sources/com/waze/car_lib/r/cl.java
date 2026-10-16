package com.waze.car_lib.r;

import com.waze.car_lib.f.jg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cl {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21221a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.login.m f21222b;

    public cl(com.waze.shared_infra.o.a aVar, com.waze.car_lib.login.m mVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(mVar, "loginController");
        this.f21221a = aVar;
        this.f21222b = mVar;
    }

    public final ae a(String str, jg jgVar) {
        h.g.b.x.f(str, "userName");
        h.g.b.x.f(jgVar, "coordinatorController");
        return new ae(this.f21221a, this.f21222b, jgVar, str);
    }
}
