package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fn extends com.waze.car_lib.m.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.waze.av.b.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "destination");
        this.f19587a = nVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn) && h.g.b.x.n(this.f19587a, ((fn) obj).f19587a);
    }

    public final int hashCode() {
        return this.f19587a.hashCode();
    }

    public final String toString() {
        return "StartNavigation(destination=" + this.f19587a + ")";
    }
}
