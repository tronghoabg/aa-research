package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25258a;

    /* renamed from: b, reason: collision with root package name */
    private final at f25259b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25260c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25261d;

    public al(boolean z, at atVar, boolean z2, boolean z3) {
        h.g.b.x.f(atVar, "locationPermissionStatus");
        this.f25258a = z;
        this.f25259b = atVar;
        this.f25260c = z2;
        this.f25261d = z3;
    }

    public static /* synthetic */ al e(al alVar, boolean z, at atVar, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = alVar.f25258a;
        }
        if ((i2 & 2) != 0) {
            atVar = alVar.f25259b;
        }
        if ((i2 & 4) != 0) {
            z2 = alVar.f25260c;
        }
        if ((i2 & 8) != 0) {
            z3 = alVar.f25261d;
        }
        h.g.b.x.f(atVar, "locationPermissionStatus");
        return new al(z, atVar, z2, z3);
    }

    public final at a() {
        return this.f25259b;
    }

    public final boolean b() {
        return this.f25260c;
    }

    public final boolean c() {
        return this.f25258a;
    }

    public final boolean d() {
        return this.f25261d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return this.f25258a == alVar.f25258a && this.f25259b == alVar.f25259b && this.f25260c == alVar.f25260c && this.f25261d == alVar.f25261d;
    }

    public final int hashCode() {
        return (((((a.a.a(this.f25258a) * 31) + this.f25259b.hashCode()) * 31) + a.a.a(this.f25260c)) * 31) + a.a.a(this.f25261d);
    }

    public final String toString() {
        return "InternalState(isGpsEnabled=" + this.f25258a + ", locationPermissionStatus=" + this.f25259b + ", wasPermissionDenied=" + this.f25260c + ", isGpsFallback=" + this.f25261d + ")";
    }

    public al() {
        this(null);
    }

    public /* synthetic */ al(byte[] bArr) {
        this(false, at.f25272a, false, false);
    }
}
