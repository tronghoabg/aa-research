package com.google.firebase.sessions.a;

import com.google.firebase.crashlytics.a.c.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f10763a;

    /* renamed from: b, reason: collision with root package name */
    private j f10764b;

    public a(kotlinx.coroutines.h.a aVar) {
        x.f(aVar, "mutex");
        this.f10763a = aVar;
        this.f10764b = null;
    }

    public final kotlinx.coroutines.h.a a() {
        return this.f10763a;
    }

    public final j b() {
        return this.f10764b;
    }

    public final void c(j jVar) {
        this.f10764b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f10763a, aVar.f10763a) && x.n(this.f10764b, aVar.f10764b);
    }

    public final int hashCode() {
        int iHashCode = this.f10763a.hashCode() * 31;
        j jVar = this.f10764b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f10763a + ", subscriber=" + this.f10764b + ")";
    }
}
