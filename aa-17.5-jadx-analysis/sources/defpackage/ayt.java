package defpackage;

/* loaded from: classes.dex */
public final class ayt extends cfx implements cwu, cwd {
    public static final ayr a = new ayr();
    public ayu b;
    public api c;
    public kwp d;

    public ayt(ayu ayuVar, kwp kwpVar, api apiVar) {
        this.b = ayuVar;
        this.d = kwpVar;
        this.c = apiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r4.c == defpackage.api.a) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r4.c == defpackage.api.b) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ayp r5, int r6) {
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
            api r0 = r4.c
            api r3 = defpackage.api.a
            if (r0 != r3) goto L2d
            goto L2c
        L26:
            api r0 = r4.c
            api r3 = defpackage.api.b
            if (r0 != r3) goto L2d
        L2c:
            return r1
        L2d:
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L40
            int r5 = r5.b
            ayu r4 = r4.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayt.d(ayp, int):boolean");
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new aui(cuoVarV, 14));
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
            int iOrdinal = bzi.q(this).s.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new aezs();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = bzi.q(this).s.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new aezs();
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }
}
