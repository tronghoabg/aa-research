package defpackage;

/* loaded from: classes.dex */
public final class chi extends cxt<chj> {
    private final cmw a;
    private final boolean b;
    private final cfn c;
    private final csi d;
    private final float f;
    private final cjw g;

    public chi(cmw cmwVar, boolean z, cfn cfnVar, csi csiVar, float f, cjw cjwVar) {
        this.a = cmwVar;
        this.b = z;
        this.c = cfnVar;
        this.d = csiVar;
        this.f = f;
        this.g = cjwVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new chj(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        chj chjVar = (chj) cfxVar;
        boolean z = chjVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || chjVar.a.a() == this.a.a())) {
            z3 = false;
        }
        chjVar.a = this.a;
        chjVar.b = z2;
        chjVar.c = this.c;
        chjVar.d = this.d;
        chjVar.e = this.f;
        chjVar.f = this.g;
        if (z3) {
            bzi.q(chjVar).I();
        }
        cjn.w(chjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chi)) {
            return false;
        }
        chi chiVar = (chi) obj;
        return affa.f(this.a, chiVar.a) && this.b == chiVar.b && affa.f(this.c, chiVar.c) && affa.f(this.d, chiVar.d) && Float.compare(this.f, chiVar.f) == 0 && affa.f(this.g, chiVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.f);
        cjw cjwVar = this.g;
        return (iHashCode * 31) + (cjwVar == null ? 0 : cjwVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.f + ", colorFilter=" + this.g + ")";
    }
}
