package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajk extends defpackage.cyc<defpackage.ajj> {
    private final float a;
    private final defpackage.cka b;
    private final defpackage.cld c;

    public ajk(float f, defpackage.cka ckaVar, defpackage.cld cldVar) {
        this.a = f;
        this.b = ckaVar;
        this.c = cldVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ajj(this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ajj ajjVar = (defpackage.ajj) cgeVar;
        float f = ajjVar.b;
        float f2 = this.a;
        if (java.lang.Float.compare(f, f2) != 0) {
            ajjVar.b = f2;
            ajjVar.e.d();
        }
        defpackage.cka ckaVar = this.b;
        if (!defpackage.afga.f(ajjVar.c, ckaVar)) {
            ajjVar.c = ckaVar;
            ajjVar.e.d();
        }
        defpackage.cld cldVar = this.c;
        if (defpackage.afga.f(ajjVar.d, cldVar)) {
            return;
        }
        ajjVar.d = cldVar;
        ajjVar.e.d();
        defpackage.cjv.r(ajjVar).J();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajk)) {
            return false;
        }
        defpackage.ajk ajkVar = (defpackage.ajk) obj;
        return java.lang.Float.compare(this.a, ajkVar.a) == 0 && defpackage.afga.f(this.b, ajkVar.b) && defpackage.afga.f(this.c, ajkVar.c);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "BorderModifierNodeElement(width=" + defpackage.dlr.b(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }
}
