package defpackage;

/* loaded from: classes2.dex */
public final class fxu extends fwi {
    public final gfa a;
    public final gfk b;
    public final afdr c;
    public final boolean d;
    public final fwe e;
    public final boolean f;
    public final boolean g;

    public fxu(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, boolean z2, boolean z3) {
        this.a = gfaVar;
        this.b = gfkVar;
        this.c = afdrVar;
        this.d = z;
        this.e = fweVar;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.e;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.a;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.c;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxu)) {
            return false;
        }
        fxu fxuVar = (fxu) obj;
        return affa.f(this.a, fxuVar.a) && affa.f(this.b, fxuVar.b) && affa.f(this.c, fxuVar.c) && this.d == fxuVar.d && affa.f(this.e, fxuVar.e) && this.f == fxuVar.f && this.g == fxuVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afdr afdrVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.d)) * 31;
        fwe fweVar = this.e;
        return ((((iHashCode2 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + a.f(this.g);
    }

    public final String toString() {
        return "OutlinedActionButtonUiModel(annotatedStringProvider=" + this.a + ", painterProvider=" + this.b + ", onClick=" + this.c + ", enabled=" + this.d + ", buttonColors=" + this.e + ", isNightMode=" + this.f + ", showInteractions=" + this.g + ")";
    }

    public fxu() {
        this(gey.b, new gfq(), null, true, null, true, true);
    }
}
