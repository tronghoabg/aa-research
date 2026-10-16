package defpackage;

/* loaded from: classes3.dex */
public final class zxr {
    private final acbe a;
    private final String b;

    public zxr(acbe acbeVar, String str) {
        this.a = acbeVar;
        this.b = str;
    }

    public static zxr a(acbe acbeVar, String str) {
        return new zxr(acbeVar, woy.al(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zxr) {
            zxr zxrVar = (zxr) obj;
            if (this.a.equals(zxrVar.a) && this.b.equals(zxrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "QuotaResponseCacheKey{eventType=" + this.a.toString() + ", mapId=" + this.b + "}";
    }

    public zxr() {
        throw null;
    }
}
