package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqc extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.aqp b;
    final /* synthetic */ long c;
    final /* synthetic */ afgs d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqc(defpackage.aqp aqpVar, long j, afgs afgsVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = aqpVar;
        this.c = j;
        this.d = afgsVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqc aqcVar = new defpackage.aqc(this.b, this.c, this.d, afdkVar);
        aqcVar.e = obj;
        return aqcVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.izq izqVar = (defpackage.izq) this.e;
            defpackage.aqp aqpVar = this.b;
            long j = this.c;
            afgs afgsVar = this.d;
            float fB = aqpVar.b(j);
            defpackage.bgl bglVar = new defpackage.bgl(afgsVar, aqpVar, izqVar, 1);
            this.a = 1;
            if (defpackage.afw.i(fB, null, bglVar, this, 12) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqc) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
