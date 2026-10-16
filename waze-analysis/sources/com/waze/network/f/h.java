package com.waze.network.f;

import com.waze.authentication.ao;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements ao {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.install.a f32306a;

    public h(com.waze.install.a aVar) {
        h.g.b.x.f(aVar, "geoConfigController");
        this.f32306a = aVar;
    }

    @Override // com.waze.authentication.ao
    public final Object a(h.c.e eVar) {
        Object objA = this.f32306a.a(eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }
}
