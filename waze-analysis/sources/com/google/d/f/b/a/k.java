package com.google.d.f.b.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends com.google.d.f.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final k f7712a = new k(com.google.d.f.c.a.e());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f7713b;

    k(com.google.d.f.c.a aVar) {
        this.f7713b = new AtomicReference(aVar);
    }

    public static final k b() {
        return f7712a;
    }

    @Override // com.google.d.f.c.a
    public final com.google.d.f.b.k a() {
        return ((com.google.d.f.c.a) this.f7713b.get()).a();
    }

    @Override // com.google.d.f.c.a
    public final com.google.d.f.c.j c() {
        return ((com.google.d.f.c.a) this.f7713b.get()).c();
    }

    @Override // com.google.d.f.c.a
    public final void d(String str, Level level, boolean z) {
        ((com.google.d.f.c.a) this.f7713b.get()).d(str, level, z);
    }
}
