package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class anh extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.ark b;
    final /* synthetic */ defpackage.anj c;
    final /* synthetic */ defpackage.and d;
    final /* synthetic */ long e;
    final /* synthetic */ aiwg f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anh(defpackage.ark arkVar, defpackage.anj anjVar, defpackage.and andVar, long j, aiwg aiwgVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = arkVar;
        this.c = anjVar;
        this.d = andVar;
        this.e = j;
        this.f = aiwgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.anh anhVar = new defpackage.anh(this.b, this.c, this.d, this.e, this.f, afdkVar);
        anhVar.g = obj;
        return anhVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.izq izqVar = (defpackage.izq) this.g;
            defpackage.ark arkVar = this.b;
            defpackage.anj anjVar = this.c;
            defpackage.and andVar = this.d;
            arkVar.e = anjVar.b(andVar, this.e);
            defpackage.acn acnVar = new defpackage.acn((java.lang.Object) anjVar, (java.lang.Object) this.f, (java.lang.Object) izqVar, 2, (char[]) null);
            defpackage.axl axlVar = new defpackage.axl(anjVar, arkVar, andVar, 1);
            this.a = 1;
            if (arkVar.a(acnVar, axlVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.anh) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
