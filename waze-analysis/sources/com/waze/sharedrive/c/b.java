package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.m f38083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.waze.sharedrive.c.a.m mVar) {
        super(null);
        h.g.b.x.f(mVar, "sharedDrive");
        this.f38083a = mVar;
    }

    public final com.waze.sharedrive.c.a.m a() {
        return this.f38083a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f38083a, ((b) obj).f38083a);
    }

    public final int hashCode() {
        return this.f38083a.hashCode();
    }

    public final String toString() {
        return "DriveUpdated(sharedDrive=" + this.f38083a + ")";
    }
}
