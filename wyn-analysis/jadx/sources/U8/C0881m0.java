package U8;

/* renamed from: U8.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0881m0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0883n0 f12635a;

    /* renamed from: b, reason: collision with root package name */
    public final C0887p0 f12636b;

    /* renamed from: c, reason: collision with root package name */
    public final C0885o0 f12637c;

    public C0881m0(C0883n0 c0883n0, C0887p0 c0887p0, C0885o0 c0885o0) {
        this.f12635a = c0883n0;
        this.f12636b = c0887p0;
        this.f12637c = c0885o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0881m0) {
            C0881m0 c0881m0 = (C0881m0) obj;
            if (this.f12635a.equals(c0881m0.f12635a) && this.f12636b.equals(c0881m0.f12636b) && this.f12637c.equals(c0881m0.f12637c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12635a.hashCode() ^ 1000003) * 1000003) ^ this.f12636b.hashCode()) * 1000003) ^ this.f12637c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f12635a + ", osData=" + this.f12636b + ", deviceData=" + this.f12637c + "}";
    }
}
