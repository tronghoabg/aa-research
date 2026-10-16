package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bim extends defpackage.cyc<defpackage.bin> {
    private final defpackage.bip a;
    private final defpackage.beg b;
    private final defpackage.blw c;

    public bim(defpackage.bip bipVar, defpackage.beg begVar, defpackage.blw blwVar) {
        this.a = bipVar;
        this.b = begVar;
        this.c = blwVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bin(this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bin binVar = (defpackage.bin) cgeVar;
        if (binVar.A) {
            binVar.a.f();
            binVar.a.l(binVar);
        }
        binVar.a = this.a;
        if (binVar.A) {
            binVar.a.k(binVar);
        }
        binVar.b = this.b;
        binVar.c = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bim)) {
            return false;
        }
        defpackage.bim bimVar = (defpackage.bim) obj;
        return defpackage.afga.f(this.a, bimVar.a) && defpackage.afga.f(this.b, bimVar.b) && defpackage.afga.f(this.c, bimVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
