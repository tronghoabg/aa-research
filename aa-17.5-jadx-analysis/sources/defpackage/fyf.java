package defpackage;

/* loaded from: classes2.dex */
public final class fyf extends fwi {
    public final gfa a;
    public final gfk b;
    public final afdr c;
    public final boolean d;
    public final fwe e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final boolean i;

    public /* synthetic */ fyf(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? gey.b : gfaVar, (i & 2) != 0 ? new gfq() : gfkVar, (i & 4) != 0 ? null : afdrVar, (!((i & 8) == 0)) | z, (i & 16) != 0 ? null : fweVar, (!((i & 32) == 0)) | z2, (!((i & 64) == 0)) | z3, gjk.f.k, true);
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
        if (!(obj instanceof fyf)) {
            return false;
        }
        fyf fyfVar = (fyf) obj;
        return affa.f(this.a, fyfVar.a) && affa.f(this.b, fyfVar.b) && affa.f(this.c, fyfVar.c) && this.d == fyfVar.d && affa.f(this.e, fyfVar.e) && this.f == fyfVar.f && this.g == fyfVar.g && dlj.c(this.h, fyfVar.h) && this.i == fyfVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afdr afdrVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.d)) * 31;
        fwe fweVar = this.e;
        return ((((((((iHashCode2 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + a.f(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + a.f(this.i);
    }

    public final String toString() {
        return "TonalActionButtonUiModel(annotatedStringProvider=" + this.a + ", painterProvider=" + this.b + ", onClick=" + this.c + ", enabled=" + this.d + ", buttonColors=" + this.e + ", isNightMode=" + this.f + ", showInteractions=" + this.g + ", labelHorizontalPadding=" + dlj.b(this.h) + ", applyPassiveTintOnCarIconSpans=" + this.i + ")";
    }

    public fyf(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, boolean z2, boolean z3, float f, boolean z4) {
        gfaVar.getClass();
        this.a = gfaVar;
        this.b = gfkVar;
        this.c = afdrVar;
        this.d = z;
        this.e = fweVar;
        this.f = z2;
        this.g = z3;
        this.h = f;
        this.i = z4;
    }
}
