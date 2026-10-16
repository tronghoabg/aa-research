package com.waze.perf.tracer;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final g f33074a;

    /* renamed from: b, reason: collision with root package name */
    private final g f33075b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f33076c;

    public i(g gVar, g gVar2, h.g.a.a aVar) {
        x.f(gVar, "loggerTracer");
        x.f(gVar2, "firebaseTracer");
        x.f(aVar, "globalEnabled");
        this.f33074a = gVar;
        this.f33075b = gVar2;
        this.f33076c = aVar;
    }

    @Override // com.waze.perf.tracer.h
    public final g a() {
        return ((Boolean) this.f33076c.invoke()).booleanValue() ? this.f33075b : this.f33074a;
    }
}
