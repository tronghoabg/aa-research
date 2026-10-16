package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lpd implements defpackage.loq {
    private final defpackage.lor a;
    private final defpackage.lke b;

    public lpd(defpackage.lor lorVar, defpackage.lke lkeVar) {
        this.a = lorVar;
        if (lkeVar == null) {
            throw new java.lang.NullPointerException("Null packageInfo");
        }
        this.b = lkeVar;
    }

    @Override // defpackage.loz
    public final defpackage.lke d() {
        return this.b;
    }

    @Override // defpackage.loz
    public final defpackage.lor e() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lpd) {
            defpackage.lpd lpdVar = (defpackage.lpd) obj;
            if (this.a.equals(lpdVar.a) && this.b.equals(lpdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.lke lkeVar = this.b;
        return "InactiveMediaBrowserConnection{connectionStatus=" + this.a.toString() + ", packageInfo=" + lkeVar.toString() + "}";
    }

    public lpd() {
        throw null;
    }
}
