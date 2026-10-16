package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f17863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.waze.av.b.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "destination");
        this.f17863a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && h.g.b.x.n(this.f17863a, ((u) obj).f17863a);
    }

    public final com.waze.av.b.n g() {
        return this.f17863a;
    }

    public final int hashCode() {
        return this.f17863a.hashCode();
    }

    public final String toString() {
        return "StartNavigation(destination=" + this.f17863a + ")";
    }
}
