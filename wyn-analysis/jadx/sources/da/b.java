package da;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f34189a;

    /* renamed from: b, reason: collision with root package name */
    public String f34190b;

    /* renamed from: c, reason: collision with root package name */
    public String f34191c;

    /* renamed from: d, reason: collision with root package name */
    public String f34192d;

    /* renamed from: e, reason: collision with root package name */
    public long f34193e;

    /* renamed from: f, reason: collision with root package name */
    public byte f34194f;

    public final c a() {
        if (this.f34194f == 1 && this.f34189a != null && this.f34190b != null && this.f34191c != null && this.f34192d != null) {
            return new c(this.f34189a, this.f34190b, this.f34191c, this.f34192d, this.f34193e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f34189a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f34190b == null) {
            sb2.append(" variantId");
        }
        if (this.f34191c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f34192d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f34194f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
