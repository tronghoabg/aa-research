package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajc extends defpackage.cyc<defpackage.ajd> {
    private final long a;
    private final defpackage.cld b;

    public ajc(long j, defpackage.cld cldVar) {
        this.a = j;
        this.b = cldVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ajd(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ajd ajdVar = (defpackage.ajd) cgeVar;
        ajdVar.a = this.a;
        ajdVar.b = 1.0f;
        defpackage.cld cldVar = ajdVar.c;
        defpackage.cld cldVar2 = this.b;
        if (!defpackage.afga.f(cldVar, cldVar2)) {
            ajdVar.c = cldVar2;
            defpackage.cjv.r(ajdVar).J();
        }
        defpackage.dai.G(ajdVar);
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ajc ajcVar = obj instanceof defpackage.ajc ? (defpackage.ajc) obj : null;
        return ajcVar != null && this.a == ajcVar.a && defpackage.afga.f(this.b, ajcVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 961) + 1065353216) * 31) + this.b.hashCode();
    }
}
