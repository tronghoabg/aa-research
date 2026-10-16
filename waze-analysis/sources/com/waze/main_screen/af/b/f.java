package com.waze.main_screen.af.b;

import com.waze.asks.as;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f25795a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f25796b;

    f(l lVar, i iVar) {
        this.f25795a = lVar;
        this.f25796b = iVar;
    }

    public final void a() {
        this.f25796b.b();
        this.f25795a.invoke(0);
    }

    public final void b(as asVar, com.waze.asks.d dVar) {
        x.f(asVar, "question");
        x.f(dVar, "answer");
        this.f25796b.c(asVar, dVar);
        this.f25795a.invoke(0);
    }

    public final void c(as asVar) {
        x.f(asVar, "question");
        this.f25796b.d(asVar);
        this.f25795a.invoke(0);
    }

    public final void d(as asVar) {
        x.f(asVar, "question");
        this.f25796b.e(asVar);
        this.f25795a.invoke(0);
    }

    public final void e(int i2) {
        this.f25795a.invoke(Integer.valueOf(i2));
    }
}
