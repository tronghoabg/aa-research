package com.waze.ui.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final float f41995a;

    /* renamed from: b, reason: collision with root package name */
    private final float f41996b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41997c;

    /* renamed from: d, reason: collision with root package name */
    private final long f41998d;

    public /* synthetic */ l(float f2, float f3, boolean z, long j2) {
        this.f41995a = f2;
        this.f41996b = f3;
        this.f41997c = z;
        this.f41998d = j2;
    }

    public final float a() {
        return this.f41996b;
    }

    public final float b() {
        return this.f41995a;
    }

    public final long c() {
        return this.f41998d;
    }

    public final boolean d() {
        return this.f41997c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f41995a, lVar.f41995a) == 0 && Float.compare(this.f41996b, lVar.f41996b) == 0 && this.f41997c == lVar.f41997c && h.o.a.A(this.f41998d, lVar.f41998d);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f41995a) * 31) + Float.floatToIntBits(this.f41996b);
        h.o.c cVar = h.o.a.f48264a;
        return (((iFloatToIntBits * 31) + a.a.a(this.f41997c)) * 31) + a.a.b(this.f41998d);
    }

    public final String toString() {
        return "TrafficSegment(ratioOnRoadStart=" + this.f41995a + ", ratioOnRoadEnd=" + this.f41996b + ", isHeavyTraffic=" + this.f41997c + ", duration=" + h.o.a.y(this.f41998d) + ")";
    }
}
