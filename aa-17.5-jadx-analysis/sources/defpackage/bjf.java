package defpackage;

/* loaded from: classes.dex */
public final class bjf {
    public final deu a;
    public deu b;
    public boolean c = false;
    public biu d = null;

    public bjf(deu deuVar, deu deuVar2) {
        this.a = deuVar;
        this.b = deuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjf)) {
            return false;
        }
        bjf bjfVar = (bjf) obj;
        return affa.f(this.a, bjfVar.a) && affa.f(this.b, bjfVar.b) && this.c == bjfVar.c && affa.f(this.d, bjfVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = true != this.c ? 1237 : 1231;
        biu biuVar = this.d;
        return (((iHashCode * 31) + i) * 31) + (biuVar == null ? 0 : biuVar.hashCode());
    }

    public final String toString() {
        deu deuVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) deuVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
