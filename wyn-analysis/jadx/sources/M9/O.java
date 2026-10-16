package m9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class O {

    /* renamed from: g, reason: collision with root package name */
    public static final O f40446g = new O(0, 0, 0, 0, null, 3);

    /* renamed from: a, reason: collision with root package name */
    public final int f40447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40448b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40451e;

    /* renamed from: f, reason: collision with root package name */
    public final G f40452f;

    public O(int i5, int i10, long j8, long j10, G g9, int i11) {
        this.f40447a = i5;
        this.f40448b = i10;
        this.f40449c = j8;
        this.f40450d = j10;
        this.f40451e = i11;
        this.f40452f = g9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f40447a != o7.f40447a || this.f40448b != o7.f40448b || this.f40449c != o7.f40449c || this.f40450d != o7.f40450d || this.f40451e != o7.f40451e) {
            return false;
        }
        G g9 = o7.f40452f;
        G g10 = this.f40452f;
        return g10 != null ? g10.equals(g9) : g9 == null;
    }

    public final int hashCode() {
        int i5 = ((this.f40447a * 31) + this.f40448b) * 31;
        long j8 = this.f40449c;
        int i10 = (i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f40450d;
        int iD = AbstractC0213f.d(this.f40451e, (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31);
        G g9 = this.f40452f;
        return iD + (g9 != null ? g9.hashCode() : 0);
    }
}
