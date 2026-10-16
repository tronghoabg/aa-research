package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44061a;

    /* renamed from: b, reason: collision with root package name */
    private final long f44062b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44063c;

    public ac(boolean z, long j2, boolean z2) {
        this.f44061a = z;
        this.f44062b = j2;
        this.f44063c = z2;
    }

    public final long a() {
        return this.f44062b;
    }

    public final boolean b() {
        return this.f44061a;
    }

    public final boolean c() {
        return this.f44063c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f44061a == acVar.f44061a && this.f44062b == acVar.f44062b && this.f44063c == acVar.f44063c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f44061a) * 31) + a.a.b(this.f44062b)) * 31) + a.a.a(this.f44063c);
    }

    public final String toString() {
        return "Data(uidLaunchEnabled=" + this.f44061a + ", profileId=" + this.f44062b + ", isGuest=" + this.f44063c + ")";
    }
}
