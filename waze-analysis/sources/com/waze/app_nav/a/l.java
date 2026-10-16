package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.m f15152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.waze.app_nav.m mVar) {
        super(null);
        h.g.b.x.f(mVar, "destination");
        this.f15152a = mVar;
    }

    public final com.waze.app_nav.m a() {
        return this.f15152a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f15152a, ((l) obj).f15152a);
    }

    public final int hashCode() {
        return this.f15152a.hashCode();
    }

    public final String toString() {
        return "ShowFeatureEntry(destination=" + this.f15152a + ")";
    }
}
