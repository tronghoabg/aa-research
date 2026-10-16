package defpackage;

/* loaded from: classes3.dex */
public final class ulq {
    public final abgl a;
    public final ukp b;
    public final String c;
    public final boolean d;
    public final pxj e;
    public final int f;
    public final urg g;

    public ulq(abgl abglVar, ukp ukpVar, String str, boolean z, urg urgVar, pxj pxjVar, int i) {
        this.a = abglVar;
        this.b = ukpVar;
        this.c = str;
        this.d = z;
        this.g = urgVar;
        this.e = pxjVar;
        this.f = 1;
    }

    public final xxi a() {
        return new xxi(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        pxj pxjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulq) {
            ulq ulqVar = (ulq) obj;
            if (this.a.equals(ulqVar.a) && this.b.equals(ulqVar.b) && this.c.equals(ulqVar.c) && this.d == ulqVar.d && this.g.equals(ulqVar.g) && ((pxjVar = this.e) != null ? pxjVar.equals(ulqVar.e) : ulqVar.e == null)) {
                int i = ulqVar.f;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
        pxj pxjVar = this.e;
        return (((pxjVar == null ? 0 : pxjVar.hashCode()) ^ (iHashCode * 1000003)) * 1000003) ^ 1;
    }

    public final String toString() {
        xxg xxgVarAn = woy.an(ulq.class);
        xxgVarAn.b("paintTileType", this.a.name());
        xxgVarAn.b("coords", this.b);
        xxgVarAn.b("versionId", this.c);
        xxgVarAn.h("enableUnchangedEpochDetection", this.d);
        xxgVarAn.b("networkTileCallback", this.g);
        xxgVarAn.b("requestPriority", "UNSPECIFIED");
        return xxgVarAn.toString();
    }

    public ulq() {
        throw null;
    }
}
