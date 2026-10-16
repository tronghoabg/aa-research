package com.waze.bw.c.a;

import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final h f17764a;

    public k(h hVar) {
        x.f(hVar, "startStateConfigDataSource");
        this.f17764a = hVar;
    }

    @Override // com.waze.bw.c.a.j
    public final int a() {
        return (int) this.f17764a.d();
    }

    @Override // com.waze.bw.c.a.j
    public final int b() {
        return (int) n.k(this.f17764a.e(), 0L);
    }

    @Override // com.waze.bw.c.a.j
    public final int c() {
        return (int) n.k(this.f17764a.f(), 0L);
    }

    @Override // com.waze.bw.c.a.j
    public final long d() {
        h.o.c cVar = h.o.a.f48264a;
        return h.o.c.j(this.f17764a.a(), h.o.d.f48273d);
    }

    @Override // com.waze.bw.c.a.j
    public final long e() {
        return this.f17764a.b();
    }

    @Override // com.waze.bw.c.a.j
    public final long f() {
        return this.f17764a.c();
    }

    @Override // com.waze.bw.c.a.j
    public final long g() {
        h.o.c cVar = h.o.a.f48264a;
        return h.o.c.j(this.f17764a.g(), h.o.d.f48273d);
    }

    @Override // com.waze.bw.c.a.j
    public final boolean h() {
        return this.f17764a.i();
    }

    @Override // com.waze.bw.c.a.j
    public final boolean i() {
        return x.n(this.f17764a.h(), "latam");
    }
}
