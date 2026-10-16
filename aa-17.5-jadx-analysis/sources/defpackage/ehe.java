package defpackage;

/* loaded from: classes.dex */
final class ehe extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ mko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehe(mko mkoVar, afck afckVar) {
        super(2, afckVar);
        this.c = mkoVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ehe(this.c, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r1.invoke(r5, r4) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r1 r5
  0x0037: PHI (r1v1 afeg) = (r1v5 afeg), (r1v6 afeg) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v6 java.lang.Object) = (r5v10 java.lang.Object), (r5v0 java.lang.Object) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aixl, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:13:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.woy.dF(r5)
            goto L43
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.woy.dF(r5)
            goto L37
        L13:
            defpackage.woy.dF(r5)
            mko r5 = r4.c
            java.lang.Object r5 = r5.d
            kwp r5 = (defpackage.kwp) r5
            int r5 = r5.j()
            if (r5 <= 0) goto L58
        L22:
            mko r5 = r4.c
            java.lang.Object r1 = r5.b
            defpackage.ahni.f(r1)
            java.lang.Object r1 = r5.a
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r5.c
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
            mko r5 = r4.c
            java.lang.Object r5 = r5.d
            kwp r5 = (defpackage.kwp) r5
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L54
            goto L22
        L54:
            afak r4 = defpackage.afak.a
            return r4
        L57:
            return r0
        L58:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehe.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ehe) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
