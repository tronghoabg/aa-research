package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhm extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.bhn c;
    final /* synthetic */ defpackage.bht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhm(defpackage.bhn bhnVar, defpackage.bht bhtVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = bhnVar;
        this.d = bhtVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bhm(this.c, this.d, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r6.invoke(r5) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r1.invoke(r5) == r0) goto L33;
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
            int r1 = r5.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.afga.cz(r6)
            goto L50
        L13:
            java.lang.Object r5 = r5.a
            defpackage.afga.cz(r6)
            goto L66
        L19:
            defpackage.afga.cz(r6)     // Catch: java.lang.Throwable -> L21
            goto L42
        L1d:
            defpackage.afga.cz(r6)     // Catch: java.lang.Throwable -> L21
            goto L35
        L21:
            r6 = move-exception
            goto L53
        L23:
            defpackage.afga.cz(r6)
            bhn r6 = r5.c     // Catch: java.lang.Throwable -> L21
            affc r6 = r6.a     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L35
            r5.b = r4     // Catch: java.lang.Throwable -> L21
            java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L21
            if (r6 != r0) goto L35
            goto L64
        L35:
            bht r6 = r5.d     // Catch: java.lang.Throwable -> L21
            bhn r1 = r5.c     // Catch: java.lang.Throwable -> L21
            r5.b = r3     // Catch: java.lang.Throwable -> L21
            java.lang.Object r6 = r6.b(r1, r5)     // Catch: java.lang.Throwable -> L21
            if (r6 != r0) goto L42
            goto L64
        L42:
            bhn r6 = r5.c
            affc r6 = r6.b
            if (r6 == 0) goto L50
            r5.b = r2
            java.lang.Object r5 = r6.invoke(r5)
            if (r5 == r0) goto L64
        L50:
            afbk r5 = defpackage.afbk.a
            return r5
        L53:
            bhn r1 = r5.c
            affc r1 = r1.b
            if (r1 == 0) goto L65
            r5.a = r6
            r2 = 4
            r5.b = r2
            java.lang.Object r5 = r1.invoke(r5)
            if (r5 != r0) goto L65
        L64:
            return r0
        L65:
            r5 = r6
        L66:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhm.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bhm) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
