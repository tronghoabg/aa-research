package defpackage;

/* loaded from: classes2.dex */
public final class gmr implements gmo {
    public final gmo a;
    public final aiyk b;

    public gmr(gmo gmoVar, aiyk aiykVar) {
        this.a = gmoVar;
        this.b = aiykVar;
        gka.b(this, gka.a(gmoVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmr)) {
            return false;
        }
        gmr gmrVar = (gmr) obj;
        return affa.f(this.a, gmrVar.a) && affa.f(this.b, gmrVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aiyk aiykVar = this.b;
        return iHashCode + (aiykVar == null ? 0 : aiykVar.hashCode());
    }

    public final String toString() {
        return "PlaceholderInternalModel(initialModel=" + this.a + ", updates=" + this.b + ")";
    }
}
