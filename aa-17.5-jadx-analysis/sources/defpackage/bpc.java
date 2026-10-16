package defpackage;

/* loaded from: classes.dex */
public final class bpc {
    public final long a;
    public final blx b;
    private final bpb c = null;

    public bpc(long j, blx blxVar) {
        this.a = j;
        this.b = blxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpc)) {
            return false;
        }
        bpc bpcVar = (bpc) obj;
        if (!a.j(this.a, bpcVar.a)) {
            return false;
        }
        bpb bpbVar = bpcVar.c;
        return affa.f(null, null) && affa.f(this.b, bpcVar.b);
    }

    public final int hashCode() {
        blx blxVar = this.b;
        return (a.g(this.a) * 961) + (blxVar != null ? blxVar.hashCode() : 0);
    }

    public final String toString() {
        return "RippleConfiguration(color=" + cjv.g(this.a) + ", focus=null, rippleAlpha=" + this.b + ")";
    }
}
