package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blf extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.bys b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blf(defpackage.agn agnVar, defpackage.bys bysVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.c = agnVar;
        this.b = bysVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.e == 0) {
            defpackage.blf blfVar = new defpackage.blf(this.b, (defpackage.aeb) this.c, afdkVar, 0);
            blfVar.d = obj;
            return blfVar;
        }
        defpackage.blf blfVar2 = new defpackage.blf((defpackage.agn) this.c, this.b, afdkVar, 1);
        blfVar2.d = obj;
        return blfVar2;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        if (this.e == 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                aiuw aiuwVar = (aiuw) this.d;
                aizj aizjVarAu = defpackage.dai.au(new defpackage.bjd(this.b, 10));
                defpackage.ash ashVar = new defpackage.ash(this.c, aiuwVar, 4);
                this.a = 1;
                if (aizjVarAu.hd(ashVar, this) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.bxj bxjVar = (defpackage.bxj) this.d;
            java.lang.Object obj2 = this.c;
            aiza aizaVar = new aiza(new defpackage.byr(new defpackage.nz(obj2, 5), null));
            defpackage.giz gizVar = new defpackage.giz(bxjVar, (defpackage.agn) obj2, this.b, 1);
            this.a = 1;
            if (aizaVar.hd(gizVar, this) == afdrVar2) {
                return afdrVar2;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.e != 0) {
            return ((defpackage.blf) b((defpackage.bxj) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.blf) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blf(defpackage.bys bysVar, defpackage.aeb aebVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.b = bysVar;
        this.c = aebVar;
    }
}
