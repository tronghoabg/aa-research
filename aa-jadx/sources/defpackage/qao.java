package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qao implements java.io.Serializable {
    public final defpackage.qbb a;
    private final defpackage.qan b;
    private final defpackage.xyn c;
    private final defpackage.xyn d;

    public qao(defpackage.qbb qbbVar, defpackage.qan qanVar, defpackage.xyn xynVar, defpackage.xyn xynVar2) {
        qbbVar.getClass();
        this.a = qbbVar;
        this.b = qanVar;
        this.c = xynVar;
        this.d = xynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qao) {
            defpackage.qao qaoVar = (defpackage.qao) obj;
            if (this.a.equals(qaoVar.a) && this.b.equals(qaoVar.b) && this.c.equals(qaoVar.c) && this.d.equals(qaoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.a.a + ", " + this.b.toString() + ", " + this.c.toString() + ", " + this.d.toString() + "}";
    }

    public qao() {
        throw null;
    }
}
