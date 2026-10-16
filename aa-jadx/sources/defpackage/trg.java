package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class trg {
    private final defpackage.uzx a;
    private final defpackage.xyn b;
    private final defpackage.xyn c;

    public trg(defpackage.uzx uzxVar, defpackage.xyn xynVar, defpackage.xyn xynVar2) {
        this.a = uzxVar;
        this.b = xynVar;
        this.c = xynVar2;
    }

    public static defpackage.trg a(defpackage.uzx uzxVar, defpackage.uzx uzxVar2, defpackage.uzx uzxVar3) {
        return new defpackage.trg(uzxVar, defpackage.xyn.g(uzxVar2), defpackage.xyn.g(uzxVar3));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.trg) {
            defpackage.trg trgVar = (defpackage.trg) obj;
            if (this.a.equals(trgVar.a) && this.b.equals(trgVar.b) && this.c.equals(trgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.c;
        defpackage.xyn xynVar2 = this.b;
        return "{" + this.a.toString() + ", " + xynVar2.toString() + ", " + xynVar.toString() + "}";
    }

    public trg() {
        throw null;
    }
}
