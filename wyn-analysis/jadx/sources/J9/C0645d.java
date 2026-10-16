package J9;

/* renamed from: J9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0645d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5922a;

    /* renamed from: b, reason: collision with root package name */
    public final P9.a f5923b;

    public C0645d(String str, P9.a aVar) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f5922a = str;
        if (aVar == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f5923b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0645d) {
            C0645d c0645d = (C0645d) obj;
            if (this.f5922a.equals(c0645d.f5922a) && this.f5923b.equals(c0645d.f5923b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5922a.hashCode() ^ 1000003) * 1000003) ^ this.f5923b.hashCode();
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.f5922a + ", installationTokenResult=" + this.f5923b + "}";
    }
}
