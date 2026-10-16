package A5;

import A7.AbstractC0279p0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f344f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347c;

    /* renamed from: d, reason: collision with root package name */
    public final long f348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f349e;

    public a(long j8, int i5, int i10, long j10, int i11) {
        this.f345a = j8;
        this.f346b = i5;
        this.f347c = i10;
        this.f348d = j10;
        this.f349e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f345a == aVar.f345a && this.f346b == aVar.f346b && this.f347c == aVar.f347c && this.f348d == aVar.f348d && this.f349e == aVar.f349e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f345a;
        int i5 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f346b) * 1000003) ^ this.f347c) * 1000003;
        long j10 = this.f348d;
        return ((i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f349e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f345a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f346b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f347c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f348d);
        sb2.append(", maxBlobByteSizePerRow=");
        return AbstractC0279p0.j(this.f349e, "}", sb2);
    }
}
