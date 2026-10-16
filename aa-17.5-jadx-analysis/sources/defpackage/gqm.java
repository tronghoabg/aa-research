package defpackage;

/* loaded from: classes2.dex */
public final class gqm {
    public final hjw a;
    public final hjw b;

    static {
        hjw hjwVar = hjw.a;
    }

    public gqm(hjw hjwVar, hjw hjwVar2) {
        this.a = hjwVar;
        this.b = hjwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqm)) {
            return false;
        }
        gqm gqmVar = (gqm) obj;
        return affa.f(this.a, gqmVar.a) && affa.f(this.b, gqmVar.b);
    }

    public final int hashCode() {
        hjw hjwVar = this.a;
        int iHashCode = hjwVar == null ? 0 : hjwVar.hashCode();
        hjw hjwVar2 = this.b;
        return (iHashCode * 31) + (hjwVar2 != null ? hjwVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SeekbarColors(activeColor=" + this.a + ", inactiveColor=" + this.b + ")";
    }
}
