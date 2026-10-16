package com.google.firebase.crashlytics.a.d;

import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    final AtomicMarkableReference f9269a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f9270b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f9271c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9272d;

    public s(t tVar, boolean z) {
        Objects.requireNonNull(tVar);
        this.f9270b = tVar;
        this.f9271c = new AtomicReference(null);
        this.f9272d = z;
        this.f9269a = new AtomicMarkableReference(new o(true != z ? 1024 : 8192), false);
    }

    public static /* synthetic */ void b(s sVar) throws Throwable {
        Map mapB = null;
        sVar.f9271c.set(null);
        synchronized (sVar) {
            AtomicMarkableReference atomicMarkableReference = sVar.f9269a;
            if (atomicMarkableReference.isMarked()) {
                mapB = ((o) atomicMarkableReference.getReference()).b();
                atomicMarkableReference.set((o) atomicMarkableReference.getReference(), false);
            }
        }
        if (mapB != null) {
            t tVar = sVar.f9270b;
            tVar.f9273a.h(tVar.f9275c, mapB, sVar.f9272d);
        }
    }

    private final void e() {
        Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.a.d.r
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                s.b(this.f9268a);
                return null;
            }
        };
        if (a.a.g(this.f9271c, callable)) {
            this.f9270b.f9274b.a(callable);
        }
    }

    public final Map a() {
        return ((o) this.f9269a.getReference()).b();
    }

    public final void c() {
        synchronized (this) {
            AtomicMarkableReference atomicMarkableReference = this.f9269a;
            ((o) atomicMarkableReference.getReference()).c(null);
            atomicMarkableReference.set((o) atomicMarkableReference.getReference(), true);
        }
        e();
    }

    public final void d(String str, String str2) {
        synchronized (this) {
            AtomicMarkableReference atomicMarkableReference = this.f9269a;
            if (((o) atomicMarkableReference.getReference()).d(str, str2)) {
                atomicMarkableReference.set((o) atomicMarkableReference.getReference(), true);
                e();
            }
        }
    }
}
