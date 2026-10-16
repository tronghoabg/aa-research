package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class blr extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ long c;
    final /* synthetic */ defpackage.dgc d;
    final /* synthetic */ defpackage.blw e;
    final /* synthetic */ defpackage.djv f;
    final /* synthetic */ defpackage.bki g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blr(defpackage.bki bkiVar, java.lang.String str, long j, defpackage.dgc dgcVar, defpackage.blw blwVar, defpackage.djv djvVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.g = bkiVar;
        this.b = str;
        this.c = j;
        this.d = dgcVar;
        this.e = blwVar;
        this.f = djvVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.blr(this.g, this.b, this.c, this.d, this.e, this.f, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.bki bkiVar = this.g;
            java.lang.String str = this.b;
            long j = this.c;
            this.a = 1;
            obj = (str.length() == 0 || defpackage.dgc.i(j)) ? null : bkiVar.f(new defpackage.bkh(str, j, bkiVar, null), this);
            if (obj == afdrVar) {
                return afdrVar;
            }
        }
        defpackage.dgc dgcVar = (defpackage.dgc) obj;
        if (dgcVar != null) {
            defpackage.djv djvVar = this.f;
            long j2 = dgcVar.b;
            long jG = defpackage.dax.g(djvVar.b(defpackage.dgc.e(j2)), djvVar.b(defpackage.dgc.a(j2)));
            if (!defpackage.dgc.h(jG, this.d)) {
                defpackage.blw blwVar = this.e;
                if (defpackage.afga.f(blwVar.f().a(), this.b) && djvVar == blwVar.b) {
                    blwVar.c.invoke(new defpackage.dkd(blwVar.f().a, jG, (defpackage.dgc) null));
                    blwVar.o = new defpackage.dgc(jG);
                }
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.blr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
