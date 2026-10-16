package k2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h0 implements F {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f39084c = new n0(new N1.O("", j0.f39096j));

    /* renamed from: a, reason: collision with root package name */
    public final long f39085a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39086b = new ArrayList();

    public h0(long j8) {
        this.f39085a = j8;
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        return Q1.x.j(j8, 0L, this.f39085a);
    }

    @Override // k2.f0
    public final long c() {
        return Long.MIN_VALUE;
    }

    @Override // k2.F
    public final long d(long j8) {
        long j10 = Q1.x.j(j8, 0L, this.f39085a);
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f39086b;
            if (i5 >= arrayList.size()) {
                return j10;
            }
            ((i0) arrayList.get(i5)).b(j10);
            i5++;
        }
    }

    @Override // k2.f0
    public final boolean e() {
        return false;
    }

    @Override // k2.F
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // k2.F
    public final n0 j() {
        return f39084c;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        return false;
    }

    @Override // k2.f0
    public final long n() {
        return Long.MIN_VALUE;
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        interfaceC3143E.l(this);
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        long j10 = Q1.x.j(j8, 0L, this.f39085a);
        for (int i5 = 0; i5 < qVarArr.length; i5++) {
            d0 d0Var = d0VarArr[i5];
            ArrayList arrayList = this.f39086b;
            if (d0Var != null && (qVarArr[i5] == null || !zArr[i5])) {
                arrayList.remove(d0Var);
                d0VarArr[i5] = null;
            }
            if (d0VarArr[i5] == null && qVarArr[i5] != null) {
                i0 i0Var = new i0(this.f39085a);
                i0Var.b(j10);
                arrayList.add(i0Var);
                d0VarArr[i5] = i0Var;
                zArr2[i5] = true;
            }
        }
        return j10;
    }

    @Override // k2.F
    public final void h() {
    }

    @Override // k2.F
    public final void i(long j8) {
    }

    @Override // k2.f0
    public final void o(long j8) {
    }
}
