package defpackage;

/* loaded from: classes2.dex */
public final class hhd implements hju {
    public final gfa a;
    public final fzp b;
    public final boolean c;
    public final afdr d;

    public hhd(gfa gfaVar, fzp fzpVar, boolean z, afdr afdrVar) {
        this.a = gfaVar;
        this.b = fzpVar;
        this.c = z;
        this.d = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhd)) {
            return false;
        }
        hhd hhdVar = (hhd) obj;
        return affa.f(this.a, hhdVar.a) && affa.f(this.b, hhdVar.b) && this.c == hhdVar.c && affa.f(this.d, hhdVar.d);
    }

    public final int hashCode() {
        gfa gfaVar = this.a;
        int iHashCode = gfaVar == null ? 0 : gfaVar.hashCode();
        fzp fzpVar = this.b;
        return (((((iHashCode * 31) + (fzpVar != null ? fzpVar.hashCode() : 0)) * 31) + a.f(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TabItemUiModel(title=" + this.a + ", icon=" + this.b + ", isActive=" + this.c + ", onClick=" + this.d + ")";
    }
}
