package k2;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3148e implements F, InterfaceC3143E {

    /* renamed from: a, reason: collision with root package name */
    public final F f39061a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3143E f39062b;

    /* renamed from: c, reason: collision with root package name */
    public C3147d[] f39063c = new C3147d[0];

    /* renamed from: d, reason: collision with root package name */
    public long f39064d;

    /* renamed from: e, reason: collision with root package name */
    public long f39065e;

    /* renamed from: f, reason: collision with root package name */
    public long f39066f;

    /* renamed from: g, reason: collision with root package name */
    public C3150g f39067g;

    public C3148e(F f10, boolean z2, long j8, long j10) {
        this.f39061a = f10;
        this.f39064d = z2 ? j8 : -9223372036854775807L;
        this.f39065e = j8;
        this.f39066f = j10;
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        InterfaceC3143E interfaceC3143E = this.f39062b;
        interfaceC3143E.getClass();
        interfaceC3143E.a(this);
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        long j10 = this.f39065e;
        if (j8 == j10) {
            return j10;
        }
        long j11 = Q1.x.j(a0Var.f12020a, 0L, j8 - j10);
        long j12 = this.f39066f;
        long j13 = Q1.x.j(a0Var.f12021b, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j8);
        if (j11 != a0Var.f12020a || j13 != a0Var.f12021b) {
            a0Var = new U1.a0(j11, j13);
        }
        return this.f39061a.b(j8, a0Var);
    }

    @Override // k2.f0
    public final long c() {
        long jC = this.f39061a.c();
        if (jC != Long.MIN_VALUE) {
            long j8 = this.f39066f;
            if (j8 == Long.MIN_VALUE || jC < j8) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // k2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f39064d = r0
            k2.d[] r0 = r5.f39063c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f39059b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            k2.F r0 = r5.f39061a
            long r0 = r0.d(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f39065e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f39066f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            Q1.k.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3148e.d(long):long");
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f39061a.e();
    }

    @Override // k2.F
    public final long f() {
        if (g()) {
            long j8 = this.f39064d;
            this.f39064d = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j8;
        }
        long jF2 = this.f39061a.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        Q1.k.g(jF2 >= this.f39065e);
        long j10 = this.f39066f;
        Q1.k.g(j10 == Long.MIN_VALUE || jF2 <= j10);
        return jF2;
    }

    public final boolean g() {
        return this.f39064d != -9223372036854775807L;
    }

    @Override // k2.F
    public final void h() throws C3150g {
        C3150g c3150g = this.f39067g;
        if (c3150g != null) {
            throw c3150g;
        }
        this.f39061a.h();
    }

    @Override // k2.F
    public final void i(long j8) {
        this.f39061a.i(j8);
    }

    @Override // k2.F
    public final n0 j() {
        return this.f39061a.j();
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        return this.f39061a.k(c10);
    }

    @Override // k2.InterfaceC3143E
    public final void l(F f10) {
        if (this.f39067g != null) {
            return;
        }
        InterfaceC3143E interfaceC3143E = this.f39062b;
        interfaceC3143E.getClass();
        interfaceC3143E.l(this);
    }

    @Override // k2.f0
    public final long n() {
        long jN = this.f39061a.n();
        if (jN != Long.MIN_VALUE) {
            long j8 = this.f39066f;
            if (j8 == Long.MIN_VALUE || jN < j8) {
                return jN;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f39061a.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f39062b = interfaceC3143E;
        this.f39061a.q(this, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    @Override // k2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r(n2.q[] r15, boolean[] r16, k2.d0[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r17
            int r1 = r0.length
            k2.d[] r1 = new k2.C3147d[r1]
            r14.f39063c = r1
            int r1 = r0.length
            k2.d0[] r5 = new k2.d0[r1]
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r0.length
            r9 = 0
            if (r2 >= r3) goto L21
            k2.d[] r3 = r14.f39063c
            r4 = r0[r2]
            k2.d r4 = (k2.C3147d) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            k2.d0 r9 = r4.f39058a
        L1c:
            r5[r2] = r9
            int r2 = r2 + 1
            goto Lc
        L21:
            k2.F r2 = r14.f39061a
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            long r10 = r2.r(r3, r4, r5, r6, r7)
            boolean r2 = r14.g()
            if (r2 == 0) goto L5b
            long r6 = r14.f39065e
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L5b
            r12 = 0
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 == 0) goto L5b
            int r2 = r15.length
            r4 = r1
        L42:
            if (r4 >= r2) goto L5b
            r6 = r15[r4]
            if (r6 == 0) goto L58
            N1.n r6 = r6.j()
            java.lang.String r7 = r6.f8232n
            java.lang.String r6 = r6.k
            boolean r6 = N1.C.a(r7, r6)
            if (r6 != 0) goto L58
            r2 = r10
            goto L60
        L58:
            int r4 = r4 + 1
            goto L42
        L5b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L60:
            r14.f39064d = r2
            int r15 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r15 == 0) goto L7b
            long r2 = r14.f39065e
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 < 0) goto L79
            long r2 = r14.f39066f
            r6 = -9223372036854775808
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L7b
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 > 0) goto L79
            goto L7b
        L79:
            r15 = r1
            goto L7c
        L7b:
            r15 = 1
        L7c:
            Q1.k.g(r15)
        L7f:
            int r15 = r0.length
            if (r1 >= r15) goto La5
            r15 = r5[r1]
            if (r15 != 0) goto L8b
            k2.d[] r15 = r14.f39063c
            r15[r1] = r9
            goto L9c
        L8b:
            k2.d[] r2 = r14.f39063c
            r3 = r2[r1]
            if (r3 == 0) goto L95
            k2.d0 r3 = r3.f39058a
            if (r3 == r15) goto L9c
        L95:
            k2.d r3 = new k2.d
            r3.<init>(r14, r15)
            r2[r1] = r3
        L9c:
            k2.d[] r15 = r14.f39063c
            r15 = r15[r1]
            r0[r1] = r15
            int r1 = r1 + 1
            goto L7f
        La5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3148e.r(n2.q[], boolean[], k2.d0[], boolean[], long):long");
    }
}
