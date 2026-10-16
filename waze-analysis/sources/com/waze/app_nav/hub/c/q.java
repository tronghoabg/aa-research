package com.waze.app_nav.hub.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f15328a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b f15329b;

    q(s sVar) {
        this.f15328a = sVar;
        this.f15329b = sVar.f15333b;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final kotlinx.coroutines.b.k a() {
        return this.f15329b.a();
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void b() {
        this.f15329b.b();
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void c() {
        s sVar = this.f15328a;
        sVar.f15333b.c();
        sVar.f15335d.e(false);
    }

    public final String toString() {
        return this.f15328a.f15333b.toString();
    }
}
