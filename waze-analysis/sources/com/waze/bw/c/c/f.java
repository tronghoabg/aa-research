package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f17847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.waze.av.b.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "genericPlace");
        this.f17847a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f17847a, ((f) obj).f17847a);
    }

    public final com.waze.av.b.n g() {
        return this.f17847a;
    }

    public final int hashCode() {
        return this.f17847a.hashCode();
    }

    public final String toString() {
        return "OpenFindParkingScreen(genericPlace=" + this.f17847a + ")";
    }
}
