package com.google.l;

import com.google.l.b.a.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends ab {

    /* renamed from: a, reason: collision with root package name */
    private u f12410a = null;

    c() {
    }

    private final u f() {
        u uVar = this.f12410a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.l.b.a.ab
    public final u a() {
        return f();
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) {
        return f().b(bVar);
    }

    public final void c(u uVar) {
        if (this.f12410a != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.f12410a = uVar;
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) {
        f().d(cVar, obj);
    }
}
