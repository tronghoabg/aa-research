package com.google.e.a.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final v f8461a = (v) aq.a(new u());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f8462b = new AtomicReference(new an(new am()));

    public static v a() {
        return f8461a;
    }

    public final synchronized void b(f fVar) {
        AtomicReference atomicReference = this.f8462b;
        am amVar = new am((an) atomicReference.get());
        amVar.e(fVar);
        atomicReference.set(new an(amVar));
    }

    public final synchronized void c(z zVar) {
        AtomicReference atomicReference = this.f8462b;
        am amVar = new am((an) atomicReference.get());
        amVar.f(zVar);
        atomicReference.set(new an(amVar));
    }

    public final com.google.d.m.a.a.b d(com.waze.car_lib.r.ai aiVar, com.google.e.a.y yVar) {
        return ((an) this.f8462b.get()).a(aiVar, yVar);
    }

    public final com.waze.car_lib.r.ai e(com.google.d.m.a.a.b bVar, com.google.e.a.y yVar) {
        return ((an) this.f8462b.get()).b(bVar, yVar);
    }

    public final synchronized void f(f fVar) {
        AtomicReference atomicReference = this.f8462b;
        am amVar = new am((an) atomicReference.get());
        amVar.g(fVar);
        atomicReference.set(new an(amVar));
    }

    public final synchronized void g(z zVar) {
        AtomicReference atomicReference = this.f8462b;
        am amVar = new am((an) atomicReference.get());
        amVar.h(zVar);
        atomicReference.set(new an(amVar));
    }

    public final boolean h(com.waze.car_lib.r.ai aiVar) {
        return ((an) this.f8462b.get()).g(aiVar);
    }

    public final boolean i(com.google.android.libraries.e.a.f fVar) {
        return ((an) this.f8462b.get()).h(fVar);
    }

    public final com.google.d.m.a.a.b j(com.google.android.libraries.e.a.f fVar) {
        return ((an) this.f8462b.get()).i(fVar);
    }

    public final com.google.android.libraries.e.a.f k(com.google.d.m.a.a.b bVar) {
        return ((an) this.f8462b.get()).j(bVar);
    }
}
