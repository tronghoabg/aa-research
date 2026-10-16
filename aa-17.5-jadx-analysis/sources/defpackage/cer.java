package defpackage;

/* loaded from: classes.dex */
public final class cer {
    public final afec a;
    public Object b;
    public int c = -1;
    public final bvl d;
    public boolean e;
    public int f;
    public aae g;
    public final aap h;
    public final aan i;
    public final aan j;
    private byw k;
    private aan l;
    private aan m;
    private aap n;
    private aan o;
    private aan p;

    public cer(afec afecVar) {
        this.a = afecVar;
        aap aapVar = this.n;
        if (aapVar == null) {
            aapVar = new aap(6);
            this.n = aapVar;
        }
        this.h = aapVar;
        this.d = new ceq(this, 0);
        aan aanVar = this.o;
        if (aanVar == null) {
            long[] jArr = aao.a;
            aanVar = new aan(6);
            this.o = aanVar;
        }
        this.i = aanVar;
        aan aanVar2 = this.p;
        if (aanVar2 == null) {
            aanVar2 = new aan(6);
            this.p = aanVar2;
        }
        this.j = aanVar2;
    }

    public final byw a() {
        byw bywVar = this.k;
        if (bywVar != null) {
            return bywVar;
        }
        byw bywVar2 = new byw(new bvk[16]);
        this.k = bywVar2;
        return bywVar2;
    }

    public final void b(Object obj, Object obj2) {
        bza.c(e(), obj2, obj);
        if (!(obj2 instanceof bvk) || aan.f(e(), obj2)) {
            return;
        }
        bza.b(this.i, obj2);
        this.j.i(obj2);
    }

    public final boolean c() {
        return d().e();
    }

    public final aan d() {
        aan aanVar = this.m;
        if (aanVar != null) {
            return aanVar;
        }
        aan aanVar2 = new aan(6);
        this.m = aanVar2;
        return aanVar2;
    }

    public final aan e() {
        aan aanVar = this.l;
        if (aanVar != null) {
            return aanVar;
        }
        long[] jArr = aao.a;
        aan aanVar2 = new aan(6);
        this.l = aanVar2;
        return aanVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.aae r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r0.f
            if (r3 <= 0) goto Lc
            goto L93
        Lc:
            r3 = r24
            int r3 = r3.h(r1, r2)
            boolean r4 = r1 instanceof defpackage.bvk
            r5 = 2
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L7d
            r2 = r1
            bvk r2 = (defpackage.bvk) r2
            bvj r2 = r2.e()
            aan r4 = r0.j
            java.lang.Object r6 = r2.e
            r4.m(r1, r6)
            aae r2 = r2.d
            aan r4 = r0.i
            defpackage.bza.b(r4, r1)
            java.lang.Object[] r6 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L38:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            r13 = 0
        L4c:
            int r14 = r12 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L72
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            cev r14 = (defpackage.cev) r14
            boolean r8 = r14 instanceof defpackage.cew
            if (r8 == 0) goto L6f
            r8 = r14
            cew r8 = (defpackage.cew) r8
            r8.i(r5)
        L6f:
            defpackage.bza.a(r4, r14, r1)
        L72:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L4c
        L76:
            if (r14 != r15) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L38
        L7d:
            r2 = -1
            if (r3 != r2) goto L93
            boolean r2 = r1 instanceof defpackage.cew
            if (r2 == 0) goto L8a
            r2 = r1
            cew r2 = (defpackage.cew) r2
            r2.i(r5)
        L8a:
            aan r0 = r0.e()
            r2 = r23
            defpackage.bza.a(r0, r1, r2)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cer.f(java.lang.Object, int, java.lang.Object, aae):void");
    }
}
