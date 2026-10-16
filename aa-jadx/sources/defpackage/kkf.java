package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kkf {
    public final defpackage.klx a;
    public final defpackage.kkg b;
    private final defpackage.afar c = defpackage.afga.cA(new defpackage.kjt(this, 4));

    public kkf(defpackage.klx klxVar, defpackage.kkg kkgVar) {
        this.a = klxVar;
        this.b = kkgVar;
    }

    public final defpackage.kkn a() {
        return (defpackage.kkn) this.c.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kkf)) {
            return false;
        }
        defpackage.kkf kkfVar = (defpackage.kkf) obj;
        return defpackage.afga.f(this.a, kkfVar.a) && defpackage.afga.f(this.b, kkfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CarProperty(id=" + this.a + ", config=" + this.b + ")";
    }
}
