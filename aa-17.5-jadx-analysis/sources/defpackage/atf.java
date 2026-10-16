package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class atf extends cfx implements cwu {
    public float a = 1.0f;
    public boolean b;

    public atf(boolean z) {
        this.b = z;
    }

    private final long d(long j, boolean z) {
        int iA = dle.a(j);
        if (iA == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iA * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ca.au(j, iRound, iA)) {
            return (iRound << 32) | iA;
        }
        return 0L;
    }

    private final long f(long j, boolean z) {
        int iB = dle.b(j);
        if (iB == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iB / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !ca.au(j, iB, iRound)) {
            return 0L;
        }
        return (iB << 32) | (4294967295L & iRound);
    }

    private final long g(long j, boolean z) {
        int iC = dle.c(j);
        int iRound = Math.round(iC * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ca.au(j, iRound, iC)) {
            return (iRound << 32) | iC;
        }
        return 0L;
    }

    private final long l(long j, boolean z) {
        int iD = dle.d(j);
        int iRound = Math.round(iD / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !ca.au(j, iD, iRound)) {
            return 0L;
        }
        return (iD << 32) | (4294967295L & iRound);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    @Override // defpackage.cwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctq el(defpackage.cts r8, defpackage.cto r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.b
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L49
            long r5 = r7.f(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.d(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.l(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.g(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.f(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.d(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.l(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.g(r10, r1)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L8a
            goto L89
        L49:
            long r5 = r7.d(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.f(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.g(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.l(r10, r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.d(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.f(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.g(r10, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L8a
            long r5 = r7.l(r10, r1)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L8a
        L89:
            r5 = r3
        L8a:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L8f
            goto L9f
        L8f:
            r7 = 32
            long r10 = r5 >> r7
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r7 = (int) r10
            int r10 = (int) r0
            long r10 = defpackage.dlf.v(r7, r10)
        L9f:
            cuo r7 = r9.v(r10)
            int r9 = r7.a
            int r10 = r7.b
            acm r11 = new acm
            r0 = 19
            r11.<init>(r7, r0)
            afbf r7 = defpackage.afbf.a
            ctq r7 = r8.eK(r9, r10, r7, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atf.el(cts, cto, long):ctq");
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cspVar.c(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cspVar.d(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cspVar.e(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cspVar.f(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }
}
