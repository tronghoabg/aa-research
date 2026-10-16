package U8;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public long f12453a;

    /* renamed from: b, reason: collision with root package name */
    public String f12454b;

    /* renamed from: c, reason: collision with root package name */
    public S f12455c;

    /* renamed from: d, reason: collision with root package name */
    public C0863d0 f12456d;

    /* renamed from: e, reason: collision with root package name */
    public C0865e0 f12457e;

    /* renamed from: f, reason: collision with root package name */
    public C0873i0 f12458f;

    /* renamed from: g, reason: collision with root package name */
    public byte f12459g;

    public final Q a() {
        String str;
        S s10;
        C0863d0 c0863d0;
        if (this.f12459g == 1 && (str = this.f12454b) != null && (s10 = this.f12455c) != null && (c0863d0 = this.f12456d) != null) {
            return new Q(this.f12453a, str, s10, c0863d0, this.f12457e, this.f12458f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f12459g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f12454b == null) {
            sb2.append(" type");
        }
        if (this.f12455c == null) {
            sb2.append(" app");
        }
        if (this.f12456d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
