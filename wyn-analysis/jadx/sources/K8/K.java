package K8;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f6592a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6593b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6594c;

    public K(String str, String str2, String str3) {
        this.f6592a = str;
        this.f6593b = str2;
        this.f6594c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k = (K) obj;
            String str = this.f6592a;
            if (str != null ? str.equals(k.f6592a) : k.f6592a == null) {
                String str2 = this.f6593b;
                if (str2 != null ? str2.equals(k.f6593b) : k.f6593b == null) {
                    String str3 = this.f6594c;
                    if (str3 != null ? str3.equals(k.f6594c) : k.f6594c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6592a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6593b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6594c;
        return (str3 != null ? str3.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb2.append(this.f6592a);
        sb2.append(", playIntegrityToken=");
        sb2.append(this.f6593b);
        sb2.append(", recaptchaEnterpriseToken=");
        return wg.b.c(sb2, this.f6594c, "}");
    }
}
