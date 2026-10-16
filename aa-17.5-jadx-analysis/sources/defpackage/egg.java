package defpackage;

/* loaded from: classes.dex */
final class egg extends afde implements afec {
    Object a;
    Object b;
    int c;
    final /* synthetic */ egh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(egh eghVar, afck afckVar) {
        super(1, afckVar);
        this.d = eghVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r6 == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L16
            java.lang.Object r0 = r5.b
            java.lang.Object r1 = r5.a
            java.io.FileNotFoundException r1 = (java.io.FileNotFoundException) r1
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L14
            goto L62
        L14:
            r6 = move-exception
            goto L6b
        L16:
            java.lang.Object r1 = r5.a
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L1c
            goto L39
        L1c:
            r6 = move-exception
            goto L3d
        L1e:
            defpackage.woy.dF(r6)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L43
            egh r6 = r5.d     // Catch: java.io.FileNotFoundException -> L43
            java.io.File r4 = r6.a     // Catch: java.io.FileNotFoundException -> L43
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L43
            eha r6 = r6.b     // Catch: java.lang.Throwable -> L1c
            r5.a = r1     // Catch: java.lang.Throwable -> L1c
            r5.b = r3     // Catch: java.lang.Throwable -> L1c
            r5.c = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r6 = r6.b(r1)     // Catch: java.lang.Throwable -> L1c
            if (r6 != r0) goto L39
            goto L68
        L39:
            defpackage.affa.n(r1, r3)     // Catch: java.io.FileNotFoundException -> L43
            return r6
        L3d:
            throw r6     // Catch: java.lang.Throwable -> L3e
        L3e:
            r2 = move-exception
            defpackage.affa.n(r1, r6)     // Catch: java.io.FileNotFoundException -> L43
            throw r2     // Catch: java.io.FileNotFoundException -> L43
        L43:
            egh r6 = r5.d
            java.io.File r1 = r6.a
            boolean r2 = r1.exists()
            if (r2 == 0) goto L83
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L66
            r2.<init>(r1)     // Catch: java.lang.Exception -> L66
            eha r6 = r6.b     // Catch: java.lang.Throwable -> L69
            r5.a = r3     // Catch: java.lang.Throwable -> L69
            r5.b = r2     // Catch: java.lang.Throwable -> L69
            r1 = 2
            r5.c = r1     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r6.b(r2)     // Catch: java.lang.Throwable -> L69
            if (r6 == r0) goto L68
            r0 = r2
        L62:
            defpackage.affa.n(r0, r3)     // Catch: java.lang.Exception -> L66
            goto L8b
        L66:
            r6 = move-exception
            goto L71
        L68:
            return r0
        L69:
            r6 = move-exception
            r0 = r2
        L6b:
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            defpackage.affa.n(r0, r6)     // Catch: java.lang.Exception -> L66
            throw r1     // Catch: java.lang.Exception -> L66
        L71:
            boolean r0 = r6 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L82
            egh r5 = r5.d
            java.io.File r5 = r5.a
            java.lang.String r5 = r5.getParent()
            java.lang.Exception r5 = defpackage.dsu.f(r5, r6)
            throw r5
        L82:
            throw r6
        L83:
            egh r5 = r5.d
            eha r5 = r5.b
            java.lang.Object r6 = r5.a()
        L8b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egg.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new egg(this.d, (afck) obj).hT(afak.a);
    }
}
