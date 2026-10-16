package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayc extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayc(defpackage.axx axxVar, int i, defpackage.afdk afdkVar, int i2) {
        super(2, afdkVar);
        this.e = i2;
        this.c = axxVar;
        this.b = i;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.e;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            defpackage.ayc aycVar = new defpackage.ayc((defpackage.axx) obj2, this.b, afdkVar, 1);
            aycVar.d = obj;
            return aycVar;
        }
        defpackage.ayc aycVar2 = new defpackage.ayc((defpackage.aye) obj2, this.b, afdkVar, 0);
        aycVar2.d = obj;
        return aycVar2;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        if (this.e != 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            int i = this.a;
            defpackage.afga.cz(obj);
            if (i == 0) {
                defpackage.apw apwVar = (defpackage.apw) this.d;
                java.lang.Object obj2 = this.c;
                defpackage.ayb aybVar = new defpackage.ayb(apwVar, obj2, 1);
                int i2 = this.b;
                defpackage.dlo dloVarD = ((defpackage.axx) obj2).d();
                this.a = 1;
                if (defpackage.axd.k(aybVar, i2, 100, dloVarD, this) == afdrVar) {
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
            defpackage.apw apwVar2 = (defpackage.apw) this.d;
            java.lang.Object obj3 = this.c;
            defpackage.ayb aybVar2 = new defpackage.ayb(apwVar2, obj3, 0);
            int i3 = this.b;
            defpackage.bwx bwxVar = ((defpackage.aye) obj3).a;
            defpackage.dlo dloVar = ((defpackage.aya) bwxVar.a()).a;
            this.a = 1;
            if (defpackage.axd.k(aybVar2, i3, 0, dloVar, this) == afdrVar2) {
                return afdrVar2;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.e != 0) {
            return ((defpackage.ayc) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.ayc) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayc(defpackage.aye ayeVar, int i, defpackage.afdk afdkVar, int i2) {
        super(2, afdkVar);
        this.e = i2;
        this.c = ayeVar;
        this.b = i;
    }
}
