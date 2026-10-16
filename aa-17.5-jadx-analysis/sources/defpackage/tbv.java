package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
final class tbv extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ Duration c;
    final /* synthetic */ gjv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbv(gjv gjvVar, Duration duration, afck afckVar) {
        super(2, afckVar);
        this.d = gjvVar;
        this.c = duration;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        tbv tbvVar = new tbv(this.d, this.c, afckVar);
        tbvVar.e = obj;
        return tbvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r10.t(true, r9) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r1.t(true, r9) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[PHI: r1
  0x0076: PHI (r1v6 sx) = (r1v5 sx), (r1v10 sx) binds: [B:20:0x0074, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r9.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L15
            goto L29
        L15:
            java.lang.Object r1 = r9.e
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r10)
            goto L76
        L1d:
            java.lang.Object r1 = r9.a
            java.lang.Object r4 = r9.e
            sx r4 = (defpackage.sx) r4
            defpackage.woy.dF(r10)
            r10 = r1
            r1 = r4
            goto L68
        L29:
            defpackage.woy.dF(r10)
            goto L82
        L2d:
            defpackage.woy.dF(r10)
            java.lang.Object r10 = r9.e
            sx r10 = (defpackage.sx) r10
            gjv r1 = r9.d
            j$.time.Duration r7 = r9.c
            j$.time.Duration r1 = r1.u()
            j$.time.Duration r1 = r7.minus(r1)
            r1.getClass()
            j$.time.Duration r7 = j$.time.Duration.ZERO
            int r7 = r1.compareTo(r7)
            if (r7 > 0) goto L54
            r9.b = r5
            java.lang.Object r9 = r10.t(r6, r9)
            if (r9 != r0) goto L82
            goto L85
        L54:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r9.e = r10
            r9.a = r1
            r9.b = r4
            java.lang.Object r4 = r10.t(r5, r9)
            if (r4 == r0) goto L85
            r8 = r1
            r1 = r10
            r10 = r8
        L68:
            r9.e = r1
            r9.a = r2
            r9.b = r3
            j$.time.Duration r10 = (j$.time.Duration) r10
            java.lang.Object r10 = defpackage.wub.aq(r10, r9)
            if (r10 == r0) goto L85
        L76:
            r9.e = r2
            r10 = 4
            r9.b = r10
            java.lang.Object r9 = r1.t(r6, r9)
            if (r9 != r0) goto L82
            goto L85
        L82:
            afak r9 = defpackage.afak.a
            return r9
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tbv.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tbv) b((sx) obj, (afck) obj2)).hT(afak.a);
    }
}
