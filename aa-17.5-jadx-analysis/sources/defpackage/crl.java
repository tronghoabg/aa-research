package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class crl implements dlg, afck {
    public aitf a;
    final /* synthetic */ crm b;
    private final /* synthetic */ crm c;
    private final afck d;
    private cqm e = cqm.b;
    private final afco f = afcp.a;

    public crl(crm crmVar, afck afckVar) {
        this.b = crmVar;
        this.c = crmVar;
        this.d = afckVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.c.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.c.b();
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return f * this.c.a();
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return dlf.l(this.c, f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return dlf.m(this.c, j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return dlf.n(this.c, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return dln.d(this.c, f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        crm crmVar = this.c;
        return dln.d(crmVar, (f / crmVar.a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return dln.c(this.c, j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return (f / this.c.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return (i / this.c.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return dlf.k(this.c, j);
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.f;
    }

    public final long n() {
        crm crmVar = this.b;
        long jN = dlf.n(crmVar, crmVar.n().g());
        long j = crmVar.g;
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jN >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jN & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final long o() {
        return this.b.g;
    }

    public final cql p() {
        return this.b.d;
    }

    public final dcc q() {
        return this.b.n();
    }

    public final Object r(cqm cqmVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        this.e = cqmVar;
        this.a = aitgVar;
        return aitgVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [crl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aivh] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aivh] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(long r11, defpackage.afeg r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.crj
            if (r0 == 0) goto L13
            r0 = r14
            crj r0 = (defpackage.crj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            crj r0 = new crj
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r10 = r0.a
            defpackage.woy.dF(r14)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r0 = move-exception
            r11 = r0
            goto L74
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.woy.dF(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4d
            aitf r14 = r10.a
            if (r14 == 0) goto L4d
            cqn r2 = new cqn
            r2.<init>(r11)
            java.lang.Object r2 = defpackage.woy.dE(r2)
            r14.w(r2)
        L4d:
            crm r14 = r10.b
            aitx r14 = r14.N()
            dmd r4 = new dmd
            r8 = 0
            r9 = 1
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r10 = 3
            r11 = 0
            r12 = 0
            aivh r10 = defpackage.ahnc.d(r14, r11, r12, r4, r10)
            r0.a = r10     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r14 = r13.invoke(r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r14 == r1) goto L73
        L6d:
            cqc r11 = defpackage.cqc.a
            r10.s(r11)
            return r14
        L73:
            return r1
        L74:
            cqc r12 = defpackage.cqc.a
            r10.s(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crl.s(long, afeg, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r5, defpackage.afeg r7, defpackage.afck r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.crk
            if (r0 == 0) goto L13
            r0 = r8
            crk r0 = (defpackage.crk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crk r0 = new crk
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r8)     // Catch: defpackage.cqn -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r8)
            r0.c = r3     // Catch: defpackage.cqn -> L3c
            java.lang.Object r4 = r4.s(r5, r7, r0)     // Catch: defpackage.cqn -> L3c
            if (r4 != r1) goto L3b
            return r1
        L3b:
            return r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crl.t(long, afeg, afck):java.lang.Object");
    }

    public final void v(cql cqlVar, cqm cqmVar) {
        aitf aitfVar;
        if (cqmVar != this.e || (aitfVar = this.a) == null) {
            return;
        }
        this.a = null;
        aitfVar.w(cqlVar);
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        crm crmVar = this.b;
        synchronized (crmVar.f) {
            crmVar.e.m(this);
        }
        this.d.w(obj);
    }
}
