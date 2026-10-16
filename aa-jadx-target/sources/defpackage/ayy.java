package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayy extends defpackage.cge implements defpackage.cxe, defpackage.cwn {
    public static final defpackage.ayw a = new defpackage.ayw();
    public defpackage.ayz b;
    public defpackage.apn c;
    public defpackage.kwv d;

    public ayy(defpackage.ayz ayzVar, defpackage.kwv kwvVar, defpackage.apn apnVar) {
        this.b = ayzVar;
        this.d = kwvVar;
        this.c = apnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r4.c == defpackage.apn.a) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r4.c == defpackage.apn.b) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ayu r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L6
            goto L26
        L6:
            r0 = 6
            if (r6 == r0) goto L26
            r0 = 3
            if (r6 != r0) goto Ld
            goto L1f
        Ld:
            r0 = 4
            if (r6 == r0) goto L1f
            if (r6 != r2) goto L13
            goto L2d
        L13:
            r0 = 2
            if (r6 != r0) goto L17
            goto L2d
        L17:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Lazy list does not support beyond bounds layout for the specified direction"
            r4.<init>(r5)
            throw r4
        L1f:
            apn r0 = r4.c
            apn r3 = defpackage.apn.a
            if (r0 != r3) goto L2d
            goto L2c
        L26:
            apn r0 = r4.c
            apn r3 = defpackage.apn.b
            if (r0 != r3) goto L2d
        L2c:
            return r1
        L2d:
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L40
            int r5 = r5.b
            ayz r4 = r4.b
            int r4 = r4.b()
            int r4 = r4 + (-1)
            if (r5 >= r4) goto L45
            return r2
        L40:
            int r4 = r5.a
            if (r4 <= 0) goto L45
            return r2
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayy.d(ayu, int):boolean");
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.aun(cuxVarV, 14));
    }

    public final boolean f(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = defpackage.cjv.r(this).s.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new defpackage.afas();
        }
        if (i != 4) {
            throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = defpackage.cjv.r(this).s.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new defpackage.afas();
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }
}
