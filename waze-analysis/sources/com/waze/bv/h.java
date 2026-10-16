package com.waze.bv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f17517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17518b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17519c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17520d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17521e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17522f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17523g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17524h;

    public h(int i2, String str, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5) {
        h.g.b.x.f(str, "units");
        this.f17517a = i2;
        this.f17518b = str;
        this.f17519c = z;
        this.f17520d = i3;
        this.f17521e = z2;
        this.f17522f = z3;
        this.f17523g = z4;
        this.f17524h = z5;
    }

    public static /* synthetic */ h a(h hVar, boolean z, boolean z2, boolean z3, int i2) {
        int i3 = (i2 & 1) != 0 ? hVar.f17517a : 0;
        String str = (i2 & 2) != 0 ? hVar.f17518b : null;
        boolean z4 = (i2 & 4) != 0 ? hVar.f17519c : false;
        int i4 = (i2 & 8) != 0 ? hVar.f17520d : 0;
        boolean z5 = (i2 & 16) != 0 ? hVar.f17521e : true;
        if ((i2 & 32) != 0) {
            z = hVar.f17522f;
        }
        boolean z6 = z;
        if ((i2 & 64) != 0) {
            z2 = hVar.f17523g;
        }
        boolean z7 = z2;
        if ((i2 & 128) != 0) {
            z3 = hVar.f17524h;
        }
        h.g.b.x.f(str, "units");
        return new h(i3, str, z4, i4, z5, z6, z7, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17517a == hVar.f17517a && h.g.b.x.n(this.f17518b, hVar.f17518b) && this.f17519c == hVar.f17519c && this.f17520d == hVar.f17520d && this.f17521e == hVar.f17521e && this.f17522f == hVar.f17522f && this.f17523g == hVar.f17523g && this.f17524h == hVar.f17524h;
    }

    public final int hashCode() {
        int iHashCode = (this.f17517a * 31) + this.f17518b.hashCode();
        boolean z = this.f17524h;
        boolean z2 = this.f17523g;
        boolean z3 = this.f17522f;
        return (((((((((((iHashCode * 31) + a.a.a(this.f17519c)) * 31) + this.f17520d) * 31) + a.a.a(this.f17521e)) * 31) + a.a.a(z3)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "State(speed=" + this.f17517a + ", units=" + this.f17518b + ", isUsStyle=" + this.f17519c + ", maxSpeedRoad=" + this.f17520d + ", enableSpeedometer=" + this.f17521e + ", enableSpeedLimit=" + this.f17522f + ", showSpeedLimit=" + this.f17523g + ", overSpeedWithOffset=" + this.f17524h + ")";
    }
}
