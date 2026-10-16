package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bab implements defpackage.affc {
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bab(float f, afgs afgsVar, defpackage.azz azzVar, int i) {
        this.d = i;
        this.a = f;
        this.b = afgsVar;
        this.c = azzVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d1  */
    /* JADX WARN: Type inference failed for: r0v4, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [azz, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        long j;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        char c;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        int i = this.d;
        float fFloatValue = 0.0f;
        if (i == 0) {
            defpackage.aei aeiVar = (defpackage.aei) obj;
            float f = this.a;
            if (f > 0.0f) {
                fFloatValue = ((java.lang.Number) aeiVar.a()).floatValue();
                if (fFloatValue > f) {
                    fFloatValue = f;
                }
            } else if (f < 0.0f) {
                fFloatValue = ((java.lang.Number) aeiVar.a()).floatValue();
                if (fFloatValue < f) {
                    fFloatValue = f;
                }
            }
            ?? r3 = this.c;
            afgs afgsVar = (afgs) this.b;
            float f2 = fFloatValue - afgsVar.a;
            if (f2 != r3.a(f2) || fFloatValue != ((java.lang.Number) aeiVar.a()).floatValue()) {
                aeiVar.b();
            }
            afgsVar.a += f2;
            return defpackage.afbk.a;
        }
        if (i == 1) {
            long jLongValue = ((java.lang.Long) obj).longValue();
            defpackage.ark arkVar = (defpackage.ark) this.c;
            long j2 = arkVar.c;
            if (j2 == Long.MIN_VALUE) {
                arkVar.c = jLongValue;
                j2 = jLongValue;
            }
            float f3 = this.a;
            float f4 = arkVar.e;
            defpackage.ael aelVar = new defpackage.ael(f4);
            long jA = f3 == 0.0f ? arkVar.b.a(new defpackage.ael(f4), defpackage.ark.a, arkVar.d) : defpackage.afhi.m((jLongValue - j2) / f3);
            ?? r0 = this.b;
            defpackage.agu aguVar = arkVar.b;
            defpackage.ael aelVar2 = defpackage.ark.a;
            float f5 = ((defpackage.ael) aguVar.c(jA, aelVar, aelVar2, arkVar.d)).a;
            arkVar.d = (defpackage.ael) aguVar.d(jA, aelVar, aelVar2, arkVar.d);
            arkVar.c = jLongValue;
            float f6 = arkVar.e - f5;
            arkVar.e = f5;
            r0.invoke(java.lang.Float.valueOf(f6));
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.cxn cxnVar = (defpackage.cxn) obj;
            cxnVar.q();
            defpackage.cmi cmiVarR = cxnVar.r();
            long jA2 = cmiVarR.a();
            cmiVarR.b().g();
            float f7 = this.a;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            try {
                defpackage.izq izqVar = cmiVarR.c;
                izqVar.l(f7, 0.0f);
                izqVar.j(45.0f, 0L);
                defpackage.dai.W(cxnVar, (defpackage.cjr) obj2, 0L, 0.0f, (defpackage.cke) obj3, 0, 46);
                return defpackage.afbk.a;
            } finally {
                cmiVarR.b().e();
                cmiVarR.h(jA2);
            }
        }
        defpackage.cml cmlVar = (defpackage.cml) obj;
        cmlVar.getClass();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32));
        long jO = cmlVar.o() & 4294967295L;
        float f8 = this.a;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) jO);
        float fDI = cmlVar.dI(f8);
        defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
        cjuVar.q(new defpackage.cjj(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2));
        defpackage.cju cjuVar2 = new defpackage.cju((byte[]) null);
        defpackage.cjj cjjVar = (defpackage.cjj) this.c;
        defpackage.cjj cjjVar2 = new defpackage.cjj(cjjVar.b, cjjVar.c, fIntBitsToFloat - cjjVar.d, fIntBitsToFloat2 - cjjVar.e);
        java.util.EnumSet enumSet = (java.util.EnumSet) this.b;
        if (enumSet.contains(defpackage.msm.a)) {
            j = 4294967295L;
            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fDI)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32);
        } else {
            j = 4294967295L;
            jFloatToRawIntBits = 0;
        }
        if (enumSet.contains(defpackage.msm.b)) {
            jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDI)) & j);
        } else {
            jFloatToRawIntBits2 = 0;
        }
        if (enumSet.contains(defpackage.msm.d)) {
            c = ' ';
            jFloatToRawIntBits3 = (((long) java.lang.Float.floatToRawIntBits(fDI)) & j) | (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32);
        } else {
            c = ' ';
            jFloatToRawIntBits3 = 0;
        }
        if (enumSet.contains(defpackage.msm.c)) {
            jFloatToRawIntBits4 = (((long) java.lang.Float.floatToRawIntBits(fDI)) << c) | (((long) java.lang.Float.floatToRawIntBits(fDI)) & j);
        } else {
            jFloatToRawIntBits4 = 0;
        }
        cjuVar2.r(defpackage.bzo.z(cjjVar2, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, jFloatToRawIntBits4));
        defpackage.cju cjuVar3 = new defpackage.cju((byte[]) null);
        cjuVar3.o(cjuVar, cjuVar2, 0);
        defpackage.dai.aH(cmlVar, cjuVar3, -72057594037927936L, defpackage.cmn.a, 52);
        return defpackage.afbk.a;
    }

    public /* synthetic */ bab(float f, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.d = i;
        this.a = f;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ bab(defpackage.ark arkVar, float f, defpackage.affc affcVar, int i) {
        this.d = i;
        this.c = arkVar;
        this.a = f;
        this.b = affcVar;
    }
}
