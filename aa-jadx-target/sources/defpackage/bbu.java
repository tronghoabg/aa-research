package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bbu extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.bby b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;
    final /* synthetic */ defpackage.aej e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbu(defpackage.bby bbyVar, int i, float f, defpackage.aej aejVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = bbyVar;
        this.c = i;
        this.d = f;
        this.e = aejVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bbu bbuVar = new defpackage.bbu(this.b, this.c, this.d, this.e, afdkVar);
        bbuVar.f = obj;
        return bbuVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i;
        int iB;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = this.a;
        defpackage.afga.cz(obj);
        if (i2 == 0) {
            defpackage.apw apwVar = (defpackage.apw) this.f;
            defpackage.bby bbyVar = this.b;
            defpackage.ayb aybVar = new defpackage.ayb(apwVar, bbyVar, 2);
            int i3 = this.c;
            float f = this.d;
            defpackage.aej aejVar = this.e;
            defpackage.amc amcVar = new defpackage.amc(bbyVar, 6);
            this.a = 1;
            defpackage.bbz bbzVar = defpackage.bca.a;
            amcVar.invoke(aybVar, new java.lang.Integer(i3));
            int iB2 = aybVar.b();
            int iE = aybVar.e() - aybVar.b();
            boolean z = i3 > iB2;
            if (((z && i3 > aybVar.e()) || (!z && i3 < aybVar.b())) && java.lang.Math.abs(i3 - aybVar.b()) >= 3) {
                int i4 = iE + 1;
                if (!z ? (i = i3 + i4) > (iB = aybVar.b()) : (i = i3 - i4) < (iB = aybVar.b())) {
                    i = iB;
                }
                aybVar.g(i);
            }
            java.lang.Object objI = defpackage.afw.i(aybVar.f(i3) + f, aejVar, new defpackage.aps(new afgs(), aybVar, 7), this, 4);
            if (objI != obj2) {
                objI = defpackage.afbk.a;
            }
            if (objI == obj2) {
                return obj2;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bbu) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
