package com.waze.settings.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final f f36838a;

    public g(f fVar) {
        x.f(fVar, "selectedFilter");
        this.f36838a = fVar;
    }

    public final f a() {
        return this.f36838a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f36838a, ((g) obj).f36838a);
    }

    public final int hashCode() {
        return this.f36838a.hashCode();
    }

    public final String toString() {
        return "HOV(selectedFilter=" + this.f36838a + ")";
    }

    public g() {
        this(d.f36836a);
    }
}
