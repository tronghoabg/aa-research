package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final cf f18133a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18134b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18135c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18136d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f18137e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f18138f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.tide.s f18139g;

    private l(cf cfVar, com.waze.tide.s sVar, boolean z, long j2, Integer num, Integer num2, Integer num3) {
        h.g.b.x.f(cfVar, "contentState");
        this.f18133a = cfVar;
        this.f18139g = sVar;
        this.f18134b = z;
        this.f18135c = j2;
        this.f18136d = num;
        this.f18137e = num2;
        this.f18138f = num3;
    }

    public static /* synthetic */ l h(l lVar, cf cfVar, com.waze.tide.s sVar, boolean z, Integer num, Integer num2, Integer num3, int i2) {
        if ((i2 & 1) != 0) {
            cfVar = lVar.f18133a;
        }
        cf cfVar2 = cfVar;
        if ((i2 & 2) != 0) {
            sVar = lVar.f18139g;
        }
        com.waze.tide.s sVar2 = sVar;
        if ((i2 & 4) != 0) {
            z = lVar.f18134b;
        }
        boolean z2 = z;
        long j2 = (i2 & 8) != 0 ? lVar.f18135c : 0L;
        if ((i2 & 16) != 0) {
            num = lVar.f18136d;
        }
        Integer num4 = num;
        Integer num5 = (i2 & 32) != 0 ? lVar.f18137e : num2;
        Integer num6 = (i2 & 64) != 0 ? lVar.f18138f : num3;
        h.g.b.x.f(cfVar2, "contentState");
        return new l(cfVar2, sVar2, z2, j2, num4, num5, num6);
    }

    public final long a() {
        return this.f18135c;
    }

    public final cf b() {
        return this.f18133a;
    }

    public final Integer c() {
        return this.f18138f;
    }

    public final Integer d() {
        return this.f18137e;
    }

    public final Integer e() {
        return this.f18136d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.g.b.x.n(this.f18133a, lVar.f18133a) && h.g.b.x.n(this.f18139g, lVar.f18139g) && this.f18134b == lVar.f18134b && h.o.a.A(this.f18135c, lVar.f18135c) && h.g.b.x.n(this.f18136d, lVar.f18136d) && h.g.b.x.n(this.f18137e, lVar.f18137e) && h.g.b.x.n(this.f18138f, lVar.f18138f);
    }

    public final boolean f() {
        return this.f18134b;
    }

    public final com.waze.tide.s g() {
        return this.f18139g;
    }

    public final int hashCode() {
        int iHashCode = this.f18133a.hashCode() * 31;
        com.waze.tide.s sVar = this.f18139g;
        int iHashCode2 = (((iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31) + a.a.a(this.f18134b)) * 31;
        long j2 = this.f18135c;
        h.o.c cVar = h.o.a.f48264a;
        int iB = (iHashCode2 + a.a.b(j2)) * 31;
        Integer num = this.f18136d;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18137e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18138f;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "State(contentState=" + this.f18133a + ", optionsMenuState=" + this.f18139g + ", isRoaming=" + this.f18134b + ", roamingCollapseTimeout=" + h.o.a.y(this.f18135c) + ", sheetCollapseSignal=" + this.f18136d + ", returnFromSearchSignal=" + this.f18137e + ", centerOnMeClickedSignal=" + this.f18138f + ")";
    }

    public /* synthetic */ l(cf cfVar, long j2) {
        this(cfVar, null, false, j2, null, null, null);
    }
}
