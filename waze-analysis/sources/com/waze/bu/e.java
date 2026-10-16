package com.waze.bu;

import com.waze.shared_infra.r.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f17484a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f17485b;

    e(com.waze.shared_infra.i.e eVar, f fVar) {
        this.f17484a = eVar;
        this.f17485b = fVar;
    }

    @Override // com.waze.shared_infra.r.m
    public final void a() {
        this.f17484a.e("env switch");
    }

    @Override // com.waze.shared_infra.r.m
    public final void b() {
        this.f17484a.e("logged in");
        this.f17485b.f17486a.d(new d(0));
    }

    @Override // com.waze.shared_infra.r.m
    public final void c(boolean z) {
        this.f17484a.e("logged out");
        this.f17485b.f17486a.d(new d(1));
    }

    @Override // com.waze.shared_infra.r.m
    public final void d() {
        this.f17484a.e("user credentials changed");
    }
}
