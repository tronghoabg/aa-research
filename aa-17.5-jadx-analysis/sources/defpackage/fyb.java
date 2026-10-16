package defpackage;

/* loaded from: classes2.dex */
public final class fyb extends fwi {
    public final aiyk a;
    public final afdr b;
    public final fwe c;
    private final boolean d;
    private final boolean e;
    private final gfa f;
    private final gfk g;
    private final boolean h;

    public /* synthetic */ fyb(aiyk aiykVar, afdr afdrVar, fwe fweVar, boolean z, boolean z2, int i) {
        aiykVar = (i & 1) != 0 ? ajac.a(new gfq()) : aiykVar;
        afdrVar = (i & 2) != 0 ? null : afdrVar;
        fweVar = (i & 4) != 0 ? null : fweVar;
        boolean z3 = z | (!((i & 8) == 0));
        boolean z4 = (i & 16) != 0;
        gfs gfsVar = (i & 32) != 0 ? gey.b : null;
        gfq gfqVar = (i & 64) != 0 ? new gfq() : null;
        boolean z5 = (i & 128) == 0;
        aiykVar.getClass();
        gfsVar.getClass();
        gfqVar.getClass();
        this.a = aiykVar;
        this.b = afdrVar;
        this.c = fweVar;
        this.d = z3;
        this.e = z4;
        this.f = gfsVar;
        this.g = gfqVar;
        this.h = z2 | (!z5);
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.c;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.f;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.b;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyb)) {
            return false;
        }
        fyb fybVar = (fyb) obj;
        return affa.f(this.a, fybVar.a) && affa.f(this.b, fybVar.b) && affa.f(this.c, fybVar.c) && this.d == fybVar.d && this.e == fybVar.e && affa.f(this.f, fybVar.f) && affa.f(this.g, fybVar.g) && this.h == fybVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        afdr afdrVar = this.b;
        int iHashCode2 = (iHashCode + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        fwe fweVar = this.c;
        return ((((((((((iHashCode2 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + a.f(this.d)) * 31) + a.f(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a.f(this.h);
    }

    public final String toString() {
        return "SwappableIconActionButtonUiModel(swappableIconPainter=" + this.a + ", onClick=" + this.b + ", buttonColors=" + this.c + ", isNightMode=" + this.d + ", enabled=" + this.e + ", annotatedStringProvider=" + this.f + ", painterProvider=" + this.g + ", showInteractions=" + this.h + ")";
    }

    public fyb() {
        this(null, null, null, false, false, 255);
    }
}
