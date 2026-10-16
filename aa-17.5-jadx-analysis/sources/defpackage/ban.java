package defpackage;

/* loaded from: classes.dex */
public final class ban implements amy {
    private final bbt a;
    private final amy b;
    private final dlr c;

    public ban(bbt bbtVar, amy amyVar, dlr dlrVar) {
        this.a = bbtVar;
        this.b = amyVar;
        this.c = dlrVar;
    }

    private final boolean d(bbt bbtVar) {
        return this.c == dlr.b && bbtVar.x().e == api.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // defpackage.amy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            float r2 = r6 + r7
            amy r3 = r5.b
            float r6 = r3.a(r6, r7, r8)
            r7 = 1
            r3 = 0
            if (r1 <= 0) goto L14
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L1d
            goto L1e
        L14:
            java.util.Map r1 = defpackage.ahc.a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L1d
            goto L1e
        L1d:
            r7 = r3
        L1e:
            float r1 = java.lang.Math.abs(r6)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L27
            goto L50
        L27:
            if (r7 == 0) goto L50
            bbt r7 = r5.a
            int r5 = r5.c(r7)
            float r5 = (float) r5
            float r5 = -r5
        L31:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 <= 0) goto L40
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 >= 0) goto L40
            int r8 = r7.l()
            float r8 = (float) r8
            float r5 = r5 + r8
            goto L31
        L40:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L4f
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 <= 0) goto L4f
            int r8 = r7.l()
            float r8 = (float) r8
            float r5 = r5 - r8
            goto L40
        L4f:
            return r5
        L50:
            bbt r6 = r5.a
            int r7 = r6.g
            int r7 = java.lang.Math.abs(r7)
            double r1 = (double) r7
            r3 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L63
            return r0
        L63:
            int r7 = r5.c(r6)
            float r7 = (float) r7
            boolean r5 = r5.d(r6)
            float r7 = -r7
            if (r5 == 0) goto L7a
            boolean r5 = r6.v()
            if (r5 != 0) goto L86
            int r5 = r6.l()
            goto L84
        L7a:
            boolean r5 = r6.v()
            if (r5 == 0) goto L86
            int r5 = r6.l()
        L84:
            float r5 = (float) r5
            float r7 = r7 + r5
        L86:
            float r5 = -r8
            float r5 = defpackage.afpt.d(r7, r5, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ban.a(float, float, float):float");
    }

    @Override // defpackage.amy
    public final /* synthetic */ aec b() {
        return amx.a;
    }

    public final int c(bbt bbtVar) {
        return d(bbtVar) ? (-bbtVar.g) + bbtVar.l() : bbtVar.g;
    }
}
