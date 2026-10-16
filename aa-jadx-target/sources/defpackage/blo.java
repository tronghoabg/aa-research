package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class blo extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.blw b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blo(defpackage.blw blwVar, boolean z, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = blwVar;
        this.c = z;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.blo(this.b, this.c, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.kwv kwvVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.blw blwVar = this.b;
            boolean z = this.c;
            defpackage.dfb dfbVar = null;
            if (blwVar.w()) {
                defpackage.dfb dfbVarE = defpackage.dki.e(blwVar.f());
                if (z) {
                    long j = blwVar.f().b;
                    long j2 = defpackage.dgc.a;
                    int iMax = java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L));
                    blwVar.c.invoke(new defpackage.dkd(blwVar.f().a, defpackage.dax.g(iMax, iMax), (defpackage.dgc) null));
                    blwVar.q(defpackage.bdz.a);
                }
                dfbVar = dfbVarE;
            }
            if (dfbVar != null && (kwvVar = blwVar.x) != null) {
                defpackage.sr srVarQ = defpackage.asq.q(dfbVar);
                this.a = 1;
                if (kwvVar.O(srVarQ) == afdrVar) {
                    return afdrVar;
                }
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.blo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
