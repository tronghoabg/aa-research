package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20555a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20556b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20557c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20558d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20559e;

    public al(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f20555a = z;
        this.f20556b = z2;
        this.f20557c = z3;
        this.f20558d = z4;
        this.f20559e = z5;
    }

    public final boolean a() {
        return this.f20557c;
    }

    public final boolean b() {
        return this.f20559e;
    }

    public final boolean c() {
        return this.f20555a;
    }

    public final boolean d() {
        return this.f20558d;
    }

    public final boolean e() {
        return this.f20556b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return this.f20555a == alVar.f20555a && this.f20556b == alVar.f20556b && this.f20557c == alVar.f20557c && this.f20558d == alVar.f20558d && this.f20559e == alVar.f20559e;
    }

    public final int hashCode() {
        int iA = a.a.a(this.f20555a);
        boolean z = this.f20559e;
        boolean z2 = this.f20558d;
        return (((((((iA * 31) + a.a.a(this.f20556b)) * 31) + a.a.a(this.f20557c)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "ActionStrip(isHomeSet=" + this.f20555a + ", isWorkSet=" + this.f20556b + ", isCloseToHome=" + this.f20557c + ", isOffline=" + this.f20558d + ", isCompaninioEnabled=" + this.f20559e + ")";
    }
}
