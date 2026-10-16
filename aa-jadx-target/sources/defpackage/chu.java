package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chu extends defpackage.cyc<defpackage.chv> {
    private final defpackage.cld a;
    private final defpackage.cnh b;

    public chu(defpackage.cld cldVar, defpackage.cnh cnhVar) {
        this.a = cldVar;
        this.b = cnhVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.chv(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.chv chvVar = (defpackage.chv) cgeVar;
        defpackage.cld cldVar = chvVar.a;
        defpackage.cld cldVar2 = this.a;
        boolean zF = defpackage.afga.f(cldVar, cldVar2);
        defpackage.cnh cnhVar = this.b;
        if (!zF || !defpackage.afga.f(chvVar.b, cnhVar)) {
            chvVar.c = null;
        }
        chvVar.a = cldVar2;
        chvVar.b = cnhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.chu)) {
            return false;
        }
        defpackage.chu chuVar = (defpackage.chu) obj;
        return defpackage.afga.f(this.a, chuVar.a) && defpackage.afga.f(this.b, chuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SimpleDropShadowElement(shape=" + this.a + ", shadow=" + this.b + ")";
    }
}
