package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class big extends defpackage.cyc<defpackage.bih> {
    private final defpackage.dkg a;
    private final defpackage.dkd b;
    private final defpackage.beg c;
    private final boolean f;
    private final defpackage.djv h;
    private final defpackage.blw i;
    private final defpackage.djl j;
    private final defpackage.cit k;
    private final boolean d = false;
    private final boolean g = false;

    public big(defpackage.dkg dkgVar, defpackage.dkd dkdVar, defpackage.beg begVar, boolean z, defpackage.djv djvVar, defpackage.blw blwVar, defpackage.djl djlVar, defpackage.cit citVar) {
        this.a = dkgVar;
        this.b = dkdVar;
        this.c = begVar;
        this.f = z;
        this.h = djvVar;
        this.i = blwVar;
        this.j = djlVar;
        this.k = citVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bih(this.a, this.b, this.c, this.f, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bih bihVar = (defpackage.bih) cgeVar;
        boolean z = bihVar.d;
        defpackage.djl djlVar = bihVar.g;
        defpackage.blw blwVar = bihVar.f;
        bihVar.a = this.a;
        defpackage.dkd dkdVar = this.b;
        bihVar.b = dkdVar;
        bihVar.c = this.c;
        boolean z2 = this.f;
        bihVar.d = z2;
        bihVar.e = this.h;
        defpackage.blw blwVar2 = this.i;
        bihVar.f = blwVar2;
        defpackage.djl djlVar2 = this.j;
        bihVar.g = djlVar2;
        bihVar.h = this.k;
        if (z2 != z || !defpackage.afga.f(djlVar2, djlVar) || !defpackage.dgc.i(dkdVar.b)) {
            defpackage.cjv.r(bihVar).J();
        }
        if (defpackage.afga.f(blwVar2, blwVar)) {
            return;
        }
        blwVar2.f = new defpackage.bfd(bihVar, 11);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.big)) {
            return false;
        }
        defpackage.big bigVar = (defpackage.big) obj;
        if (!defpackage.afga.f(this.a, bigVar.a) || !defpackage.afga.f(this.b, bigVar.b) || !defpackage.afga.f(this.c, bigVar.c)) {
            return false;
        }
        boolean z = bigVar.d;
        if (this.f != bigVar.f) {
            return false;
        }
        boolean z2 = bigVar.g;
        return defpackage.afga.f(this.h, bigVar.h) && defpackage.afga.f(this.i, bigVar.i) && defpackage.afga.f(this.j, bigVar.j) && defpackage.afga.f(this.k, bigVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.djv djvVar = this.h;
        return (((((((((((((iHashCode * 31) + defpackage.a.e(false)) * 31) + defpackage.a.e(this.f)) * 31) + defpackage.a.e(false)) * 31) + djvVar.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final java.lang.String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.f + ", isPassword=false, offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ")";
    }
}
