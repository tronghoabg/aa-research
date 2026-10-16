package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjr {
    public final int a;
    private final defpackage.tst b;
    private final defpackage.tpg c;

    public pjr(defpackage.tst tstVar, int i, defpackage.tpg tpgVar) {
        this.b = tstVar;
        this.a = i;
        this.c = tpgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pjr) {
            defpackage.pjr pjrVar = (defpackage.pjr) obj;
            if (this.b.equals(pjrVar.b) && this.a == pjrVar.a && this.c.equals(pjrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = java.lang.System.identityHashCode(this.b) ^ 1000003;
        defpackage.tpg tpgVar = this.c;
        return (((this.a ^ (iIdentityHashCode * 1000003)) * 1000003) ^ tpgVar.hashCode()) * 1000003;
    }

    public final java.lang.String toString() {
        defpackage.tpg tpgVar = this.c;
        return "{" + this.b.toString() + ", " + defpackage.tan.u(this.a) + ", " + tpgVar.toString() + ", null}";
    }

    public pjr() {
        throw null;
    }
}
