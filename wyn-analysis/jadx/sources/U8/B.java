package U8;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public String f12354a;

    /* renamed from: b, reason: collision with root package name */
    public String f12355b;

    /* renamed from: c, reason: collision with root package name */
    public int f12356c;

    /* renamed from: d, reason: collision with root package name */
    public String f12357d;

    /* renamed from: e, reason: collision with root package name */
    public String f12358e;

    /* renamed from: f, reason: collision with root package name */
    public String f12359f;

    /* renamed from: g, reason: collision with root package name */
    public String f12360g;

    /* renamed from: h, reason: collision with root package name */
    public String f12361h;

    /* renamed from: i, reason: collision with root package name */
    public String f12362i;

    /* renamed from: j, reason: collision with root package name */
    public K f12363j;
    public H k;

    /* renamed from: l, reason: collision with root package name */
    public E f12364l;

    /* renamed from: m, reason: collision with root package name */
    public byte f12365m;

    public final C a() {
        if (this.f12365m == 1 && this.f12354a != null && this.f12355b != null && this.f12357d != null && this.f12361h != null && this.f12362i != null) {
            return new C(this.f12354a, this.f12355b, this.f12356c, this.f12357d, this.f12358e, this.f12359f, this.f12360g, this.f12361h, this.f12362i, this.f12363j, this.k, this.f12364l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12354a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f12355b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f12365m) == 0) {
            sb2.append(" platform");
        }
        if (this.f12357d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f12361h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f12362i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
