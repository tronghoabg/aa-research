package f6;

import E5.C0;
import u6.AbstractC4256a;

/* renamed from: f6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2590c implements InterfaceC2610w, InterfaceC2609v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2610w f35036a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2609v f35037b;

    /* renamed from: c, reason: collision with root package name */
    public C2589b[] f35038c = new C2589b[0];

    /* renamed from: d, reason: collision with root package name */
    public long f35039d;

    /* renamed from: e, reason: collision with root package name */
    public long f35040e;

    /* renamed from: f, reason: collision with root package name */
    public long f35041f;

    /* renamed from: g, reason: collision with root package name */
    public C2592e f35042g;

    public C2590c(InterfaceC2610w interfaceC2610w, boolean z2, long j8, long j10) {
        this.f35036a = interfaceC2610w;
        this.f35039d = z2 ? j8 : -9223372036854775807L;
        this.f35040e = j8;
        this.f35041f = j10;
    }

    @Override // f6.InterfaceC2609v
    public final void a(InterfaceC2610w interfaceC2610w) {
        if (this.f35042g != null) {
            return;
        }
        InterfaceC2609v interfaceC2609v = this.f35037b;
        interfaceC2609v.getClass();
        interfaceC2609v.a(this);
    }

    @Override // f6.InterfaceC2609v
    public final void b(W w2) {
        InterfaceC2609v interfaceC2609v = this.f35037b;
        interfaceC2609v.getClass();
        interfaceC2609v.b(this);
    }

    @Override // f6.W
    public final long c() {
        long jC = this.f35036a.c();
        if (jC != Long.MIN_VALUE) {
            long j8 = this.f35041f;
            if (j8 == Long.MIN_VALUE || jC < j8) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // f6.InterfaceC2610w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f35039d = r0
            f6.b[] r0 = r5.f35038c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f35034b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            f6.w r0 = r5.f35036a
            long r0 = r0.d(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f35040e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f35041f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            u6.AbstractC4256a.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2590c.d(long):long");
    }

    @Override // f6.W
    public final boolean e() {
        return this.f35036a.e();
    }

    @Override // f6.InterfaceC2610w
    public final long f() {
        if (g()) {
            long j8 = this.f35039d;
            this.f35039d = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j8;
        }
        long jF2 = this.f35036a.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC4256a.i(jF2 >= this.f35040e);
        long j10 = this.f35041f;
        AbstractC4256a.i(j10 == Long.MIN_VALUE || jF2 <= j10);
        return jF2;
    }

    public final boolean g() {
        return this.f35039d != -9223372036854775807L;
    }

    @Override // f6.InterfaceC2610w
    public final void h() throws C2592e {
        C2592e c2592e = this.f35042g;
        if (c2592e != null) {
            throw c2592e;
        }
        this.f35036a.h();
    }

    @Override // f6.InterfaceC2610w
    public final void i(long j8) {
        this.f35036a.i(j8);
    }

    @Override // f6.InterfaceC2610w
    public final a0 j() {
        return this.f35036a.j();
    }

    @Override // f6.W
    public final long n() {
        long jN = this.f35036a.n();
        if (jN != Long.MIN_VALUE) {
            long j8 = this.f35041f;
            if (j8 == Long.MIN_VALUE || jN < j8) {
                return jN;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // f6.W
    public final void o(long j8) {
        this.f35036a.o(j8);
    }

    @Override // f6.InterfaceC2610w
    public final void r(InterfaceC2609v interfaceC2609v, long j8) {
        this.f35037b = interfaceC2609v;
        this.f35036a.r(this, j8);
    }

    @Override // f6.InterfaceC2610w
    public final long s(long j8, C0 c02) {
        long j10 = this.f35040e;
        if (j8 == j10) {
            return j10;
        }
        long jI = u6.v.i(c02.f3014a, 0L, j8 - j10);
        long j11 = this.f35041f;
        long jI2 = u6.v.i(c02.f3015b, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j8);
        if (jI != c02.f3014a || jI2 != c02.f3015b) {
            c02 = new C0(jI, jI2);
        }
        return this.f35036a.s(j8, c02);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    @Override // f6.InterfaceC2610w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(r6.n[] r17, boolean[] r18, f6.V[] r19, boolean[] r20, long r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2590c.y(r6.n[], boolean[], f6.V[], boolean[], long):long");
    }

    @Override // f6.W
    public final boolean z(long j8) {
        return this.f35036a.z(j8);
    }
}
