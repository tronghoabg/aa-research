package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final String f30998a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30999b;

    public ap(String str, boolean z) {
        this.f30998a = str;
        this.f30999b = z;
    }

    public final String a() {
        return this.f30998a;
    }

    public final boolean b() {
        return this.f30999b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return h.g.b.x.n(this.f30998a, apVar.f30998a) && this.f30999b == apVar.f30999b;
    }

    public final int hashCode() {
        String str = this.f30998a;
        return ((str == null ? 0 : str.hashCode()) * 31) + a.a.a(this.f30999b);
    }

    public final String toString() {
        return "CurrentStreetState(name=" + this.f30998a + ", hov=" + this.f30999b + ")";
    }

    public ap() {
        this(null, false);
    }
}
