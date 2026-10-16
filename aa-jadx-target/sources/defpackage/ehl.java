package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ehl extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.mku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehl(defpackage.mku mkuVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = mkuVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.ehl(this.c, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037 A[PHI: r1 r5
  0x0037: PHI (r1v1 ??) = (r1v5 ??), (r1v6 ??) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v6 java.lang.Object) = (r5v10 java.lang.Object), (r5v0 java.lang.Object) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r1.invoke(r5, r4) != r0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [affg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v9, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:13:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.afga.cz(r5)
            goto L43
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.afga.cz(r5)
            goto L37
        L13:
            defpackage.afga.cz(r5)
            mku r5 = r4.c
            java.lang.Object r5 = r5.c
            ldx r5 = (defpackage.ldx) r5
            int r5 = r5.w()
            if (r5 <= 0) goto L58
        L22:
            mku r5 = r4.c
            java.lang.Object r1 = r5.a
            ahoi.f(r1)
            java.lang.Object r1 = r5.b
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r5.d
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L57
        L37:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 == r0) goto L57
        L43:
            mku r5 = r4.c
            java.lang.Object r5 = r5.c
            ldx r5 = (defpackage.ldx) r5
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L54
            goto L22
        L54:
            afbk r4 = defpackage.afbk.a
            return r4
        L57:
            return r0
        L58:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehl.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ehl) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
