package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38253a;

    public n(com.waze.sharedrive.c.a.m mVar) {
        h.g.b.x.f(mVar, "drive");
        this.f38253a = mVar;
    }

    public final com.waze.sharedrive.c.a.m a() {
        return this.f38253a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f38253a, ((n) obj).f38253a);
    }

    public final int hashCode() {
        return this.f38253a.hashCode();
    }

    public final String toString() {
        return "Requesting(drive=" + this.f38253a + ")";
    }
}
