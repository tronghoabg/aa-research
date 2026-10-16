package defpackage;

/* loaded from: classes2.dex */
public final class fxl extends fwi {
    public final gfa a;
    public final gfk b;
    public final afdr c;
    public final boolean d;
    public final fwe e;
    public ajh f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ fxl(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, ajh ajhVar, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? gey.b : gfaVar, (i & 2) != 0 ? new gfq() : gfkVar, (i & 4) != 0 ? null : afdrVar, (!((i & 8) == 0)) | z, (i & 16) != 0 ? null : fweVar, (i & 32) != 0 ? null : ajhVar, (!((i & 64) == 0)) | z2, (!((i & 128) == 0)) | z3, false);
    }

    public static /* synthetic */ fxl e(fxl fxlVar, afdr afdrVar, fwe fweVar, boolean z, boolean z2, int i) {
        gfa gfaVar = (i & 1) != 0 ? fxlVar.a : null;
        gfk gfkVar = (i & 2) != 0 ? fxlVar.b : null;
        if ((i & 4) != 0) {
            afdrVar = fxlVar.c;
        }
        afdr afdrVar2 = afdrVar;
        boolean z3 = (i & 8) != 0 ? fxlVar.d : false;
        fwe fweVar2 = (i & 16) != 0 ? fxlVar.e : fweVar;
        ajh ajhVar = (i & 32) != 0 ? fxlVar.f : null;
        boolean z4 = (i & 64) != 0 ? fxlVar.g : z;
        boolean z5 = (i & 128) != 0 ? fxlVar.h : false;
        boolean z6 = (i & 256) != 0 ? fxlVar.i : z2;
        gfaVar.getClass();
        gfkVar.getClass();
        return new fxl(gfaVar, gfkVar, afdrVar2, z3, fweVar2, ajhVar, z4, z5, z6);
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
        if (!(obj instanceof fxl)) {
            return false;
        }
        fxl fxlVar = (fxl) obj;
        return affa.f(this.a, fxlVar.a) && affa.f(this.b, fxlVar.b) && affa.f(this.c, fxlVar.c) && this.d == fxlVar.d && affa.f(this.e, fxlVar.e) && affa.f(this.f, fxlVar.f) && this.g == fxlVar.g && this.h == fxlVar.h && this.i == fxlVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afdr afdrVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.d)) * 31;
        fwe fweVar = this.e;
        int iHashCode3 = (iHashCode2 + (fweVar == null ? 0 : fweVar.hashCode())) * 31;
        ajh ajhVar = this.f;
        return ((((((iHashCode3 + (ajhVar != null ? ajhVar.hashCode() : 0)) * 31) + a.f(this.g)) * 31) + a.f(this.h)) * 31) + a.f(this.i);
    }

    public final String toString() {
        return "FilledActionButtonUiModel(annotatedStringProvider=" + this.a + ", painterProvider=" + this.b + ", onClick=" + this.c + ", enabled=" + this.d + ", buttonColors=" + this.e + ", border=" + this.f + ", isNightMode=" + this.g + ", showInteractions=" + this.h + ", isActive=" + this.i + ")";
    }

    public fxl(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, ajh ajhVar, boolean z2, boolean z3, boolean z4) {
        gfaVar.getClass();
        gfkVar.getClass();
        this.a = gfaVar;
        this.b = gfkVar;
        this.c = afdrVar;
        this.d = z;
        this.e = fweVar;
        this.f = ajhVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public fxl() {
        this((gfa) null, (gfk) null, (afdr) null, false, (fwe) null, (ajh) null, false, false, 511);
    }
}
