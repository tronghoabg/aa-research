package U8;

import Va.M6;

/* renamed from: U8.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0863d0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f12550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12551b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12552c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12553d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12554e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12555f;

    public C0863d0(Double d3, int i5, boolean z2, int i10, long j8, long j10) {
        this.f12550a = d3;
        this.f12551b = i5;
        this.f12552c = z2;
        this.f12553d = i10;
        this.f12554e = j8;
        this.f12555f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            G0 g02 = (G0) obj;
            Double d3 = this.f12550a;
            if (d3 != null ? d3.equals(((C0863d0) g02).f12550a) : ((C0863d0) g02).f12550a == null) {
                if (this.f12551b == ((C0863d0) g02).f12551b) {
                    C0863d0 c0863d0 = (C0863d0) g02;
                    if (this.f12552c == c0863d0.f12552c && this.f12553d == c0863d0.f12553d && this.f12554e == c0863d0.f12554e && this.f12555f == c0863d0.f12555f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d3 = this.f12550a;
        int iHashCode = ((((((((d3 == null ? 0 : d3.hashCode()) ^ 1000003) * 1000003) ^ this.f12551b) * 1000003) ^ (this.f12552c ? 1231 : 1237)) * 1000003) ^ this.f12553d) * 1000003;
        long j8 = this.f12554e;
        long j10 = this.f12555f;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f12550a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f12551b);
        sb2.append(", proximityOn=");
        sb2.append(this.f12552c);
        sb2.append(", orientation=");
        sb2.append(this.f12553d);
        sb2.append(", ramUsed=");
        sb2.append(this.f12554e);
        sb2.append(", diskUsed=");
        return M6.s(sb2, this.f12555f, "}");
    }
}
