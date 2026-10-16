package org.a.d.i;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f56407a;

    public b(String str) {
        x.f(str, "value");
        this.f56407a = str;
    }

    @Override // org.a.d.i.a
    public final String a() {
        return this.f56407a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f56407a, ((b) obj).f56407a);
    }

    public final int hashCode() {
        return this.f56407a.hashCode();
    }

    public final String toString() {
        return this.f56407a;
    }
}
