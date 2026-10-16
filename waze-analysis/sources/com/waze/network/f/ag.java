package com.waze.network.f;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag implements com.waze.authentication.i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.authentication.i f32280a;

    public ag(com.waze.authentication.i iVar) {
        h.g.b.x.f(iVar, "impl");
        this.f32280a = iVar;
    }

    @Override // com.waze.authentication.i
    public final Object a(com.waze.authentication.x xVar, h.c.e eVar) {
        return this.f32280a.a(xVar, eVar);
    }

    @Override // com.waze.authentication.i
    public final Object b(h.c.e eVar) {
        return this.f32280a.b(eVar);
    }

    @Override // com.waze.authentication.i
    public final ch d() {
        return this.f32280a.d();
    }

    @Override // com.waze.authentication.i
    public final ch e() {
        return this.f32280a.e();
    }

    @Override // com.waze.authentication.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object c(af afVar, boolean z, h.c.e eVar) {
        return this.f32280a.c(afVar, z, eVar);
    }
}
