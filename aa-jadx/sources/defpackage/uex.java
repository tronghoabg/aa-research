package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uex {
    public final int a;
    public final int b;
    public final defpackage.xyn c;
    public final defpackage.abot d;

    public uex(defpackage.abot abotVar, int i, int i2, defpackage.xyn xynVar) {
        this.d = abotVar;
        this.a = i;
        this.b = i2;
        this.c = xynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uex) {
            defpackage.uex uexVar = (defpackage.uex) obj;
            if (this.d.equals(uexVar.d) && this.a == uexVar.a && this.b == uexVar.b && this.c.equals(uexVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() ^ 1000003;
        defpackage.xyn xynVar = this.c;
        return ((this.b ^ (((iHashCode * 1000003) ^ this.a) * 1000003)) * 1000003) ^ xynVar.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.c;
        return "{" + this.d.toString() + ", " + this.a + ", " + this.b + ", " + java.lang.String.valueOf(xynVar) + "}";
    }

    public uex() {
        throw null;
    }
}
