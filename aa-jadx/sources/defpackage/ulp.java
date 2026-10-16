package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulp {
    public final defpackage.ulo a;
    public final defpackage.xyn b;

    public ulp(defpackage.ulo uloVar, defpackage.xyn xynVar) {
        this.a = uloVar;
        this.b = xynVar;
    }

    public static defpackage.ulp a(defpackage.ulj uljVar, defpackage.ulo uloVar) {
        return new defpackage.ulp(uloVar, defpackage.xyn.h(uljVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ulp) {
            defpackage.ulp ulpVar = (defpackage.ulp) obj;
            if (this.a.equals(ulpVar.a) && this.b.equals(ulpVar.b)) {
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
        defpackage.xyn xynVar = this.b;
        return "{" + this.a.toString() + ", " + xynVar.toString() + "}";
    }

    public ulp() {
        throw null;
    }
}
