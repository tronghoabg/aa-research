package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bhj extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.bhk b;
    final /* synthetic */ long c;
    final /* synthetic */ defpackage.bht d;
    final /* synthetic */ defpackage.bhi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj(defpackage.bhk bhkVar, long j, defpackage.bht bhtVar, defpackage.bhi bhiVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = bhkVar;
        this.c = j;
        this.d = bhtVar;
        this.e = bhiVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bhj(this.b, this.c, this.d, this.e, afdkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r6.b(r1, r5) == r0) goto L13;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r5.a
            r2 = 1
            defpackage.afga.cz(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L31
        Ld:
            bhk r6 = r5.b
            affg r6 = r6.a
            if (r6 == 0) goto L23
            long r3 = r5.c
            cji r1 = new cji
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L23
            goto L30
        L23:
            bht r6 = r5.d
            bhi r1 = r5.e
            r2 = 2
            r5.a = r2
            java.lang.Object r5 = r6.b(r1, r5)
            if (r5 != r0) goto L31
        L30:
            return r0
        L31:
            afbk r5 = defpackage.afbk.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhj.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bhj) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
