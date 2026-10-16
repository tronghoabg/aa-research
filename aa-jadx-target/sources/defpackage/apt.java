package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apt extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ defpackage.aej c;
    final /* synthetic */ afgs d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apt(float f, defpackage.aej aejVar, afgs afgsVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = f;
        this.c = aejVar;
        this.d = afgsVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.apt aptVar = new defpackage.apt(this.b, this.c, this.d, afdkVar);
        aptVar.e = obj;
        return aptVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.apw apwVar = (defpackage.apw) this.e;
            float f = this.b;
            defpackage.aej aejVar = this.c;
            defpackage.aps apsVar = new defpackage.aps(this.d, apwVar, 0);
            this.a = 1;
            if (defpackage.afw.i(f, aejVar, apsVar, this, 4) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apt) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
