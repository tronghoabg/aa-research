package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afjd {
    public static final defpackage.afjd a = new defpackage.afjd(null, null);
    public final defpackage.afje b;
    public final defpackage.afjb c;

    public afjd(defpackage.afje afjeVar, defpackage.afjb afjbVar) {
        this.b = afjeVar;
        this.c = afjbVar;
        if ((afjeVar == null) == (afjbVar == null)) {
        } else {
            throw new java.lang.IllegalArgumentException(afjeVar == null ? "Star projection must have no type specified." : defpackage.a.bl(afjeVar, "The projection variance ", " requires type to be specified."));
        }
    }

    public static /* synthetic */ defpackage.afjd a(defpackage.afjd afjdVar, defpackage.afjb afjbVar) {
        return new defpackage.afjd(afjdVar.b, afjbVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.afjd)) {
            return false;
        }
        defpackage.afjd afjdVar = (defpackage.afjd) obj;
        return this.b == afjdVar.b && defpackage.afga.f(this.c, afjdVar.c);
    }

    public final int hashCode() {
        defpackage.afje afjeVar = this.b;
        int iHashCode = afjeVar == null ? 0 : afjeVar.hashCode();
        defpackage.afjb afjbVar = this.c;
        return (iHashCode * 31) + (afjbVar != null ? afjbVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.afje afjeVar = this.b;
        if (afjeVar == null) {
            return "*";
        }
        int iOrdinal = afjeVar.ordinal();
        if (iOrdinal == 0) {
            return java.lang.String.valueOf(this.c);
        }
        if (iOrdinal == 1) {
            defpackage.afjb afjbVar = this.c;
            java.util.Objects.toString(afjbVar);
            return "in ".concat(java.lang.String.valueOf(afjbVar));
        }
        if (iOrdinal != 2) {
            throw new defpackage.afas();
        }
        defpackage.afjb afjbVar2 = this.c;
        java.util.Objects.toString(afjbVar2);
        return "out ".concat(java.lang.String.valueOf(afjbVar2));
    }
}
