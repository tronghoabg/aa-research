package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class wbm {
    public final android.content.Context a;
    public final defpackage.xzi b;

    public wbm(android.content.Context context, defpackage.xzi xziVar) {
        this.a = context;
        this.b = xziVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.xzi xziVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wbm) {
            defpackage.wbm wbmVar = (defpackage.wbm) obj;
            if (this.a.equals(wbmVar.a) && ((xziVar = this.b) != null ? xziVar.equals(wbmVar.b) : wbmVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.xzi xziVar = this.b;
        return (xziVar == null ? 0 : xziVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xzi xziVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + java.lang.String.valueOf(xziVar) + "}";
    }

    public wbm() {
        throw null;
    }
}
