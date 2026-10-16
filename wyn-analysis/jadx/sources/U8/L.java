package U8;

/* loaded from: classes4.dex */
public final class L extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12429b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12430c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12432e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12433f;

    public L(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f12428a = str;
        this.f12429b = str2;
        this.f12430c = str3;
        this.f12431d = str4;
        this.f12432e = str5;
        this.f12433f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f12428a.equals(((L) w0Var).f12428a)) {
                L l10 = (L) w0Var;
                if (this.f12429b.equals(l10.f12429b)) {
                    String str = l10.f12430c;
                    String str2 = this.f12430c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = l10.f12431d;
                        String str4 = this.f12431d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = l10.f12432e;
                            String str6 = this.f12432e;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = l10.f12433f;
                                String str8 = this.f12433f;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f12428a.hashCode() ^ 1000003) * 1000003) ^ this.f12429b.hashCode()) * 1000003;
        String str = this.f12430c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f12431d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12432e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12433f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f12428a);
        sb2.append(", version=");
        sb2.append(this.f12429b);
        sb2.append(", displayVersion=");
        sb2.append(this.f12430c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f12431d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f12432e);
        sb2.append(", developmentPlatformVersion=");
        return wg.b.c(sb2, this.f12433f, "}");
    }
}
