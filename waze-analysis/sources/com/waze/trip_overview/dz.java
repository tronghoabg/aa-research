package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dz extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41424a;

    public dz(boolean z) {
        super(null);
        this.f41424a = z;
    }

    public final boolean a() {
        return this.f41424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz) && this.f41424a == ((dz) obj).f41424a;
    }

    public final int hashCode() {
        return a.a.a(this.f41424a);
    }

    public final String toString() {
        return "DrawerStateChanged(open=" + this.f41424a + ")";
    }
}
