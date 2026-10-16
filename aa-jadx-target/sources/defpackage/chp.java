package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chp extends defpackage.cyc<defpackage.chr> {
    private final defpackage.cne a;
    private final boolean b;
    private final defpackage.cfu c;
    private final defpackage.csr d;
    private final float f;
    private final defpackage.cke g;

    public chp(defpackage.cne cneVar, boolean z, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar) {
        this.a = cneVar;
        this.b = z;
        this.c = cfuVar;
        this.d = csrVar;
        this.f = f;
        this.g = ckeVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.chr(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.chr chrVar = (defpackage.chr) cgeVar;
        boolean z = chrVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || chrVar.a.a() == this.a.a())) {
            z3 = false;
        }
        chrVar.a = this.a;
        chrVar.b = z2;
        chrVar.c = this.c;
        chrVar.d = this.d;
        chrVar.e = this.f;
        chrVar.f = this.g;
        if (z3) {
            defpackage.cjv.r(chrVar).I();
        }
        defpackage.dai.G(chrVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.chp)) {
            return false;
        }
        defpackage.chp chpVar = (defpackage.chp) obj;
        return defpackage.afga.f(this.a, chpVar.a) && this.b == chpVar.b && defpackage.afga.f(this.c, chpVar.c) && defpackage.afga.f(this.d, chpVar.d) && java.lang.Float.compare(this.f, chpVar.f) == 0 && defpackage.afga.f(this.g, chpVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.f);
        defpackage.cke ckeVar = this.g;
        return (iHashCode * 31) + (ckeVar == null ? 0 : ckeVar.hashCode());
    }

    public final java.lang.String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.f + ", colorFilter=" + this.g + ")";
    }
}
