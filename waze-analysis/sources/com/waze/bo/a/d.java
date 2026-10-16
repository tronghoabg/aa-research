package com.waze.bo.a;

import com.waze.modules.c.de;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f17167a;

    public d(a aVar) {
        x.f(aVar, "routeSettingsDataSource");
        this.f17167a = aVar;
    }

    @Override // com.waze.bo.a.c
    public final de a() {
        de deVar = de.f30053a;
        return com.waze.aj.b.e(this.f17167a.c());
    }

    @Override // com.waze.bo.a.c
    public final e b() {
        a aVar = this.f17167a;
        return new e(aVar.l(), aVar.i(), aVar.b(), aVar.k(), aVar.a(), aVar.h(), aVar.c(), aVar.g());
    }

    @Override // com.waze.bo.a.c
    public final void c(boolean z) {
        this.f17167a.d(z);
    }

    @Override // com.waze.bo.a.c
    public final void d(boolean z) {
        this.f17167a.e(z);
    }

    @Override // com.waze.bo.a.c
    public final void e(de deVar) {
        x.f(deVar, "value");
        this.f17167a.f(deVar);
    }

    @Override // com.waze.bo.a.c
    public final boolean f() {
        return this.f17167a.j();
    }
}
