package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uer {
    public final defpackage.uel a;
    public final defpackage.uel b;

    public uer(defpackage.uel uelVar, defpackage.uel uelVar2) {
        uelVar.getClass();
        this.a = uelVar;
        this.b = uelVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uer) {
            defpackage.uer uerVar = (defpackage.uer) obj;
            if (this.a.equals(uerVar.a) && this.b.equals(uerVar.b)) {
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
        defpackage.uel uelVar = this.b;
        return "{" + this.a.toString() + ", " + uelVar.toString() + "}";
    }

    public uer() {
        throw null;
    }
}
