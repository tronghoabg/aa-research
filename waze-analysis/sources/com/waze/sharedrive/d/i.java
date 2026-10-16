package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.q f38247a;

    public i(com.waze.sharedrive.q qVar) {
        h.g.b.x.f(qVar, "error");
        this.f38247a = qVar;
    }

    public final com.waze.sharedrive.q a() {
        return this.f38247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f38247a, ((i) obj).f38247a);
    }

    public final int hashCode() {
        return this.f38247a.hashCode();
    }

    public final String toString() {
        return "FetchError(error=" + this.f38247a + ")";
    }
}
