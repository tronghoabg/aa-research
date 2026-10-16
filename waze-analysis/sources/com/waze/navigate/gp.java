package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gp implements gs {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.d.k f31444a;

    public gp(com.waze.av.d.k kVar) {
        h.g.b.x.f(kVar, "venue");
        this.f31444a = kVar;
    }

    public final com.waze.av.d.k a() {
        return this.f31444a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp) && h.g.b.x.n(this.f31444a, ((gp) obj).f31444a);
    }

    public final int hashCode() {
        return this.f31444a.hashCode();
    }

    public final String toString() {
        return "Available(venue=" + this.f31444a + ")";
    }
}
