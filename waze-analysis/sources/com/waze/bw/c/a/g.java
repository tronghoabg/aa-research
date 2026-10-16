package com.waze.bw.c.a;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f17762a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f17763b;

    public g(a aVar) {
        x.f(aVar, "configDataSource");
        this.f17762a = aVar;
        this.f17763b = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
    }

    @Override // com.waze.bw.c.a.c
    public final kotlinx.coroutines.b.k a() {
        return ai.S(this.f17763b);
    }

    @Override // com.waze.bw.c.a.c
    public final kotlinx.coroutines.b.k b() {
        return new f(this.f17762a.b());
    }

    @Override // com.waze.bw.c.a.c
    public final void c(boolean z) {
        this.f17763b.c(Boolean.valueOf(z));
    }

    @Override // com.waze.bw.c.a.c
    public final boolean d() {
        return x.n(this.f17762a.a(), "yes");
    }
}
