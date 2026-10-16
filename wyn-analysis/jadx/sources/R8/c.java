package R8;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10449c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f10447a = str;
        this.f10448b = str2;
        this.f10449c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f10447a.equals(cVar.f10447a)) {
                String str = cVar.f10448b;
                String str2 = this.f10448b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = cVar.f10449c;
                    String str4 = this.f10449c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10447a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10448b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10449c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f10447a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f10448b);
        sb2.append(", firebaseAuthenticationToken=");
        return wg.b.c(sb2, this.f10449c, "}");
    }
}
