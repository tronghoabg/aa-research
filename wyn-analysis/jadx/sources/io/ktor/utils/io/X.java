package io.ktor.utils.io;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class X implements InterfaceC2886t {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2886t f37375b;

    /* renamed from: c, reason: collision with root package name */
    public final Pf.a f37376c;

    /* renamed from: d, reason: collision with root package name */
    public long f37377d;

    /* renamed from: e, reason: collision with root package name */
    public long f37378e;

    public X(InterfaceC2886t delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f37375b = delegate;
        this.f37376c = new Pf.a();
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final void a(Throwable th) {
        this.f37375b.a(th);
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Throwable b() {
        return this.f37375b.b();
    }

    public final void c() {
        e();
        this.f37377d += this.f37376c.h(this.f37375b.d());
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Pf.a d() {
        c();
        return this.f37376c;
    }

    public final void e() {
        long j8 = this.f37378e;
        long j10 = this.f37377d;
        long j11 = this.f37376c.f9456c;
        this.f37378e = (j10 - j11) + j8;
        this.f37377d = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.InterfaceC2886t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r9, lf.AbstractC3464c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.W
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.W r0 = (io.ktor.utils.io.W) r0
            int r1 = r0.f37374c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37374c = r1
            goto L18
        L13:
            io.ktor.utils.io.W r0 = new io.ktor.utils.io.W
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f37372a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37374c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r10)
            goto L4c
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            Fe.e.U(r10)
            r8.c()
            Pf.a r10 = r8.f37376c
            long r4 = r10.f9456c
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L41
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L41:
            r0.f37374c = r3
            io.ktor.utils.io.t r10 = r8.f37375b
            java.lang.Object r10 = r10.g(r9, r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L5a
            r8.c()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L5a:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.X.g(int, lf.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final boolean h() {
        return this.f37376c.exhausted() && this.f37375b.h();
    }
}
