package defpackage;

/* loaded from: classes2.dex */
public final class fxs extends fwi {
    public final gfa a;
    public final gfk b;
    public final fzp c;
    public final afdr d;
    public final boolean e;
    public final fwe f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public fxs(gfa gfaVar, gfk gfkVar, fzp fzpVar, afdr afdrVar, boolean z, fwe fweVar, boolean z2, boolean z3, int i, boolean z4) {
        this.a = gfaVar;
        this.b = gfkVar;
        this.c = fzpVar;
        this.d = afdrVar;
        this.e = z;
        this.f = fweVar;
        this.g = z2;
        this.h = z3;
        this.j = i;
        this.i = z4;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.f;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.a;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.d;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxs)) {
            return false;
        }
        fxs fxsVar = (fxs) obj;
        return affa.f(this.a, fxsVar.a) && affa.f(this.b, fxsVar.b) && affa.f(this.c, fxsVar.c) && affa.f(this.d, fxsVar.d) && this.e == fxsVar.e && affa.f(this.f, fxsVar.f) && this.g == fxsVar.g && this.h == fxsVar.h && this.j == fxsVar.j && this.i == fxsVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fzp fzpVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (fzpVar == null ? 0 : fzpVar.hashCode())) * 31;
        afdr afdrVar = this.d;
        int iHashCode3 = (((iHashCode2 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.e)) * 31;
        fwe fweVar = this.f;
        return ((((((((iHashCode3 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + a.f(this.g)) * 31) + a.f(this.h)) * 31) + this.j) * 31) + a.f(this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapActionButtonUiModel(annotatedStringProvider=");
        sb.append(this.a);
        sb.append(", painterProvider=");
        sb.append(this.b);
        sb.append(", carImageUiModel=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", enabled=");
        sb.append(this.e);
        sb.append(", buttonColors=");
        sb.append(this.f);
        sb.append(", isNightMode=");
        sb.append(this.g);
        sb.append(", showInteractions=");
        sb.append(this.h);
        sb.append(", type=");
        int i = this.j;
        sb.append((Object) (i != 1 ? i != 2 ? "PRIMARY_MINIMIZED" : "PRIMARY" : "DEFAULT"));
        sb.append(", isVisible=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public fxs() {
        this(gey.b, new gfq(), null, null, true, null, true, true, 1, true);
    }
}
