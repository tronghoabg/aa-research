package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bid extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bid(defpackage.affc affcVar, defpackage.bie bieVar, defpackage.bin binVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = affcVar;
        this.c = bieVar;
        this.d = binVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [affc, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.f != 0) {
            defpackage.bid bidVar = new defpackage.bid((defpackage.affg) this.b, (defpackage.aoq) this.c, (defpackage.apn) this.d, afdkVar, 1);
            bidVar.e = obj;
            return bidVar;
        }
        defpackage.bid bidVar2 = new defpackage.bid((defpackage.affc) this.b, (defpackage.bie) this.c, (defpackage.bin) this.d, afdkVar, 0);
        bidVar2.e = obj;
        return bidVar2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [affc, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        if (this.f != 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            int i = this.a;
            defpackage.afga.cz(obj);
            if (i == 0) {
                ajnd ajndVar = (ajnd) this.e;
                ?? r2 = this.b;
                defpackage.acn acnVar = new defpackage.acn(ajndVar, this.c, this.d, 3);
                this.a = 1;
                if (r2.invoke(acnVar, this) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        if (this.a == 0) {
            defpackage.afga.cz(obj);
            defpackage.bic bicVar = new defpackage.bic((defpackage.dal) this.e, this.b, (defpackage.bie) this.c, (defpackage.bin) this.d, null);
            this.a = 1;
            if (ahoi.a(bicVar, this) == afdrVar2) {
                return afdrVar2;
            }
        } else {
            defpackage.afga.cz(obj);
        }
        throw new defpackage.afap();
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.f != 0) {
            return ((defpackage.bid) b((ajnd) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bid) b((defpackage.dal) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bid(defpackage.affg affgVar, defpackage.aoq aoqVar, defpackage.apn apnVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = affgVar;
        this.c = aoqVar;
        this.d = apnVar;
    }
}
