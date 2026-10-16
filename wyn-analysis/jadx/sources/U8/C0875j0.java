package U8;

/* renamed from: U8.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0875j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f12606a;

    /* renamed from: b, reason: collision with root package name */
    public String f12607b;

    /* renamed from: c, reason: collision with root package name */
    public String f12608c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12609d;

    /* renamed from: e, reason: collision with root package name */
    public byte f12610e;

    public final C0877k0 a() {
        String str;
        String str2;
        if (this.f12610e == 3 && (str = this.f12607b) != null && (str2 = this.f12608c) != null) {
            return new C0877k0(this.f12606a, str, this.f12609d, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12610e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f12607b == null) {
            sb2.append(" version");
        }
        if (this.f12608c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f12610e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
