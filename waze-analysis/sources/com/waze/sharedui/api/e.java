package com.waze.sharedui.api;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f38797a;

    /* renamed from: b, reason: collision with root package name */
    private final h.o.h f38798b;

    /* renamed from: c, reason: collision with root package name */
    private AuthParameters f38799c;

    /* renamed from: d, reason: collision with root package name */
    private h.o.f f38800d;

    static {
        h.o.c cVar = h.o.a.f48264a;
        f38797a = h.o.c.i(5, h.o.d.f48274e);
    }

    public e(h.o.h hVar) {
        x.f(hVar, "timeSource");
        this.f38798b = hVar;
    }

    @Override // com.waze.sharedui.api.d
    public final synchronized AuthParameters a() {
        h.o.f fVar = this.f38800d;
        if (this.f38799c != null && fVar != null && h.o.a.c(fVar.a(), f38797a) <= 0) {
            return this.f38799c;
        }
        this.f38799c = null;
        this.f38800d = null;
        return null;
    }

    @Override // com.waze.sharedui.api.d
    public final synchronized void b() {
        this.f38799c = null;
        this.f38800d = null;
    }

    @Override // com.waze.sharedui.api.d
    public final synchronized void c(AuthParameters authParameters) {
        x.f(authParameters, "authParameters");
        this.f38799c = authParameters;
        this.f38800d = this.f38798b.a();
    }
}
