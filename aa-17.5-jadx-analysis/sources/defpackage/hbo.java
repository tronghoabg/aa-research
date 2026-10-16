package defpackage;

/* loaded from: classes2.dex */
public final class hbo implements hju {
    public static final int a;
    public final hjw b;
    public final hjw c;
    public final hjw d;
    public final gzw e;

    static {
        hjw hjwVar = hjw.a;
        a = 8;
    }

    public hbo(hjw hjwVar, hjw hjwVar2, hjw hjwVar3, gzw gzwVar) {
        this.b = hjwVar;
        this.c = hjwVar2;
        this.d = hjwVar3;
        this.e = gzwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbo)) {
            return false;
        }
        hbo hboVar = (hbo) obj;
        return affa.f(this.b, hboVar.b) && affa.f(this.c, hboVar.c) && affa.f(this.d, hboVar.d) && affa.f(this.e, hboVar.e);
    }

    public final int hashCode() {
        hjw hjwVar = this.b;
        int iHashCode = hjwVar == null ? 0 : hjwVar.hashCode();
        hjw hjwVar2 = this.c;
        int iHashCode2 = hjwVar2 == null ? 0 : hjwVar2.hashCode();
        int i = iHashCode * 31;
        hjw hjwVar3 = this.d;
        int iHashCode3 = (((i + iHashCode2) * 31) + (hjwVar3 == null ? 0 : hjwVar3.hashCode())) * 31;
        gzw gzwVar = this.e;
        return iHashCode3 + (gzwVar != null ? gzwVar.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipStyleUiModel(backgroundColor=" + this.b + ", contentColor=" + this.c + ", outlineColor=" + this.d + ", shape=" + this.e + ")";
    }

    public hbo() {
        this(null, null, null, null);
    }
}
