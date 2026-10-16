package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class udo {
    public final defpackage.ujh a;
    public final defpackage.tpo b;

    public udo(defpackage.ujh ujhVar, defpackage.tpo tpoVar) {
        this.a = ujhVar;
        this.b = tpoVar;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.udo) {
            defpackage.udo udoVar = (defpackage.udo) obj;
            defpackage.ujh ujhVar = this.a;
            if (ujhVar != null ? ujhVar.equals(udoVar.a) : udoVar.a == null) {
                defpackage.tpo tpoVar = this.b;
                if (tpoVar != null ? tpoVar.equals(udoVar.b) : udoVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ujh ujhVar = this.a;
        int iHashCode = ujhVar == null ? 0 : ujhVar.hashCode();
        defpackage.tpo tpoVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (tpoVar != null ? tpoVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.tpo tpoVar = this.b;
        return "{" + java.lang.String.valueOf(this.a) + ", " + java.lang.String.valueOf(tpoVar) + "}";
    }

    public udo() {
        throw null;
    }
}
