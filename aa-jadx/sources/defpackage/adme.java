package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adme {
    public final defpackage.adjw a;
    public final defpackage.adnd b;
    public final defpackage.adng c;
    private final defpackage.admc d;

    public adme(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.admc admcVar) {
        adngVar.getClass();
        this.c = adngVar;
        adndVar.getClass();
        this.b = adndVar;
        adjwVar.getClass();
        this.a = adjwVar;
        admcVar.getClass();
        this.d = admcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.adme admeVar = (defpackage.adme) obj;
            if (j$.util.Objects.equals(this.a, admeVar.a) && j$.util.Objects.equals(this.b, admeVar.b) && j$.util.Objects.equals(this.c, admeVar.c) && j$.util.Objects.equals(this.d, admeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final java.lang.String toString() {
        defpackage.adjw adjwVar = this.a;
        defpackage.adnd adndVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + adndVar.toString() + " callOptions=" + adjwVar.toString() + "]";
    }

    public adme() {
        throw null;
    }
}
