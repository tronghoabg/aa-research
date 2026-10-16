package U8;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public long f12494a;

    /* renamed from: b, reason: collision with root package name */
    public String f12495b;

    /* renamed from: c, reason: collision with root package name */
    public String f12496c;

    /* renamed from: d, reason: collision with root package name */
    public long f12497d;

    /* renamed from: e, reason: collision with root package name */
    public int f12498e;

    /* renamed from: f, reason: collision with root package name */
    public byte f12499f;

    public final Z a() {
        String str;
        if (this.f12499f == 7 && (str = this.f12495b) != null) {
            return new Z(this.f12494a, str, this.f12496c, this.f12497d, this.f12498e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12499f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f12495b == null) {
            sb2.append(" symbol");
        }
        if ((this.f12499f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f12499f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
