package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class amy extends defpackage.afee implements defpackage.affc {
    int a;
    final /* synthetic */ defpackage.ana b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.affi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amy(defpackage.ana anaVar, java.lang.Object obj, defpackage.affi affiVar, defpackage.afdk afdkVar) {
        super(1, afdkVar);
        this.b = anaVar;
        this.c = obj;
        this.d = affiVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.ana anaVar = this.b;
            anaVar.l(this.c);
            defpackage.aln alnVar = new defpackage.aln(anaVar, 6);
            defpackage.amx amxVar = new defpackage.amx(this.d, anaVar, (defpackage.afdk) null, 0);
            this.a = 1;
            if (defpackage.amr.a(alnVar, amxVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        java.lang.Boolean.TRUE.booleanValue();
        defpackage.ana anaVar2 = this.b;
        java.lang.Object obj2 = this.c;
        anaVar2.d.a(anaVar2.n().a(obj2), anaVar2.a());
        anaVar2.m(obj2);
        anaVar2.k(obj2);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return new defpackage.amy(this.b, this.c, this.d, (defpackage.afdk) obj).hf(defpackage.afbk.a);
    }
}
