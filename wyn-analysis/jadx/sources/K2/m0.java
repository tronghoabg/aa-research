package k2;

/* loaded from: classes.dex */
public final class m0 implements F, InterfaceC3143E {

    /* renamed from: a, reason: collision with root package name */
    public final F f39122a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39123b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3143E f39124c;

    public m0(F f10, long j8) {
        this.f39122a = f10;
        this.f39123b = j8;
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        InterfaceC3143E interfaceC3143E = this.f39124c;
        interfaceC3143E.getClass();
        interfaceC3143E.a(this);
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        long j10 = this.f39123b;
        return this.f39122a.b(j8 - j10, a0Var) + j10;
    }

    @Override // k2.f0
    public final long c() {
        long jC = this.f39122a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.f39123b;
    }

    @Override // k2.F
    public final long d(long j8) {
        long j10 = this.f39123b;
        return this.f39122a.d(j8 - j10) + j10;
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f39122a.e();
    }

    @Override // k2.F
    public final long f() {
        long jF = this.f39122a.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.f39123b;
    }

    @Override // k2.F
    public final void h() {
        this.f39122a.h();
    }

    @Override // k2.F
    public final void i(long j8) {
        this.f39122a.i(j8 - this.f39123b);
    }

    @Override // k2.F
    public final n0 j() {
        return this.f39122a.j();
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        U1.B b5 = new U1.B();
        b5.f11905b = c10.f11908b;
        b5.f11906c = c10.f11909c;
        b5.f11904a = c10.f11907a - this.f39123b;
        return this.f39122a.k(new U1.C(b5));
    }

    @Override // k2.InterfaceC3143E
    public final void l(F f10) {
        InterfaceC3143E interfaceC3143E = this.f39124c;
        interfaceC3143E.getClass();
        interfaceC3143E.l(this);
    }

    @Override // k2.f0
    public final long n() {
        long jN = this.f39122a.n();
        if (jN == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jN + this.f39123b;
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f39122a.o(j8 - this.f39123b);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f39124c = interfaceC3143E;
        this.f39122a.q(this, j8 - this.f39123b);
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        d0[] d0VarArr2 = new d0[d0VarArr.length];
        int i5 = 0;
        while (true) {
            d0 d0Var = null;
            if (i5 >= d0VarArr.length) {
                break;
            }
            l0 l0Var = (l0) d0VarArr[i5];
            if (l0Var != null) {
                d0Var = l0Var.f39118a;
            }
            d0VarArr2[i5] = d0Var;
            i5++;
        }
        long j10 = this.f39123b;
        long jR = this.f39122a.r(qVarArr, zArr, d0VarArr2, zArr2, j8 - j10);
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            d0 d0Var2 = d0VarArr2[i10];
            if (d0Var2 == null) {
                d0VarArr[i10] = null;
            } else {
                d0 d0Var3 = d0VarArr[i10];
                if (d0Var3 == null || ((l0) d0Var3).f39118a != d0Var2) {
                    d0VarArr[i10] = new l0(d0Var2, j10);
                }
            }
        }
        return jR + j10;
    }
}
