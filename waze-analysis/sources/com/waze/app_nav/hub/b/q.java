package com.waze.app_nav.hub.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements com.waze.app_nav.hub.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final c f15287a;

    /* renamed from: b, reason: collision with root package name */
    private final k f15288b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f15289c;

    public q(c cVar, k kVar) {
        x.f(cVar, "popupManager");
        x.f(kVar, "popup");
        this.f15287a = cVar;
        this.f15288b = kVar;
        this.f15289c = new p(cVar.a(), this);
    }

    @Override // com.waze.app_nav.hub.c.b
    public final kotlinx.coroutines.b.k a() {
        return this.f15289c;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void b() {
        this.f15287a.c(this.f15288b);
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void c() {
        this.f15287a.b(this.f15288b);
    }

    public final String toString() {
        return "WazePopupPresenter(" + this.f15288b.c() + ")";
    }
}
