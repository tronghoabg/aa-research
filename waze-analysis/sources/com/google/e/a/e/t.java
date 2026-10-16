package com.google.e.a.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final t f8459a = new t();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f8460b = new AtomicReference(new ai(new ai(), (byte[]) null));

    t() {
    }

    public static t a() {
        return f8459a;
    }

    public final synchronized void b(af afVar) {
        AtomicReference atomicReference = this.f8460b;
        ai aiVar = new ai((ai) atomicReference.get());
        aiVar.i(afVar);
        atomicReference.set(new ai(aiVar, (byte[]) null));
    }

    public final synchronized void c(aj ajVar) {
        AtomicReference atomicReference = this.f8460b;
        ai aiVar = new ai((ai) atomicReference.get());
        aiVar.j(ajVar);
        atomicReference.set(new ai(aiVar, (byte[]) null));
    }

    public final Object d(com.google.e.a.n nVar, Class cls) {
        return ((ai) this.f8460b.get()).d(nVar, cls);
    }

    public final Object e(com.google.d.m.a.a.b bVar, Class cls) {
        return ((ai) this.f8460b.get()).g(bVar, cls);
    }
}
