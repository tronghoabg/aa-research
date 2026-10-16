package defpackage;

/* loaded from: classes.dex */
public final class bbx implements aom {
    public final bbt a;
    private final arn b;

    public bbx(arn arnVar, bbt bbtVar) {
        this.b = arnVar;
        this.a = bbtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.apr r8, float r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.bbw
            if (r0 == 0) goto L13
            r0 = r10
            bbw r0 = (defpackage.bbw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bbw r0 = new bbw
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.woy.dF(r10)
            goto L42
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.woy.dF(r10)
            arn r10 = r7.b
            bbn r2 = new bbn
            r2.<init>(r7, r3)
            r0.c = r4
            java.lang.Object r10 = r10.c(r8, r9, r2, r0)
            if (r10 == r1) goto L97
        L42:
            java.lang.Number r10 = (java.lang.Number) r10
            float r8 = r10.floatValue()
            bbt r7 = r7.a
            float r9 = r7.c()
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L54
            goto L88
        L54:
            float r9 = r7.c()
            float r9 = java.lang.Math.abs(r9)
            double r0 = (double) r9
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 >= 0) goto L88
            int r9 = r7.j()
            boolean r0 = r7.i()
            r1 = 0
            if (r0 == 0) goto L84
            bwq r0 = r7.n
            java.lang.Object r0 = r0.a()
            bbj r0 = (defpackage.bbj) r0
            aitx r0 = r0.q
            beo r2 = new beo
            r5 = 0
            r2.<init>(r7, r5, r4)
            defpackage.ahnc.d(r0, r5, r1, r2, r3)
        L84:
            r7.u(r9, r10, r1)
            goto L91
        L88:
            float r7 = r7.c()
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r7)
        L91:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r8)
            return r7
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbx.a(apr, float, afck):java.lang.Object");
    }
}
