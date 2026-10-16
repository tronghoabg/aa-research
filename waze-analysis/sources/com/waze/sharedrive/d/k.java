package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38249a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.q f38250b;

    public k(com.waze.sharedrive.c.a.m mVar, com.waze.sharedrive.q qVar) {
        h.g.b.x.f(mVar, "drive");
        h.g.b.x.f(qVar, "error");
        this.f38249a = mVar;
        this.f38250b = qVar;
    }

    public final com.waze.sharedrive.q a() {
        return this.f38250b;
    }

    public final com.waze.sharedrive.c.a.m b() {
        return this.f38249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f38249a, kVar.f38249a) && h.g.b.x.n(this.f38250b, kVar.f38250b);
    }

    public final int hashCode() {
        return (this.f38249a.hashCode() * 31) + this.f38250b.hashCode();
    }

    public final String toString() {
        return "JoinError(drive=" + this.f38249a + ", error=" + this.f38250b + ")";
    }
}
