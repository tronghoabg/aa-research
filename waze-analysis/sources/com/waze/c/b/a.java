package com.waze.c.b;

import com.waze.c.d.az;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f18223a;

    /* renamed from: b, reason: collision with root package name */
    private final az f18224b;

    public a(d dVar, az azVar) {
        x.f(dVar, "impl");
        x.f(azVar, "currentNavigatingDestinationProvider");
        this.f18223a = dVar;
        this.f18224b = azVar;
    }

    @Override // com.waze.c.b.b
    public final Object a(az azVar, boolean z, h.c.e eVar) {
        return this.f18223a.a(azVar, z, eVar);
    }

    public final Object b(boolean z, h.c.e eVar) {
        return a(this.f18224b, z, eVar);
    }

    public final ch c() {
        return this.f18223a.b();
    }
}
