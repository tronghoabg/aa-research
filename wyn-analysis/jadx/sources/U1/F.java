package U1;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final k2.H f11925a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11926b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11927c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11928d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11930f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11931g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11932h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11933i;

    public F(k2.H h10, long j8, long j10, long j11, long j12, boolean z2, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        Q1.k.c(!z12 || z10);
        Q1.k.c(!z11 || z10);
        if (z2 && (z10 || z11 || z12)) {
            z13 = false;
        }
        Q1.k.c(z13);
        this.f11925a = h10;
        this.f11926b = j8;
        this.f11927c = j10;
        this.f11928d = j11;
        this.f11929e = j12;
        this.f11930f = z2;
        this.f11931g = z10;
        this.f11932h = z11;
        this.f11933i = z12;
    }

    public final F a(long j8) {
        if (j8 == this.f11927c) {
            return this;
        }
        return new F(this.f11925a, this.f11926b, j8, this.f11928d, this.f11929e, this.f11930f, this.f11931g, this.f11932h, this.f11933i);
    }

    public final F b(long j8) {
        if (j8 == this.f11926b) {
            return this;
        }
        return new F(this.f11925a, j8, this.f11927c, this.f11928d, this.f11929e, this.f11930f, this.f11931g, this.f11932h, this.f11933i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f10 = (F) obj;
            if (this.f11926b == f10.f11926b && this.f11927c == f10.f11927c && this.f11928d == f10.f11928d && this.f11929e == f10.f11929e && this.f11930f == f10.f11930f && this.f11931g == f10.f11931g && this.f11932h == f10.f11932h && this.f11933i == f10.f11933i) {
                int i5 = Q1.x.f9724a;
                if (Objects.equals(this.f11925a, f10.f11925a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f11925a.hashCode() + 527) * 31) + ((int) this.f11926b)) * 31) + ((int) this.f11927c)) * 31) + ((int) this.f11928d)) * 31) + ((int) this.f11929e)) * 31) + (this.f11930f ? 1 : 0)) * 31) + (this.f11931g ? 1 : 0)) * 31) + (this.f11932h ? 1 : 0)) * 31) + (this.f11933i ? 1 : 0);
    }
}
