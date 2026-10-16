package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bia implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ bia(defpackage.dkd dkdVar, defpackage.bie bieVar, defpackage.djl djlVar, defpackage.affc affcVar, defpackage.affc affcVar2, int i) {
        this.f = i;
        this.a = dkdVar;
        this.b = bieVar;
        this.c = djlVar;
        this.d = affcVar;
        this.e = affcVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, yjm] */
    /* JADX WARN: Type inference failed for: r2v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [djv, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.ckc ckcVar;
        ?? r3;
        java.lang.Object obj2;
        int i = this.f;
        if (i == 0) {
            java.lang.Object obj3 = this.a;
            defpackage.bis bisVar = (defpackage.bis) obj;
            defpackage.bin binVar = ((defpackage.bip) this.b).b;
            bisVar.g = (defpackage.dkd) obj3;
            bisVar.h = (defpackage.djl) this.c;
            bisVar.b = this.d;
            bisVar.c = this.e;
            bisVar.d = binVar != null ? binVar.b : null;
            bisVar.e = binVar != null ? binVar.c : null;
            bisVar.f = binVar != null ? (defpackage.dck) defpackage.cjv.y(binVar, defpackage.dbl.n) : null;
            return defpackage.afbk.a;
        }
        if (i != 1) {
            java.util.Iterator it = this.c.c(this.b).iterator();
            while (true) {
                r3 = this.a;
                obj2 = this.e;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                next.getClass();
                int iIntValue = ((java.lang.Number) next).intValue();
                ((boolean[]) obj2)[iIntValue] = true;
                r3.set(iIntValue, obj);
            }
            for (boolean z : (boolean[]) obj2) {
                if (!z) {
                    return defpackage.afbk.a;
                }
            }
            this.d.invoke(r3);
            return defpackage.afbk.a;
        }
        defpackage.cxn cxnVar = (defpackage.cxn) obj;
        cxnVar.q();
        float fE = ((defpackage.byh) ((defpackage.jlj) this.c).b).e();
        if (fE != 0.0f) {
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.e;
            ?? r9 = this.d;
            long j = defpackage.dgc.a;
            int iA = r9.a((int) (((defpackage.dkd) obj5).b >> 32));
            defpackage.bfi bfiVarE = ((defpackage.beg) obj4).e();
            defpackage.cjj cjjVarM = bfiVarE != null ? bfiVarE.a.m(iA) : new defpackage.cjj(0.0f, 0.0f, 0.0f, 0.0f);
            float fFloor = (float) java.lang.Math.floor(cxnVar.dI(2.0f));
            if (fFloor < 1.0f) {
                fFloor = 1.0f;
            }
            float f = fFloor / 2.0f;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)) - f;
            float f2 = cjjVarM.b + f;
            if (f2 <= fIntBitsToFloat) {
                fIntBitsToFloat = f2;
            }
            if (fIntBitsToFloat >= f) {
                f = fIntBitsToFloat;
            }
            double d = f;
            float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) java.lang.Math.floor(d)) + 0.5f : (float) java.lang.Math.rint(d);
            java.lang.Object obj6 = this.a;
            float f3 = cjjVarM.c;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fFloor2);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
            long j2 = jFloatToRawIntBits << 32;
            float f4 = cjjVarM.e;
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fFloor2);
            long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f4);
            long j3 = jFloatToRawIntBits3 << 32;
            defpackage.cmj cmjVar = cxnVar.a;
            defpackage.ckc ckcVar2 = cmjVar.a.c;
            defpackage.cjs cjsVarQ = cmjVar.q();
            if (obj6 != null) {
                ckcVar = ckcVar2;
                ((defpackage.cka) obj6).a(cmjVar.b.a(), cjsVarQ, fE);
            } else {
                ckcVar = ckcVar2;
                if (cjsVarQ.a() != fE) {
                    cjsVarQ.h(fE);
                }
            }
            if (!defpackage.afga.f(cjsVarQ.d, null)) {
                cjsVarQ.k(null);
            }
            if (cjsVarQ.b != 3) {
                cjsVarQ.i(3);
            }
            if (cjsVarQ.c() != fFloor) {
                cjsVarQ.q(fFloor);
            }
            if (cjsVarQ.b() != 4.0f) {
                cjsVarQ.p(4.0f);
            }
            if (cjsVarQ.e() != 0) {
                cjsVarQ.n(0);
            }
            if (cjsVarQ.f() != 0) {
                cjsVarQ.o(0);
            }
            if (cjsVarQ.d() != 1) {
                cjsVarQ.l(1);
            }
            ckcVar.k((jFloatToRawIntBits2 & 4294967295L) | j2, j3 | (jFloatToRawIntBits4 & 4294967295L), cjsVarQ);
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bia(defpackage.eqp eqpVar, defpackage.yjm yjmVar, boolean[] zArr, java.util.List list, defpackage.affc affcVar, int i) {
        this.f = i;
        this.b = eqpVar;
        this.c = yjmVar;
        this.e = zArr;
        this.a = list;
        this.d = affcVar;
    }

    public /* synthetic */ bia(defpackage.jlj jljVar, defpackage.djv djvVar, defpackage.dkd dkdVar, defpackage.beg begVar, defpackage.cka ckaVar, int i) {
        this.f = i;
        this.c = jljVar;
        this.d = djvVar;
        this.e = dkdVar;
        this.b = begVar;
        this.a = ckaVar;
    }
}
