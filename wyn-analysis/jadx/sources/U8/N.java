package U8;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int f12434a;

    /* renamed from: b, reason: collision with root package name */
    public String f12435b;

    /* renamed from: c, reason: collision with root package name */
    public int f12436c;

    /* renamed from: d, reason: collision with root package name */
    public long f12437d;

    /* renamed from: e, reason: collision with root package name */
    public long f12438e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12439f;

    /* renamed from: g, reason: collision with root package name */
    public int f12440g;

    /* renamed from: h, reason: collision with root package name */
    public String f12441h;

    /* renamed from: i, reason: collision with root package name */
    public String f12442i;

    /* renamed from: j, reason: collision with root package name */
    public byte f12443j;

    public final O a() {
        String str;
        String str2;
        String str3;
        if (this.f12443j == 63 && (str = this.f12435b) != null && (str2 = this.f12441h) != null && (str3 = this.f12442i) != null) {
            return new O(this.f12434a, str, this.f12436c, this.f12437d, this.f12438e, this.f12439f, this.f12440g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12443j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f12435b == null) {
            sb2.append(" model");
        }
        if ((this.f12443j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f12443j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f12443j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f12443j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f12443j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f12441h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f12442i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
