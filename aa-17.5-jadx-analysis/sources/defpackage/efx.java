package defpackage;

/* loaded from: classes2.dex */
final class efx extends afde implements afec {
    Object a;
    Object b;
    int c;
    final /* synthetic */ egd d;
    final /* synthetic */ afco e;
    final /* synthetic */ afeg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efx(egd egdVar, afco afcoVar, afeg afegVar, afck afckVar) {
        super(1, afckVar);
        this.d = egdVar;
        this.e = afcoVar;
        this.f = afegVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r14 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[PHI: r1 r14
  0x005f: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v10 java.lang.Object) binds: [B:16:0x005d, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x005f: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:16:0x005d, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r13.c
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L16
            java.lang.Object r13 = r13.b
            defpackage.woy.dF(r14)
            return r13
        L16:
            java.lang.Object r1 = r13.a
            defpackage.woy.dF(r14)
            goto L5f
        L1c:
            java.lang.Object r1 = r13.a
            defpackage.woy.dF(r14)
            goto L42
        L22:
            defpackage.woy.dF(r14)
            goto L3a
        L26:
            defpackage.woy.dF(r14)
            egd r14 = r13.d
            btm r1 = new btm
            r6 = 9
            r1.<init>(r14, r4, r6, r4)
            r13.c = r5
            java.lang.Object r14 = r14.i(r5, r1, r13)
            if (r14 == r0) goto L8d
        L3a:
            ees r14 = (defpackage.ees) r14
            r13.a = r14
            r13.c = r3
            r1 = r14
            r14 = r4
        L42:
            afco r3 = r13.e
            egd r7 = r13.d
            afeg r9 = r13.f
            r8 = r14
            fdf r8 = (defpackage.fdf) r8
            foz r6 = new foz
            r10 = r1
            ees r10 = (defpackage.ees) r10
            r11 = 0
            r12 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.a = r1
            r13.c = r2
            java.lang.Object r14 = defpackage.ahnc.a(r3, r6, r13)
            if (r14 == r0) goto L8d
        L5f:
            ees r1 = (defpackage.ees) r1
            java.lang.Object r2 = r1.a
            if (r2 == 0) goto L6a
            int r3 = r2.hashCode()
            goto L6b
        L6a:
            r3 = 0
        L6b:
            int r1 = r1.b
            if (r3 != r1) goto L85
            boolean r1 = defpackage.affa.f(r2, r14)
            if (r1 != 0) goto L84
            egd r1 = r13.d
            r13.a = r4
            r13.b = r14
            r2 = 4
            r13.c = r2
            java.lang.Object r13 = r1.j(r14, r5, r13)
            if (r13 == r0) goto L8d
        L84:
            return r14
        L85:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r13.<init>(r14)
            throw r13
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efx.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new efx(this.d, this.e, this.f, (afck) obj).hT(afak.a);
    }
}
