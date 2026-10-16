package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends x {

    /* renamed from: a, reason: collision with root package name */
    private final String f43167a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43168b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43169c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43170d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(null);
        h.g.b.x.f(str, "debugVersion");
        this.f43167a = str;
        this.f43168b = z;
        this.f43169c = z2;
        this.f43170d = z3;
        this.f43171e = z4;
    }

    public final String a() {
        return this.f43167a;
    }

    public final boolean b() {
        return this.f43169c;
    }

    public final boolean c() {
        return this.f43170d;
    }

    public final boolean d() {
        return this.f43171e;
    }

    public final boolean e() {
        return this.f43168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.g.b.x.n(this.f43167a, vVar.f43167a) && this.f43168b == vVar.f43168b && this.f43169c == vVar.f43169c && this.f43170d == vVar.f43170d && this.f43171e == vVar.f43171e;
    }

    public final int hashCode() {
        int iHashCode = this.f43167a.hashCode() * 31;
        boolean z = this.f43171e;
        boolean z2 = this.f43170d;
        return ((((((iHashCode + a.a.a(this.f43168b)) * 31) + a.a.a(this.f43169c)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "Debug(debugVersion=" + this.f43167a + ", isStaffUser=" + this.f43168b + ", isAlphaUser=" + this.f43169c + ", isBetaUser=" + this.f43170d + ", isConnectedToBetaILServer=" + this.f43171e + ")";
    }
}
