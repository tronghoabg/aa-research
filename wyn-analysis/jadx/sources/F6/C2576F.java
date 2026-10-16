package f6;

import E5.C0;

/* renamed from: f6.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2576F implements InterfaceC2610w, InterfaceC2609v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2610w f34878a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34879b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2609v f34880c;

    public C2576F(InterfaceC2610w interfaceC2610w, long j8) {
        this.f34878a = interfaceC2610w;
        this.f34879b = j8;
    }

    @Override // f6.InterfaceC2609v
    public final void a(InterfaceC2610w interfaceC2610w) {
        InterfaceC2609v interfaceC2609v = this.f34880c;
        interfaceC2609v.getClass();
        interfaceC2609v.a(this);
    }

    @Override // f6.InterfaceC2609v
    public final void b(W w2) {
        InterfaceC2609v interfaceC2609v = this.f34880c;
        interfaceC2609v.getClass();
        interfaceC2609v.b(this);
    }

    @Override // f6.W
    public final long c() {
        long jC = this.f34878a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.f34879b;
    }

    @Override // f6.InterfaceC2610w
    public final long d(long j8) {
        long j10 = this.f34879b;
        return this.f34878a.d(j8 - j10) + j10;
    }

    @Override // f6.W
    public final boolean e() {
        return this.f34878a.e();
    }

    @Override // f6.InterfaceC2610w
    public final long f() {
        long jF = this.f34878a.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.f34879b;
    }

    @Override // f6.InterfaceC2610w
    public final void h() {
        this.f34878a.h();
    }

    @Override // f6.InterfaceC2610w
    public final void i(long j8) {
        this.f34878a.i(j8 - this.f34879b);
    }

    @Override // f6.InterfaceC2610w
    public final a0 j() {
        return this.f34878a.j();
    }

    @Override // f6.W
    public final long n() {
        long jN = this.f34878a.n();
        if (jN == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jN + this.f34879b;
    }

    @Override // f6.W
    public final void o(long j8) {
        this.f34878a.o(j8 - this.f34879b);
    }

    @Override // f6.InterfaceC2610w
    public final void r(InterfaceC2609v interfaceC2609v, long j8) {
        this.f34880c = interfaceC2609v;
        this.f34878a.r(this, j8 - this.f34879b);
    }

    @Override // f6.InterfaceC2610w
    public final long s(long j8, C0 c02) {
        long j10 = this.f34879b;
        return this.f34878a.s(j8 - j10, c02) + j10;
    }

    @Override // f6.InterfaceC2610w
    public final long y(r6.n[] nVarArr, boolean[] zArr, V[] vArr, boolean[] zArr2, long j8) {
        V[] vArr2 = new V[vArr.length];
        int i5 = 0;
        while (true) {
            V v2 = null;
            if (i5 >= vArr.length) {
                break;
            }
            C2577G c2577g = (C2577G) vArr[i5];
            if (c2577g != null) {
                v2 = c2577g.f34881a;
            }
            vArr2[i5] = v2;
            i5++;
        }
        long j10 = this.f34879b;
        long jY = this.f34878a.y(nVarArr, zArr, vArr2, zArr2, j8 - j10);
        for (int i10 = 0; i10 < vArr.length; i10++) {
            V v10 = vArr2[i10];
            if (v10 == null) {
                vArr[i10] = null;
            } else {
                V v11 = vArr[i10];
                if (v11 == null || ((C2577G) v11).f34881a != v10) {
                    vArr[i10] = new C2577G(v10, j10);
                }
            }
        }
        return jY + j10;
    }

    @Override // f6.W
    public final boolean z(long j8) {
        return this.f34878a.z(j8 - this.f34879b);
    }
}
