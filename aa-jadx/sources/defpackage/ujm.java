package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujm {
    public final defpackage.xyn a;
    public final defpackage.xyn b;
    public final defpackage.xyn c;
    public final defpackage.xyn d;

    public ujm(defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4) {
        this.a = xynVar;
        this.b = xynVar2;
        this.c = xynVar3;
        this.d = xynVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ujm) {
            defpackage.ujm ujmVar = (defpackage.ujm) obj;
            if (this.a.equals(ujmVar.a) && this.b.equals(ujmVar.b) && this.c.equals(ujmVar.c) && this.d.equals(ujmVar.d)) {
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
        defpackage.xyn xynVar = this.d;
        defpackage.xyn xynVar2 = this.c;
        defpackage.xyn xynVar3 = this.b;
        return "{" + java.lang.String.valueOf(this.a) + ", " + java.lang.String.valueOf(xynVar3) + ", " + java.lang.String.valueOf(xynVar2) + ", " + java.lang.String.valueOf(xynVar) + "}";
    }

    public ujm() {
        throw null;
    }
}
