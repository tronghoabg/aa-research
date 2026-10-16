package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as implements bp {

    /* renamed from: a, reason: collision with root package name */
    private final bn f17969a;

    public as(bn bnVar) {
        h.g.b.x.f(bnVar, "favorite");
        this.f17969a = bnVar;
    }

    public final bn a() {
        return this.f17969a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && h.g.b.x.n(this.f17969a, ((as) obj).f17969a);
    }

    public final int hashCode() {
        return this.f17969a.hashCode();
    }

    public final String toString() {
        return "NamedFavoriteLongClicked(favorite=" + this.f17969a + ")";
    }
}
