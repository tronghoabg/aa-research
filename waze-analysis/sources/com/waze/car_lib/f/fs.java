package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fs extends com.waze.car_lib.m.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(com.waze.av.b.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "destination");
        this.f19592a = nVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19592a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs) && h.g.b.x.n(this.f19592a, ((fs) obj).f19592a);
    }

    public final int hashCode() {
        return this.f19592a.hashCode();
    }

    public final String toString() {
        return "StartNavigation(destination=" + this.f19592a + ")";
    }
}
