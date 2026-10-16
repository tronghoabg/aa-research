package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjj {
    public final defpackage.dfb a;
    public defpackage.dfb b;
    public boolean c = false;
    public defpackage.bix d = null;

    public bjj(defpackage.dfb dfbVar, defpackage.dfb dfbVar2) {
        this.a = dfbVar;
        this.b = dfbVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bjj)) {
            return false;
        }
        defpackage.bjj bjjVar = (defpackage.bjj) obj;
        return defpackage.afga.f(this.a, bjjVar.a) && defpackage.afga.f(this.b, bjjVar.b) && this.c == bjjVar.c && defpackage.afga.f(this.d, bjjVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = true != this.c ? 1237 : 1231;
        defpackage.bix bixVar = this.d;
        return (((iHashCode * 31) + i) * 31) + (bixVar == null ? 0 : bixVar.hashCode());
    }

    public final java.lang.String toString() {
        defpackage.dfb dfbVar = this.b;
        return "TextSubstitutionValue(original=" + ((java.lang.Object) this.a) + ", substitution=" + ((java.lang.Object) dfbVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
