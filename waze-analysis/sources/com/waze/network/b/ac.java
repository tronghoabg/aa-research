package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final long f31917a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31918b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31919c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31920d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31921e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31922f;

    /* renamed from: g, reason: collision with root package name */
    private final long f31923g;

    public ac(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f31917a = j2;
        this.f31918b = j3;
        this.f31919c = j4;
        this.f31920d = j5;
        this.f31921e = j6;
        this.f31922f = j7;
        this.f31923g = j8;
    }

    public static /* synthetic */ ac h(ac acVar, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i2) {
        return new ac((i2 & 1) != 0 ? acVar.f31917a : j2, (i2 & 2) != 0 ? acVar.f31918b : j3, (i2 & 4) != 0 ? acVar.f31919c : j4, (i2 & 8) != 0 ? acVar.f31920d : j5, (i2 & 16) != 0 ? acVar.f31921e : j6, (i2 & 32) != 0 ? acVar.f31922f : j7, (i2 & 64) != 0 ? acVar.f31923g : j8);
    }

    public final long a() {
        return this.f31921e;
    }

    public final long b() {
        return this.f31919c;
    }

    public final long c() {
        return this.f31918b;
    }

    public final long d() {
        return this.f31917a;
    }

    public final long e() {
        return this.f31920d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f31917a == acVar.f31917a && this.f31918b == acVar.f31918b && this.f31919c == acVar.f31919c && this.f31920d == acVar.f31920d && this.f31921e == acVar.f31921e && this.f31922f == acVar.f31922f && this.f31923g == acVar.f31923g;
    }

    public final long f() {
        return this.f31923g;
    }

    public final long g() {
        return this.f31922f;
    }

    public final int hashCode() {
        int iB = a.a.b(this.f31917a) * 31;
        long j2 = this.f31923g;
        long j3 = this.f31922f;
        long j4 = this.f31921e;
        long j5 = this.f31920d;
        return ((((((((((iB + a.a.b(this.f31918b)) * 31) + a.a.b(this.f31919c)) * 31) + a.a.b(j5)) * 31) + a.a.b(j4)) * 31) + a.a.b(j3)) * 31) + a.a.b(j2);
    }

    public final String toString() {
        return "NetworkQueueStats(maxItems=" + this.f31917a + ", enqueue=" + this.f31918b + ", dequeue=" + this.f31919c + ", overflow=" + this.f31920d + ", aborted=" + this.f31921e + ", totalQueueTimeMs=" + this.f31922f + ", totalActionTimeMs=" + this.f31923g + ")";
    }
}
