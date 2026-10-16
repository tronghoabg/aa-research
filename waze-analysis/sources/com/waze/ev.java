package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ev {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23669a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.m f23670b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23671c;

    public ev(com.waze.app_nav.m mVar, boolean z) {
        h.g.b.x.f(mVar, "currentDestination");
        this.f23669a = false;
        this.f23670b = mVar;
        this.f23671c = z;
    }

    public static /* synthetic */ ev c(ev evVar, com.waze.app_nav.m mVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            boolean z2 = evVar.f23669a;
        }
        if ((i2 & 2) != 0) {
            mVar = evVar.f23670b;
        }
        if ((i2 & 4) != 0) {
            z = evVar.f23671c;
        }
        h.g.b.x.f(mVar, "currentDestination");
        return new ev(mVar, z);
    }

    public final com.waze.app_nav.m a() {
        return this.f23670b;
    }

    public final boolean b() {
        return this.f23671c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        boolean z = evVar.f23669a;
        return h.g.b.x.n(this.f23670b, evVar.f23670b) && this.f23671c == evVar.f23671c;
    }

    public final int hashCode() {
        return (((a.a.a(false) * 31) + this.f23670b.hashCode()) * 31) + a.a.a(this.f23671c);
    }

    public final String toString() {
        return "InternalState(legacySearchOpen=false, currentDestination=" + this.f23670b + ", isLandscape=" + this.f23671c + ")";
    }
}
