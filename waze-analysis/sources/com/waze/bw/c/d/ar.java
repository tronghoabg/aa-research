package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar implements bp {

    /* renamed from: a, reason: collision with root package name */
    private final bn f17968a;

    public ar(bn bnVar) {
        h.g.b.x.f(bnVar, "favorite");
        this.f17968a = bnVar;
    }

    public final bn a() {
        return this.f17968a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f17968a, ((ar) obj).f17968a);
    }

    public final int hashCode() {
        return this.f17968a.hashCode();
    }

    public final String toString() {
        return "NamedFavoriteClicked(favorite=" + this.f17968a + ")";
    }
}
