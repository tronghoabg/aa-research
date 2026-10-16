package defpackage;

/* loaded from: classes2.dex */
public final class hea implements hju {
    public final gcq a;
    public final gcq b;
    public final gab c;
    private final boolean d = false;

    public hea(gcq gcqVar, gcq gcqVar2, gab gabVar) {
        this.a = gcqVar;
        this.b = gcqVar2;
        this.c = gabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hea)) {
            return false;
        }
        hea heaVar = (hea) obj;
        if (!affa.f(this.a, heaVar.a) || !affa.f(this.b, heaVar.b)) {
            return false;
        }
        boolean z = heaVar.d;
        return affa.f(this.c, heaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcq gcqVar = this.b;
        int iHashCode2 = (((iHashCode + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31) + 1237) * 31;
        gab gabVar = this.c;
        return iHashCode2 + (gabVar != null ? gabVar.hashCode() : 0);
    }

    public final String toString() {
        return "SectionHeaderUiModel(title=" + this.a + ", subtitle=" + this.b + ", emphasize=false, trailingIcon=" + this.c + ")";
    }
}
