package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class azd extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ defpackage.azf c;
    final /* synthetic */ defpackage.afd d;
    final /* synthetic */ defpackage.cmq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azd(boolean z, defpackage.azf azfVar, defpackage.afd afdVar, defpackage.cmq cmqVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = z;
        this.c = azfVar;
        this.d = afdVar;
        this.e = cmqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.azd(this.b, this.c, this.d, this.e, afdkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r9.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.afga.cz(r10)     // Catch: java.lang.Throwable -> L13
            r7 = r9
            goto L53
        Lf:
            defpackage.afga.cz(r10)     // Catch: java.lang.Throwable -> L13
            goto L31
        L13:
            r0 = move-exception
            r10 = r0
            r7 = r9
            goto L62
        L17:
            defpackage.afga.cz(r10)
            boolean r10 = r9.b     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L31
            azf r10 = r9.c     // Catch: java.lang.Throwable -> L13
            aeb r10 = r10.m     // Catch: java.lang.Throwable -> L13
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L13
            r9.a = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r10 = r10.e(r1, r9)     // Catch: java.lang.Throwable -> L13
            if (r10 != r0) goto L31
            goto L52
        L31:
            azf r10 = r9.c     // Catch: java.lang.Throwable -> L5f
            aeb r3 = r10.m     // Catch: java.lang.Throwable -> L5f
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L5f
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5f
            afd r5 = r9.d     // Catch: java.lang.Throwable -> L5f
            cmq r1 = r9.e     // Catch: java.lang.Throwable -> L5f
            ajy r6 = new ajy     // Catch: java.lang.Throwable -> L5f
            r7 = 13
            r6.<init>(r1, r10, r7)     // Catch: java.lang.Throwable -> L5f
            r10 = 2
            r9.a = r10     // Catch: java.lang.Throwable -> L5f
            r8 = 4
            r7 = r9
            java.lang.Object r10 = defpackage.aeb.k(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d
            if (r10 != r0) goto L53
        L52:
            return r0
        L53:
            aeh r10 = (defpackage.aeh) r10     // Catch: java.lang.Throwable -> L5d
            azf r9 = r7.c
            r9.d(r2)
            afbk r9 = defpackage.afbk.a
            return r9
        L5d:
            r0 = move-exception
            goto L61
        L5f:
            r0 = move-exception
            r7 = r9
        L61:
            r10 = r0
        L62:
            azf r9 = r7.c
            r9.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azd.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.azd) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
