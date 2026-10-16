package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class blt extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.blw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blt(defpackage.blw blwVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = blwVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.blt(this.b, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bd, code lost:
    
        if (r2 == r1) goto L141;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blt.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.blt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
