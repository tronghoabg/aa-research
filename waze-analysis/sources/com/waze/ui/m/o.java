package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f43022a;

    public o(com.waze.ui.ac.n nVar) {
        h.g.b.x.f(nVar, "text");
        this.f43022a = nVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f43022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && h.g.b.x.n(this.f43022a, ((o) obj).f43022a);
    }

    public final int hashCode() {
        return this.f43022a.hashCode();
    }

    public final String toString() {
        return "EVDirectionsUIModel(text=" + this.f43022a + ")";
    }
}
