package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amn extends defpackage.afee implements defpackage.affi {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.ana d;
    final /* synthetic */ defpackage.aej e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amn(defpackage.ana anaVar, defpackage.aej aejVar, defpackage.afdk afdkVar) {
        super(4, afdkVar);
        this.d = anaVar;
        this.e = aejVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objE;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            java.lang.Object obj3 = this.f;
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.c;
            defpackage.ana anaVar = this.d;
            defpackage.aej aejVar = this.e;
            float fA = anaVar.a();
            this.f = null;
            this.b = null;
            this.a = 1;
            float fA2 = ((defpackage.ank) obj4).a(obj5);
            afgs afgsVar = new afgs();
            afgsVar.a = java.lang.Float.isNaN(anaVar.b()) ? 0.0f : anaVar.b();
            if (java.lang.Float.isNaN(fA2)) {
                objE = defpackage.afbk.a;
            } else {
                float f = afgsVar.a;
                if (f == fA2 || (objE = defpackage.afw.e(f, fA2, fA, aejVar, new defpackage.aps(obj3, afgsVar, 1, null), this)) != obj2) {
                    objE = defpackage.afbk.a;
                }
            }
            if (objE == obj2) {
                return obj2;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affi
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.amn amnVar = new defpackage.amn(this.d, this.e, (defpackage.afdk) obj4);
        amnVar.f = (defpackage.amz) obj;
        amnVar.b = (defpackage.ank) obj2;
        amnVar.c = obj3;
        return amnVar.hf(defpackage.afbk.a);
    }
}
