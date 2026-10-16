package U8;

/* renamed from: U8.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0883n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12646c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12647d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12648e;

    /* renamed from: f, reason: collision with root package name */
    public final S3.s f12649f;

    public C0883n0(String str, String str2, String str3, String str4, int i5, S3.s sVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f12644a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f12645b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f12646c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f12647d = str4;
        this.f12648e = i5;
        this.f12649f = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0883n0)) {
            return false;
        }
        C0883n0 c0883n0 = (C0883n0) obj;
        return this.f12644a.equals(c0883n0.f12644a) && this.f12645b.equals(c0883n0.f12645b) && this.f12646c.equals(c0883n0.f12646c) && this.f12647d.equals(c0883n0.f12647d) && this.f12648e == c0883n0.f12648e && this.f12649f.equals(c0883n0.f12649f);
    }

    public final int hashCode() {
        return ((((((((((this.f12644a.hashCode() ^ 1000003) * 1000003) ^ this.f12645b.hashCode()) * 1000003) ^ this.f12646c.hashCode()) * 1000003) ^ this.f12647d.hashCode()) * 1000003) ^ this.f12648e) * 1000003) ^ this.f12649f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f12644a + ", versionCode=" + this.f12645b + ", versionName=" + this.f12646c + ", installUuid=" + this.f12647d + ", deliveryMechanism=" + this.f12648e + ", developmentPlatformProvider=" + this.f12649f + "}";
    }
}
