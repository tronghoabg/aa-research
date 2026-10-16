package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22942a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22943b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22944c;

    /* renamed from: d, reason: collision with root package name */
    private final float f22945d;

    /* renamed from: e, reason: collision with root package name */
    private final ae f22946e;

    public ad(boolean z, boolean z2, boolean z3, float f2, ae aeVar) {
        this.f22942a = z;
        this.f22943b = z2;
        this.f22944c = z3;
        this.f22945d = f2;
        this.f22946e = aeVar;
    }

    public final float a() {
        return this.f22945d;
    }

    public final ae b() {
        return this.f22946e;
    }

    public final boolean c() {
        return this.f22942a;
    }

    public final boolean d() {
        return this.f22944c;
    }

    public final boolean e() {
        return this.f22943b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f22942a == adVar.f22942a && this.f22943b == adVar.f22943b && this.f22944c == adVar.f22944c && Float.compare(this.f22945d, adVar.f22945d) == 0 && h.g.b.x.n(this.f22946e, adVar.f22946e);
    }

    public final int hashCode() {
        int iA = (((((a.a.a(this.f22942a) * 31) + a.a.a(this.f22943b)) * 31) + a.a.a(this.f22944c)) * 31) + Float.floatToIntBits(this.f22945d);
        ae aeVar = this.f22946e;
        return (iA * 31) + (aeVar == null ? 0 : aeVar.hashCode());
    }

    public final String toString() {
        return "MapCar3DInfo(hasNormalTexture=" + this.f22942a + ", hasTaxiTexture=" + this.f22943b + ", hasShareTexture=" + this.f22944c + ", scale=" + this.f22945d + ", lighting=" + this.f22946e + ")";
    }
}
