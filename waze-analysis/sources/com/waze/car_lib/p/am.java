package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20560a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20561b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20562c;

    /* renamed from: d, reason: collision with root package name */
    private final al f20563d;

    public am(boolean z, boolean z2, boolean z3, al alVar) {
        h.g.b.x.f(alVar, "actionStrip");
        this.f20560a = z;
        this.f20561b = z2;
        this.f20562c = z3;
        this.f20563d = alVar;
    }

    public static /* synthetic */ am e(am amVar, boolean z, boolean z2, boolean z3, al alVar, int i2) {
        if ((i2 & 1) != 0) {
            z = amVar.f20560a;
        }
        if ((i2 & 2) != 0) {
            z2 = amVar.f20561b;
        }
        if ((i2 & 4) != 0) {
            z3 = amVar.f20562c;
        }
        if ((i2 & 8) != 0) {
            alVar = amVar.f20563d;
        }
        h.g.b.x.f(alVar, "actionStrip");
        return new am(z, z2, z3, alVar);
    }

    public final al a() {
        return this.f20563d;
    }

    public final boolean b() {
        return this.f20561b;
    }

    public final boolean c() {
        return this.f20562c;
    }

    public final boolean d() {
        return this.f20560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f20560a == amVar.f20560a && this.f20561b == amVar.f20561b && this.f20562c == amVar.f20562c && h.g.b.x.n(this.f20563d, amVar.f20563d);
    }

    public final int hashCode() {
        int iA = a.a.a(this.f20560a);
        al alVar = this.f20563d;
        return (((((iA * 31) + a.a.a(this.f20561b)) * 31) + a.a.a(this.f20562c)) * 31) + alVar.hashCode();
    }

    public final String toString() {
        return "UIState(isRoaming=" + this.f20560a + ", shouldShowCenterOnMe=" + this.f20561b + ", isInPanMode=" + this.f20562c + ", actionStrip=" + this.f20563d + ")";
    }
}
