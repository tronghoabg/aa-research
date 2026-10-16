package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class puc {
    public final java.lang.Class a;
    public final defpackage.pxs b;

    public puc(java.lang.Class cls, defpackage.pxs pxsVar) {
        cls.getClass();
        this.a = cls;
        this.b = pxsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.puc) {
            defpackage.puc pucVar = (defpackage.puc) obj;
            if (this.a.equals(pucVar.a) && this.b.equals(pucVar.b)) {
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
        defpackage.pxs pxsVar = this.b;
        return "{" + this.a.toString() + ", " + pxsVar.toString() + "}";
    }

    public puc() {
        throw null;
    }
}
