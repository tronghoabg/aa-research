package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bfi {
    public final defpackage.dga a;
    public defpackage.ctc b = null;
    public defpackage.ctc c;

    public bfi(defpackage.dga dgaVar, defpackage.ctc ctcVar) {
        this.a = dgaVar;
        this.c = ctcVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    private final long e(long j) {
        defpackage.cjj cjjVarO;
        defpackage.ctc ctcVar = this.b;
        if (ctcVar == null) {
            cjjVarO = defpackage.cjj.a;
        } else {
            if (ctcVar.t()) {
                defpackage.ctc ctcVar2 = this.c;
                cjjVarO = ctcVar2 != null ? ctcVar2.o(ctcVar, true) : null;
            } else {
                cjjVarO = defpackage.cjj.a;
            }
            if (cjjVarO == null) {
                cjjVarO = defpackage.cjj.a;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = cjjVarO.b;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            fIntBitsToFloat2 = cjjVarO.d;
            if (java.lang.Float.intBitsToFloat(i) <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
            }
        }
        float fIntBitsToFloat3 = cjjVarO.c;
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) >= fIntBitsToFloat3) {
            fIntBitsToFloat3 = cjjVarO.e;
            if (java.lang.Float.intBitsToFloat(i2) <= fIntBitsToFloat3) {
                fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i2);
            }
        }
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)));
    }

    public final int a(long j, boolean z) {
        if (z) {
            j = e(j);
        }
        return this.a.j(b(j));
    }

    public final long b(long j) {
        defpackage.ctc ctcVar;
        defpackage.ctc ctcVar2 = this.b;
        if (ctcVar2 != null) {
            if (true != ctcVar2.t()) {
                ctcVar2 = null;
            }
            if (ctcVar2 != null && (ctcVar = this.c) != null) {
                defpackage.ctc ctcVar3 = true == ctcVar.t() ? ctcVar : null;
                if (ctcVar3 != null) {
                    return ctcVar2.i(ctcVar3, j);
                }
            }
        }
        return j;
    }

    public final long c(long j) {
        defpackage.ctc ctcVar;
        defpackage.ctc ctcVar2 = this.b;
        if (ctcVar2 != null) {
            if (true != ctcVar2.t()) {
                ctcVar2 = null;
            }
            if (ctcVar2 != null && (ctcVar = this.c) != null) {
                defpackage.ctc ctcVar3 = true == ctcVar.t() ? ctcVar : null;
                if (ctcVar3 != null) {
                    return ctcVar3.i(ctcVar2, j);
                }
            }
        }
        return j;
    }

    public final boolean d(long j) {
        long jB = b(e(j));
        defpackage.dga dgaVar = this.a;
        int iH = dgaVar.h(java.lang.Float.intBitsToFloat((int) (4294967295L & jB)));
        int i = (int) (jB >> 32);
        return java.lang.Float.intBitsToFloat(i) >= dgaVar.b(iH) && java.lang.Float.intBitsToFloat(i) <= dgaVar.c(iH);
    }
}
