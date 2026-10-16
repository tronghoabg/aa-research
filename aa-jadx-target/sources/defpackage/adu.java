package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adu extends defpackage.cyc<defpackage.adw> {
    private final defpackage.agn a;
    private final defpackage.agi b;
    private final defpackage.acw c;
    private final defpackage.acx d;
    private final defpackage.adi f;

    public adu(defpackage.agn agnVar, defpackage.agi agiVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.adi adiVar) {
        this.a = agnVar;
        this.b = agiVar;
        this.c = acwVar;
        this.d = acxVar;
        this.f = adiVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.adw(this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.adw adwVar = (defpackage.adw) cgeVar;
        adwVar.a = this.b;
        adwVar.b = this.c;
        adwVar.c = this.d;
        adwVar.d = this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adu)) {
            return false;
        }
        defpackage.adu aduVar = (defpackage.adu) obj;
        return defpackage.afga.f(this.a, aduVar.a) && defpackage.afga.f(this.b, aduVar.b) && defpackage.afga.f(this.c, aduVar.c) && defpackage.afga.f(this.d, aduVar.d) && defpackage.afga.f(this.f, aduVar.f);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.f + ")";
    }
}
