package defpackage;

/* loaded from: classes.dex */
public final class cwq extends cyc {
    private static final cjk h;
    public final cyx f;
    public cxl g;

    static {
        cjk cjkVar = new cjk();
        cjkVar.j(-281474976710656L);
        cjkVar.q(1.0f);
        cjkVar.r(1);
        h = cjkVar;
    }

    public cwq(cxb cxbVar) {
        super(cxbVar);
        cyx cyxVar = new cyx();
        this.f = cyxVar;
        cyxVar.w = this;
        this.g = cxbVar.j != null ? new cwp(this) : null;
    }

    private final void G() {
        if (this.l) {
            return;
        }
        this.t.o().B();
    }

    @Override // defpackage.cyc
    public final /* synthetic */ cfx B() {
        return this.f;
    }

    @Override // defpackage.cyc
    public final cxl C() {
        return this.g;
    }

    @Override // defpackage.cyc
    public final void D() {
        if (this.g == null) {
            this.g = new cwp(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.cyb r12, long r13, defpackage.cwo r15, int r16, boolean r17) {
        /*
            r11 = this;
            cxb r0 = r11.t
            boolean r1 = r12.e(r0)
            r5 = 0
            if (r1 == 0) goto L35
            boolean r1 = r11.az(r13)
            r6 = 1
            if (r1 == 0) goto L16
            r5 = r16
            r11 = r6
        L13:
            r6 = r17
            goto L3b
        L16:
            r1 = r16
            if (r1 != r6) goto L37
            long r7 = r11.Z()
            float r11 = r11.X(r13, r7)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r11 = r6
            r6 = r5
            r5 = r11
            goto L3b
        L32:
            r11 = r5
            r5 = r6
            goto L13
        L35:
            r1 = r16
        L37:
            r6 = r17
            r11 = r5
            r5 = r1
        L3b:
            if (r11 == 0) goto L86
            int r11 = r15.a
            byw r0 = r0.j()
            java.lang.Object[] r7 = r0.a
            int r0 = r0.b
            int r0 = r0 + (-1)
            r8 = r0
        L4a:
            if (r8 < 0) goto L84
            r0 = r7[r8]
            r1 = r0
            cxb r1 = (defpackage.cxb) r1
            boolean r0 = r1.an()
            if (r0 == 0) goto L81
            r0 = r12
            r2 = r13
            r4 = r15
            r0.b(r1, r2, r4, r5, r6)
            long r2 = r15.b()
            r9 = 32
            long r9 = r2 >> r9
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L81
            boolean r9 = defpackage.cwi.c(r2)
            if (r9 == 0) goto L81
            boolean r2 = defpackage.cwi.b(r2)
            if (r2 != 0) goto L81
            boolean r1 = r12.c(r15, r1)
            if (r1 == 0) goto L84
        L81:
            int r8 = r8 + (-1)
            goto L4a
        L84:
            r15.a = r11
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwq.E(cyb, long, cwo, int, boolean):void");
    }

    @Override // defpackage.cyc
    public final void F(cju cjuVar, cmi cmiVar) throws Throwable {
        cxb cxbVar = this.t;
        cym cymVarA = cxe.a(cxbVar);
        byw bywVarJ = cxbVar.j();
        Object[] objArr = bywVarJ.a;
        int i = bywVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar2 = (cxb) objArr[i2];
            if (cxbVar2.an()) {
                cxbVar2.C(cjuVar, cmiVar);
            }
        }
        if (cymVarA.F()) {
            aA(cjuVar, h);
        }
    }

    @Override // defpackage.csp
    public final int c(int i) {
        sx sxVarAz = this.t.az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.a(cxbVar.q(), cxbVar.u(), i);
    }

    @Override // defpackage.csp
    public final int d(int i) {
        sx sxVarAz = this.t.az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.b(cxbVar.q(), cxbVar.u(), i);
    }

    @Override // defpackage.csp
    public final int e(int i) {
        sx sxVarAz = this.t.az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.c(cxbVar.q(), cxbVar.u(), i);
    }

    @Override // defpackage.cyc, defpackage.cuo
    public final void ev(long j, float f, afec afecVar) {
        super.ev(j, f, afecVar);
        G();
    }

    @Override // defpackage.csp
    public final int f(int i) {
        sx sxVarAz = this.t.az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.d(cxbVar.q(), cxbVar.u(), i);
    }

    @Override // defpackage.cxk
    public final int r(crw crwVar) {
        cxl cxlVar = this.g;
        if (cxlVar != null) {
            return cxlVar.r(crwVar);
        }
        cxq cxqVar = (cxq) ae();
        if (!cxqVar.l) {
            if (cxqVar.F() == 1) {
                cvv cvvVar = cxqVar.w;
                cvvVar.f = true;
                if (cvvVar.b) {
                    cxqVar.s();
                }
            } else {
                cxqVar.w.g = true;
            }
        }
        cyc cycVarK = cxqVar.k();
        boolean z = cycVarK.m;
        cycVarK.m = true;
        cxqVar.m();
        cycVarK.m = z;
        Integer num = (Integer) cxqVar.w.h.get(crwVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.cto
    public final cuo v(long j) {
        if (this.v) {
            cxl cxlVar = this.g;
            cxlVar.getClass();
            j = cxlVar.d;
        }
        A(j);
        cxb cxbVar = this.t;
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cxb) objArr[i2]).o().G = 3;
        }
        av(cxbVar.q.e(this, cxbVar.u(), j));
        an();
        return this;
    }

    @Override // defpackage.cyc, defpackage.cuo
    public final void y(long j, float f, cmi cmiVar) {
        super.y(j, f, cmiVar);
        G();
    }
}
