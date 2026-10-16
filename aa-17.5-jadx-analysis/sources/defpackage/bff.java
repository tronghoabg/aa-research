package defpackage;

/* loaded from: classes.dex */
public final class bff {
    public final dft a;
    public cst b = null;
    public cst c;

    public bff(dft dftVar, cst cstVar) {
        this.a = dftVar;
        this.c = cstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long e(long r6) {
        /*
            r5 = this;
            cst r0 = r5.b
            if (r0 == 0) goto L1a
            boolean r1 = r0.t()
            if (r1 == 0) goto L16
            cst r5 = r5.c
            if (r5 == 0) goto L14
            r1 = 1
            cjb r5 = r5.o(r0, r1)
            goto L18
        L14:
            r5 = 0
            goto L18
        L16:
            cjb r5 = defpackage.cjb.a
        L18:
            if (r5 != 0) goto L1c
        L1a:
            cjb r5 = defpackage.cjb.a
        L1c:
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r5.b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L2c
            goto L3b
        L2c:
            float r3 = r5.d
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L37
            goto L3b
        L37:
            float r3 = java.lang.Float.intBitsToFloat(r1)
        L3b:
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r1
            float r4 = r5.c
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L4d
            goto L5b
        L4d:
            float r4 = r5.e
            float r5 = java.lang.Float.intBitsToFloat(r6)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 > 0) goto L5b
            float r4 = java.lang.Float.intBitsToFloat(r6)
        L5b:
            int r5 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r7
            long r5 = r5 << r0
            long r1 = r1 & r3
            long r5 = r5 | r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bff.e(long):long");
    }

    public final int a(long j, boolean z) {
        if (z) {
            j = e(j);
        }
        return this.a.j(b(j));
    }

    public final long b(long j) {
        cst cstVar;
        cst cstVar2 = this.b;
        if (cstVar2 != null) {
            if (true != cstVar2.t()) {
                cstVar2 = null;
            }
            if (cstVar2 != null && (cstVar = this.c) != null) {
                cst cstVar3 = true == cstVar.t() ? cstVar : null;
                if (cstVar3 != null) {
                    return cstVar2.i(cstVar3, j);
                }
            }
        }
        return j;
    }

    public final long c(long j) {
        cst cstVar;
        cst cstVar2 = this.b;
        if (cstVar2 != null) {
            if (true != cstVar2.t()) {
                cstVar2 = null;
            }
            if (cstVar2 != null && (cstVar = this.c) != null) {
                cst cstVar3 = true == cstVar.t() ? cstVar : null;
                if (cstVar3 != null) {
                    return cstVar3.i(cstVar2, j);
                }
            }
        }
        return j;
    }

    public final boolean d(long j) {
        long jB = b(e(j));
        dft dftVar = this.a;
        int iH = dftVar.h(Float.intBitsToFloat((int) (4294967295L & jB)));
        int i = (int) (jB >> 32);
        return Float.intBitsToFloat(i) >= dftVar.b(iH) && Float.intBitsToFloat(i) <= dftVar.c(iH);
    }
}
