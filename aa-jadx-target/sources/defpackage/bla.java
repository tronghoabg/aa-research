package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bla extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ afgu c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bla(long j, afgu afguVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = j;
        this.c = afguVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bla blaVar = new defpackage.bla(this.b, this.c, afdkVar);
        blaVar.d = obj;
        return blaVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.cru cruVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.a != 0) {
            cruVar = (defpackage.cru) this.d;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            defpackage.cru cruVar2 = (defpackage.cru) this.d;
            long j = this.b;
            defpackage.amc amcVar = new defpackage.amc(this.c, 10);
            this.d = cruVar2;
            this.a = 1;
            java.lang.Object objAQ = defpackage.ca.aQ(cruVar2, j, amcVar, this);
            if (objAQ == afdrVar) {
                return afdrVar;
            }
            cruVar = cruVar2;
            obj = objAQ;
        }
        if (((defpackage.crd) obj) != null && (this.c.a & 9223372034707292159L) != 9205357640488583168L) {
            return defpackage.bjz.b;
        }
        defpackage.crd crdVar = (defpackage.crd) defpackage.afga.az(cruVar.p().a);
        if (!defpackage.tq.l(crdVar)) {
            return defpackage.bjz.d;
        }
        crdVar.b();
        return defpackage.bjz.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bla) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
