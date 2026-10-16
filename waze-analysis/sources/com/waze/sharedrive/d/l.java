package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38251a;

    public l(com.waze.sharedrive.c.a.m mVar) {
        h.g.b.x.f(mVar, "drive");
        this.f38251a = mVar;
    }

    public final com.waze.sharedrive.c.a.m a() {
        return this.f38251a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f38251a, ((l) obj).f38251a);
    }

    public final int hashCode() {
        return this.f38251a.hashCode();
    }

    public final String toString() {
        return "JoinedSuccessfully(drive=" + this.f38251a + ")";
    }
}
