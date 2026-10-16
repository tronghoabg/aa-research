package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38241a;

    public e(com.waze.sharedrive.c.a.m mVar) {
        h.g.b.x.f(mVar, "drive");
        this.f38241a = mVar;
    }

    public final com.waze.sharedrive.c.a.m a() {
        return this.f38241a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f38241a, ((e) obj).f38241a);
    }

    public final int hashCode() {
        return this.f38241a.hashCode();
    }

    public final String toString() {
        return "Success(drive=" + this.f38241a + ")";
    }
}
