package defpackage;

/* loaded from: classes.dex */
final class lde {
    public final lbt a;
    public final abrd b;
    public final abqx c;

    public lde(lbt lbtVar, abrd abrdVar, abqx abqxVar) {
        lbtVar.getClass();
        this.a = lbtVar;
        this.b = abrdVar;
        this.c = abqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lde)) {
            return false;
        }
        lde ldeVar = (lde) obj;
        return this.a == ldeVar.a && affa.f(this.b, ldeVar.b) && affa.f(this.c, ldeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        abrd abrdVar = this.b;
        int iHashCode2 = (iHashCode + (abrdVar == null ? 0 : abrdVar.hashCode())) * 31;
        abqx abqxVar = this.c;
        return iHashCode2 + (abqxVar != null ? abqxVar.hashCode() : 0);
    }

    public final String toString() {
        return "SurveyData(survey=" + this.a + ", config=" + this.b + ", storedData=" + this.c + ")";
    }
}
