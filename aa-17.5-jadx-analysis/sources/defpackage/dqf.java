package defpackage;

/* loaded from: classes2.dex */
public final class dqf extends dpv {
    public String aA;
    public int aB;
    private dqj aC;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public int at;
    public int au;
    public float av;
    public float aw;
    public String ax;
    public String ay;
    public String az;

    public dqf(dpz dpzVar, int i) {
        super(dpzVar, i);
        this.ao = 0;
        this.ap = 0;
        this.aq = 0;
        this.ar = 0;
        if (i == 10) {
            this.at = 1;
        } else if (i == 11) {
            this.au = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // defpackage.dpv, defpackage.dpp, defpackage.dpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            r5.x()
            dqj r0 = r5.aC
            int r1 = r5.as
            if (r1 == 0) goto Le
            r2 = 1
            if (r1 == r2) goto Ld
            goto L14
        Ld:
            r1 = r2
        Le:
            int r2 = r0.i
            if (r2 == r1) goto L14
            r0.i = r1
        L14:
            int r1 = r5.at
            if (r1 == 0) goto L1b
            r0.d(r1)
        L1b:
            int r0 = r5.au
            if (r0 == 0) goto L24
            dqj r1 = r5.aC
            r1.c(r0)
        L24:
            float r0 = r5.av
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L3a
            dqj r2 = r5.aC
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L3a
        L32:
            float r3 = r2.c
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L3a
            r2.c = r0
        L3a:
            float r0 = r5.aw
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L4f
            dqj r2 = r5.aC
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L47
            goto L4f
        L47:
            float r1 = r2.d
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L4f
            r2.d = r0
        L4f:
            java.lang.String r0 = r5.ax
            if (r0 == 0) goto L67
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L67
            dqj r1 = r5.aC
            java.lang.String r2 = r1.e
            if (r2 == 0) goto L65
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L67
        L65:
            r1.e = r0
        L67:
            java.lang.String r0 = r5.ay
            if (r0 == 0) goto L7f
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L7f
            dqj r1 = r5.aC
            java.lang.String r2 = r1.f
            if (r2 == 0) goto L7d
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7f
        L7d:
            r1.f = r0
        L7f:
            java.lang.String r0 = r5.az
            r1 = 0
            if (r0 == 0) goto La2
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto La2
            dqj r2 = r5.aC
            java.lang.String r3 = r2.g
            if (r3 == 0) goto L9a
            java.lang.String r4 = r0.toString()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
        L9a:
            r2.b = r1
            java.lang.String r0 = r0.toString()
            r2.g = r0
        La2:
            java.lang.String r0 = r5.aA
            if (r0 == 0) goto Lbc
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lbc
            dqj r2 = r5.aC
            java.lang.String r3 = r2.h
            if (r3 == 0) goto Lb8
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbc
        Lb8:
            r2.b = r1
            r2.h = r0
        Lbc:
            dqj r0 = r5.aC
            int r1 = r5.aB
            r0.k = r1
            int r1 = r5.ao
            r0.aj(r1)
            dqj r0 = r5.aC
            int r1 = r5.ap
            r0.aQ = r1
            int r1 = r5.aq
            r0.aN = r1
            int r1 = r5.ar
            r0.aO = r1
            r5.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqf.e():void");
    }

    @Override // defpackage.dpv
    public final dqs x() {
        dqj dqjVar = this.aC;
        if (dqjVar != null) {
            return dqjVar;
        }
        dqj dqjVar2 = new dqj();
        this.aC = dqjVar2;
        return dqjVar2;
    }
}
