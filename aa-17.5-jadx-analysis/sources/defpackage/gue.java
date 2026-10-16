package defpackage;

/* loaded from: classes2.dex */
public final class gue {
    public final deu a;
    public final hjw b;

    public gue(deu deuVar, hjw hjwVar) {
        this.a = deuVar;
        this.b = hjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gue)) {
            return false;
        }
        gue gueVar = (gue) obj;
        return affa.f(this.a, gueVar.a) && affa.f(this.b, gueVar.b);
    }

    public final int hashCode() {
        deu deuVar = this.a;
        int iHashCode = deuVar == null ? 0 : deuVar.hashCode();
        hjw hjwVar = this.b;
        return (iHashCode * 31) + (hjwVar != null ? hjwVar.hashCode() : 0);
    }

    public final String toString() {
        return "EtaDetail(text=" + ((Object) this.a) + ", color=" + this.b + ")";
    }
}
