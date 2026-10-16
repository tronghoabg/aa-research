package U8;

/* renamed from: U8.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0857a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f12509a;

    /* renamed from: b, reason: collision with root package name */
    public int f12510b;

    /* renamed from: c, reason: collision with root package name */
    public int f12511c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12512d;

    /* renamed from: e, reason: collision with root package name */
    public byte f12513e;

    public final C0859b0 a() {
        String str;
        if (this.f12513e == 7 && (str = this.f12509a) != null) {
            return new C0859b0(str, this.f12510b, this.f12511c, this.f12512d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12509a == null) {
            sb2.append(" processName");
        }
        if ((this.f12513e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f12513e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f12513e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
