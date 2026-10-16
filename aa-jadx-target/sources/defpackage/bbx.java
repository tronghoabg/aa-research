package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbx extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbx(defpackage.baf bafVar, int i, defpackage.afdk afdkVar, int i2) {
        super(2, afdkVar);
        this.d = i2;
        this.c = bafVar;
        this.b = i;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.d;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            return new defpackage.bbx((defpackage.baf) obj2, this.b, afdkVar, 1);
        }
        return new defpackage.bbx((defpackage.bby) obj2, this.b, afdkVar, 0);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        if (this.d != 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            int i = this.a;
            defpackage.afga.cz(obj);
            if (i == 0) {
                java.lang.Object obj2 = this.c;
                int i2 = this.b;
                defpackage.bad badVar = ((defpackage.baf) obj2).b;
                this.a = 1;
                if (badVar.f(i2, this) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        if (this.a != 0) {
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            java.lang.Object obj3 = this.c;
            this.a = 1;
            if (((defpackage.bby) obj3).p(this) == afdrVar2) {
                return afdrVar2;
            }
        }
        defpackage.bby bbyVar = (defpackage.bby) this.c;
        bbyVar.t(bbyVar.f(this.b), 0.0f, true);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.d != 0) {
            return ((defpackage.bbx) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bbx) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbx(defpackage.bby bbyVar, int i, defpackage.afdk afdkVar, int i2) {
        super(2, afdkVar);
        this.d = i2;
        this.c = bbyVar;
        this.b = i;
    }
}
