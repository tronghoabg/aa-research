package defpackage;

/* loaded from: classes2.dex */
public final class gna implements hju {
    public final fzv a;
    public final gfa b;
    public final gfa c;
    public final afdr d;

    static {
        int i = fzv.a;
    }

    public gna(fzv fzvVar, gfa gfaVar, gfa gfaVar2, afdr afdrVar) {
        this.a = fzvVar;
        this.b = gfaVar;
        this.c = gfaVar2;
        this.d = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gna)) {
            return false;
        }
        gna gnaVar = (gna) obj;
        return affa.f(this.a, gnaVar.a) && affa.f(this.b, gnaVar.b) && affa.f(this.c, gnaVar.c) && affa.f(this.d, gnaVar.d);
    }

    public final int hashCode() {
        fzv fzvVar = this.a;
        int iHashCode = fzvVar == null ? 0 : fzvVar.hashCode();
        gfa gfaVar = this.b;
        int iHashCode2 = gfaVar == null ? 0 : gfaVar.hashCode();
        int i = iHashCode * 31;
        gfa gfaVar2 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (gfaVar2 == null ? 0 : gfaVar2.hashCode())) * 31;
        afdr afdrVar = this.d;
        return iHashCode3 + (afdrVar != null ? afdrVar.hashCode() : 0);
    }

    public final String toString() {
        return "WidgetItem(image=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", onClick=" + this.d + ")";
    }

    public gna() {
        this(null, null, null, null);
    }
}
