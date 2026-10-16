package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36862a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36863b;

    public be(boolean z, boolean z2) {
        this.f36862a = z;
        this.f36863b = z2;
    }

    public static /* synthetic */ be c(be beVar, boolean z) {
        return new be(beVar.f36862a, z);
    }

    public final boolean a() {
        return this.f36863b;
    }

    public final boolean b() {
        return this.f36862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return this.f36862a == beVar.f36862a && this.f36863b == beVar.f36863b;
    }

    public final int hashCode() {
        return (a.a.a(this.f36862a) * 31) + a.a.a(this.f36863b);
    }

    public final String toString() {
        return "InternalState(isNavigating=" + this.f36862a + ", pendingReroute=" + this.f36863b + ")";
    }
}
