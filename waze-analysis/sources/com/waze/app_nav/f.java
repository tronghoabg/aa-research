package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final g f15204a;

    public f(g gVar) {
        h.g.b.x.f(gVar, "showMapCover");
        this.f15204a = gVar;
    }

    public final g a() {
        return this.f15204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f15204a == ((f) obj).f15204a;
    }

    public final int hashCode() {
        return this.f15204a.hashCode();
    }

    public final String toString() {
        return "MapBehavior(showMapCover=" + this.f15204a + ")";
    }
}
