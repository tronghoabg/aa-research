package defpackage;

/* loaded from: classes.dex */
public final class cwx extends cyc {
    private static final cjk K;
    private csc J;
    public cwu f;
    public dle g;
    public cxl h;

    static {
        cjk cjkVar = new cjk();
        cjkVar.j(-72056498821267456L);
        cjkVar.q(1.0f);
        cjkVar.r(1);
        K = cjkVar;
    }

    public cwx(cxb cxbVar, cwu cwuVar) {
        super(cxbVar);
        this.f = cwuVar;
        this.h = cxbVar.j != null ? new cwv(this) : null;
        this.J = (cwuVar.M().r & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? new csc(this, (csa) cwuVar) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aD() {
        /*
            r8 = this;
            boolean r0 = r8.l
            if (r0 == 0) goto L5
            return
        L5:
            r8.ao()
            cyc r0 = r8.G()
            csc r1 = r8.J
            r2 = 0
            if (r1 == 0) goto L57
            csa r3 = r1.b
            cxl r4 = r8.h
            r4.getClass()
            boolean r3 = r3.d()
            if (r3 != 0) goto L54
            boolean r1 = r1.c
            if (r1 != 0) goto L54
            long r3 = r8.c
            cxl r1 = r8.h
            r5 = 0
            if (r1 == 0) goto L33
            long r6 = r1.t()
            dlq r1 = new dlq
            r1.<init>(r6)
            goto L34
        L33:
            r1 = r5
        L34:
            boolean r1 = defpackage.dlq.d(r3, r1)
            if (r1 == 0) goto L54
            long r3 = r0.c
            cxl r1 = r0.C()
            if (r1 == 0) goto L4c
            long r5 = r1.t()
            dlq r1 = new dlq
            r1.<init>(r5)
            r5 = r1
        L4c:
            boolean r1 = defpackage.dlq.d(r3, r5)
            if (r1 == 0) goto L54
            r1 = 1
            goto L55
        L54:
            r1 = r2
        L55:
            r0.u = r1
        L57:
            boolean r1 = r0.m
            boolean r3 = r8.m
            r0.m = r3
            ctq r8 = r8.K()
            r8.h()
            r0.m = r1
            r0.u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwx.aD():void");
    }

    @Override // defpackage.cyc
    public final cfx B() {
        return this.f.M();
    }

    @Override // defpackage.cyc
    public final cxl C() {
        return this.h;
    }

    @Override // defpackage.cyc
    public final void D() {
        if (this.h == null) {
            this.h = new cwv(this);
        }
    }

    @Override // defpackage.cyc
    public final void F(cju cjuVar, cmi cmiVar) {
        cyc cycVar;
        G().ah(cjuVar, cmiVar);
        if (!cxe.a(this.t).F() || (cycVar = this.w) == null) {
            return;
        }
        if (this.c == cycVar.c && cycVar.y == 0) {
            return;
        }
        aA(cjuVar, K);
    }

    public final cyc G() {
        cyc cycVar = this.w;
        cycVar.getClass();
        return cycVar;
    }

    public final void H(cwu cwuVar) {
        if (!affa.f(cwuVar, this.f)) {
            if ((cwuVar.M().r & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                csa csaVar = (csa) cwuVar;
                csc cscVar = this.J;
                if (cscVar != null) {
                    cscVar.b = csaVar;
                } else {
                    cscVar = new csc(this, csaVar);
                }
                this.J = cscVar;
            } else {
                this.J = null;
            }
        }
        this.f = cwuVar;
    }

    @Override // defpackage.csp
    public final int c(int i) {
        csc cscVar = this.J;
        if (cscVar == null) {
            return this.f.h(this, G(), i);
        }
        csa csaVar = cscVar.b;
        G();
        return csaVar.e();
    }

    @Override // defpackage.csp
    public final int d(int i) {
        csc cscVar = this.J;
        if (cscVar == null) {
            return this.f.i(this, G(), i);
        }
        csa csaVar = cscVar.b;
        G();
        return csaVar.f();
    }

    @Override // defpackage.csp
    public final int e(int i) {
        csc cscVar = this.J;
        if (cscVar == null) {
            return this.f.j(this, G(), i);
        }
        csa csaVar = cscVar.b;
        G();
        return csaVar.g();
    }

    @Override // defpackage.cyc, defpackage.cuo
    public final void ev(long j, float f, afec afecVar) {
        super.ev(j, f, afecVar);
        aD();
    }

    @Override // defpackage.csp
    public final int f(int i) {
        csc cscVar = this.J;
        if (cscVar == null) {
            return this.f.k(this, G(), i);
        }
        csa csaVar = cscVar.b;
        G();
        return csaVar.l();
    }

    @Override // defpackage.cxk
    public final int r(crw crwVar) {
        cxl cxlVar = this.h;
        return cxlVar != null ? cxlVar.q.b(crwVar, Integer.MIN_VALUE) : tv.b(this, crwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.cto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cuo v(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.v
            if (r0 == 0) goto L13
            dle r9 = r8.g
            if (r9 == 0) goto Lb
            long r9 = r9.a
            goto L13
        Lb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            r8.<init>(r9)
            throw r8
        L13:
            r8.A(r9)
            csc r0 = r8.J
            if (r0 == 0) goto La2
            cwx r1 = r0.a
            csa r2 = r0.b
            cxl r1 = r1.h
            r1.getClass()
            ctq r1 = r1.K()
            r1.c()
            r1.b()
            boolean r1 = r2.c()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L40
            dle r1 = r8.g
            boolean r1 = defpackage.dle.f(r9, r1)
            if (r1 != 0) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = r4
        L41:
            r0.c = r1
            if (r1 != 0) goto L4b
            cyc r1 = r8.G()
            r1.v = r4
        L4b:
            r8.G()
            ctq r1 = r2.a()
            cyc r2 = r8.G()
            r2.v = r3
            int r2 = r1.c()
            cxl r5 = r8.h
            r5.getClass()
            int r5 = r5.a
            if (r2 != r5) goto L73
            int r2 = r1.b()
            cxl r5 = r8.h
            r5.getClass()
            int r5 = r5.b
            if (r2 != r5) goto L73
            r3 = r4
        L73:
            boolean r0 = r0.c
            if (r0 != 0) goto La0
            cyc r0 = r8.G()
            long r4 = r0.c
            cyc r0 = r8.G()
            cxl r0 = r0.C()
            if (r0 == 0) goto L91
            long r6 = r0.t()
            dlq r0 = new dlq
            r0.<init>(r6)
            goto L92
        L91:
            r0 = 0
        L92:
            boolean r0 = defpackage.dlq.d(r4, r0)
            if (r0 == 0) goto La0
            if (r3 != 0) goto La0
            cww r0 = new cww
            r0.<init>(r1, r8)
            r1 = r0
        La0:
            if (r1 != 0) goto Lac
        La2:
            cwu r0 = r8.f
            cyc r1 = r8.G()
            ctq r1 = r0.el(r8, r1, r9)
        Lac:
            r8.av(r1)
            r8.an()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwx.v(long):cuo");
    }

    @Override // defpackage.cyc, defpackage.cuo
    public final void y(long j, float f, cmi cmiVar) {
        super.y(j, f, cmiVar);
        aD();
    }
}
