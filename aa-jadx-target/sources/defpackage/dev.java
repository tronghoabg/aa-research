package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class dev implements defpackage.affi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dev(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [affh, java.lang.Object] */
    @Override // defpackage.affi
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (this.b != 0) {
            defpackage.bil bilVar = (defpackage.bil) obj;
            ((java.lang.Integer) obj2).intValue();
            defpackage.bve bveVar = (defpackage.bve) obj3;
            int iIntValue = ((java.lang.Integer) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != bveVar.C(bilVar) ? 2 : 4;
            }
            if (bveVar.I((iIntValue & 131) != 130, iIntValue & 1)) {
                this.a.invoke(bilVar, bveVar, java.lang.Integer.valueOf(iIntValue & 14));
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        int i = ((defpackage.die) obj3).a;
        int i2 = ((defpackage.dif) obj4).a;
        defpackage.dew dewVar = (defpackage.dew) this.a;
        defpackage.bys bysVarF = dewVar.g.f((defpackage.dhz) obj, (defpackage.dil) obj2, i, i2);
        if (bysVarF instanceof defpackage.dit) {
            java.lang.Object obj5 = ((defpackage.dit) bysVarF).a;
            obj5.getClass();
            return (android.graphics.Typeface) obj5;
        }
        defpackage.ngb ngbVar = new defpackage.ngb(bysVarF, dewVar.h);
        dewVar.h = ngbVar;
        java.lang.Object obj6 = ngbVar.c;
        obj6.getClass();
        return (android.graphics.Typeface) obj6;
    }
}
