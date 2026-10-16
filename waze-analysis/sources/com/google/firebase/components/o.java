package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final c f8965a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8966b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set f8967c = new HashSet();

    o(c cVar) {
        this.f8965a = cVar;
    }

    final c a() {
        return this.f8965a;
    }

    final Set b() {
        return this.f8966b;
    }

    final void c(o oVar) {
        this.f8966b.add(oVar);
    }

    final void d(o oVar) {
        this.f8967c.add(oVar);
    }

    final void e(o oVar) {
        this.f8967c.remove(oVar);
    }

    final boolean f() {
        return this.f8966b.isEmpty();
    }

    final boolean g() {
        return this.f8967c.isEmpty();
    }
}
