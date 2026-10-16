package defpackage;

/* loaded from: classes.dex */
public abstract class bvf {
    private final byr a;

    public bvf(afdr afdrVar) {
        this.a = new bwh(afdrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[PHI: r4
  0x0042: PHI (r4v2 bvp) = (r4v9 bvp), (r4v10 bvp) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.byr d(defpackage.bxe r3, defpackage.byr r4) {
        /*
            boolean r0 = r4 instanceof defpackage.bvp
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r3.e
            if (r0 == 0) goto L43
            r1 = r4
            bvp r1 = (defpackage.bvp) r1
            bwq r4 = r1.a
            java.lang.Object r0 = r3.a()
            r4.b(r0)
            goto L43
        L16:
            boolean r0 = r4 instanceof defpackage.byp
            if (r0 == 0) goto L35
            boolean r0 = r3.b
            if (r0 != 0) goto L22
            java.lang.Object r0 = r3.f
            if (r0 == 0) goto L43
        L22:
            boolean r0 = r3.e
            if (r0 != 0) goto L43
            java.lang.Object r0 = r3.a()
            byp r4 = (defpackage.byp) r4
            java.lang.Object r2 = r4.a
            boolean r0 = defpackage.affa.f(r0, r2)
            if (r0 != 0) goto L42
            goto L43
        L35:
            boolean r0 = r4 instanceof defpackage.bvi
            if (r0 == 0) goto L43
            afec r0 = r3.d
            bvi r4 = (defpackage.bvi) r4
            afec r2 = r4.a
            if (r0 == r2) goto L42
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 != 0) goto L70
            boolean r4 = r3.e
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.f
            byi r3 = r3.c
            bvp r0 = new bvp
            if (r3 != 0) goto L53
            bxp r3 = defpackage.bxp.c
        L53:
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r1.<init>(r4, r3)
            r0.<init>(r1)
            return r0
        L5c:
            afec r4 = r3.d
            if (r4 == 0) goto L66
            bvi r3 = new bvi
            r3.<init>(r4)
            return r3
        L66:
            byp r4 = new byp
            java.lang.Object r3 = r3.a()
            r4.<init>(r3)
            return r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.d(bxe, byr):byr");
    }

    public byr a() {
        return this.a;
    }

    public abstract bxe b(Object obj);

    public final bxe c(Object obj) {
        bxe bxeVarB = b(obj);
        bxeVarB.g = false;
        return bxeVarB;
    }
}
