package defpackage;

/* loaded from: classes2.dex */
public final class fxq extends fwi {
    public final gfk a;
    public final afdr b;
    public final boolean c;
    public final boolean d;
    public final fwe e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public gfa i;

    public fxq(gfk gfkVar, afdr afdrVar, boolean z, boolean z2, fwe fweVar, boolean z3, boolean z4, boolean z5) {
        gfkVar.getClass();
        this.a = gfkVar;
        this.b = afdrVar;
        this.c = z;
        this.d = z2;
        this.e = fweVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = gey.b;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.e;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.i;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.b;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxq)) {
            return false;
        }
        fxq fxqVar = (fxq) obj;
        return affa.f(this.a, fxqVar.a) && affa.f(this.b, fxqVar.b) && this.c == fxqVar.c && this.d == fxqVar.d && affa.f(this.e, fxqVar.e) && this.f == fxqVar.f && this.g == fxqVar.g && this.h == fxqVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        afdr afdrVar = this.b;
        int iHashCode2 = (((((iHashCode + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.c)) * 31) + a.f(this.d)) * 31;
        fwe fweVar = this.e;
        return ((((((iHashCode2 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + a.f(this.g)) * 31) + a.f(this.h);
    }

    public final String toString() {
        return "IconActionButtonUiModel(painterProvider=" + this.a + ", onClick=" + this.b + ", enabled=" + this.c + ", isAppIcon=" + this.d + ", buttonColors=" + this.e + ", isNightMode=" + this.f + ", showInteractions=" + this.g + ", shouldTintAppIcon=" + this.h + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fxq() {
        this(null, 0 == true ? 1 : 0, 255);
    }

    public /* synthetic */ fxq(gfk gfkVar, afdr afdrVar, int i) {
        this((i & 1) != 0 ? new gfq() : gfkVar, (i & 2) != 0 ? null : afdrVar, true, false, null, true, true, false);
    }
}
