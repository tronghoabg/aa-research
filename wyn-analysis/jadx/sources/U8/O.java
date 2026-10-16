package U8;

/* loaded from: classes4.dex */
public final class O extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12445b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12446c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12447d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12448e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12449f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12450g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12451h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12452i;

    public O(int i5, String str, int i10, long j8, long j10, boolean z2, int i11, String str2, String str3) {
        this.f12444a = i5;
        this.f12445b = str;
        this.f12446c = i10;
        this.f12447d = j8;
        this.f12448e = j10;
        this.f12449f = z2;
        this.f12450g = i11;
        this.f12451h = str2;
        this.f12452i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f12444a == ((O) x0Var).f12444a) {
                O o7 = (O) x0Var;
                if (this.f12445b.equals(o7.f12445b) && this.f12446c == o7.f12446c && this.f12447d == o7.f12447d && this.f12448e == o7.f12448e && this.f12449f == o7.f12449f && this.f12450g == o7.f12450g && this.f12451h.equals(o7.f12451h) && this.f12452i.equals(o7.f12452i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f12444a ^ 1000003) * 1000003) ^ this.f12445b.hashCode()) * 1000003) ^ this.f12446c) * 1000003;
        long j8 = this.f12447d;
        int i5 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j10 = this.f12448e;
        return ((((((((i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f12449f ? 1231 : 1237)) * 1000003) ^ this.f12450g) * 1000003) ^ this.f12451h.hashCode()) * 1000003) ^ this.f12452i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f12444a);
        sb2.append(", model=");
        sb2.append(this.f12445b);
        sb2.append(", cores=");
        sb2.append(this.f12446c);
        sb2.append(", ram=");
        sb2.append(this.f12447d);
        sb2.append(", diskSpace=");
        sb2.append(this.f12448e);
        sb2.append(", simulator=");
        sb2.append(this.f12449f);
        sb2.append(", state=");
        sb2.append(this.f12450g);
        sb2.append(", manufacturer=");
        sb2.append(this.f12451h);
        sb2.append(", modelClass=");
        return wg.b.c(sb2, this.f12452i, "}");
    }
}
