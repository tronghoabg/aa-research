package com.waze.network.d;

import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements com.waze.authentication.i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.authentication.i f32201a;

    public h(com.waze.authentication.i iVar) {
        x.f(iVar, "impl");
        this.f32201a = iVar;
    }

    @Override // com.waze.authentication.i
    public final Object a(com.waze.authentication.x xVar, h.c.e eVar) {
        return this.f32201a.a(xVar, eVar);
    }

    @Override // com.waze.authentication.i
    public final Object b(h.c.e eVar) {
        return this.f32201a.b(eVar);
    }

    @Override // com.waze.authentication.i
    public final /* bridge */ /* synthetic */ Object c(Object obj, boolean z, h.c.e eVar) {
        return this.f32201a.c((com.waze.authentication.a) obj, z, eVar);
    }

    @Override // com.waze.authentication.i
    public final ch d() {
        return this.f32201a.d();
    }

    @Override // com.waze.authentication.i
    public final ch e() {
        return this.f32201a.e();
    }
}
