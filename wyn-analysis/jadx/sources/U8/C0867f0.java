package U8;

/* renamed from: U8.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0867f0 {

    /* renamed from: a, reason: collision with root package name */
    public C0871h0 f12563a;

    /* renamed from: b, reason: collision with root package name */
    public String f12564b;

    /* renamed from: c, reason: collision with root package name */
    public String f12565c;

    /* renamed from: d, reason: collision with root package name */
    public long f12566d;

    /* renamed from: e, reason: collision with root package name */
    public byte f12567e;

    public final C0869g0 a() {
        C0871h0 c0871h0;
        String str;
        String str2;
        if (this.f12567e == 1 && (c0871h0 = this.f12563a) != null && (str = this.f12564b) != null && (str2 = this.f12565c) != null) {
            return new C0869g0(c0871h0, str, str2, this.f12566d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12563a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f12564b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f12565c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f12567e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
