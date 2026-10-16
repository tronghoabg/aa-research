package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ldj {
    public final defpackage.lby a;
    public final defpackage.absg b;
    public final absa c;

    public ldj(defpackage.lby lbyVar, defpackage.absg absgVar, absa absaVar) {
        lbyVar.getClass();
        this.a = lbyVar;
        this.b = absgVar;
        this.c = absaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ldj)) {
            return false;
        }
        defpackage.ldj ldjVar = (defpackage.ldj) obj;
        return this.a == ldjVar.a && defpackage.afga.f(this.b, ldjVar.b) && defpackage.afga.f(this.c, ldjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.absg absgVar = this.b;
        int iHashCode2 = (iHashCode + (absgVar == null ? 0 : absgVar.hashCode())) * 31;
        absa absaVar = this.c;
        return iHashCode2 + (absaVar != null ? absaVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SurveyData(survey=" + this.a + ", config=" + this.b + ", storedData=" + this.c + ")";
    }
}
