package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jg extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.login.m f19752a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(com.waze.car_lib.login.m mVar, kotlinx.coroutines.af afVar) {
        super(jj.f19755a, afVar);
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(afVar, "scope");
        this.f19752a = mVar;
        kotlinx.coroutines.aj.z(afVar, null, null, new ge(this, (h.c.e) null, 8), 3);
    }
}
