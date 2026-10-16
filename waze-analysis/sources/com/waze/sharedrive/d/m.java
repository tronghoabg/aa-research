package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38252a;

    public m(com.waze.sharedrive.c.a.m mVar) {
        h.g.b.x.f(mVar, "drive");
        this.f38252a = mVar;
    }

    public final com.waze.sharedrive.c.a.m a() {
        return this.f38252a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f38252a, ((m) obj).f38252a);
    }

    public final int hashCode() {
        return this.f38252a.hashCode();
    }

    public final String toString() {
        return "ReadyToJoin(drive=" + this.f38252a + ")";
    }
}
