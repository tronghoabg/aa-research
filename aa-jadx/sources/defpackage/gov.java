package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gov {
    public final defpackage.gpf a;
    public final int b;
    public final defpackage.gzl c;

    public gov(defpackage.gpf gpfVar, int i, defpackage.gzl gzlVar) {
        gpfVar.getClass();
        gzlVar.getClass();
        this.a = gpfVar;
        this.b = i;
        this.c = gzlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gov)) {
            return false;
        }
        defpackage.gov govVar = (defpackage.gov) obj;
        return defpackage.afga.f(this.a, govVar.a) && this.b == govVar.b && this.c == govVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "State(model=" + this.a + ", selectedIndex=" + this.b + ", screenState=" + this.c + ")";
    }
}
