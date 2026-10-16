package io.ktor.utils.io;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class P implements J {

    /* renamed from: b, reason: collision with root package name */
    public final C2880m f37368b;

    /* renamed from: c, reason: collision with root package name */
    public final D f37369c;

    public P(C2880m c2880m, D d3) {
        this.f37368b = c2880m;
        this.f37369c = d3;
    }

    @Override // io.ktor.utils.io.J
    public final void a(Throwable th) {
        this.f37368b.a(th);
    }

    @Override // io.ktor.utils.io.J
    public final Throwable b() {
        return this.f37368b.b();
    }

    @Override // io.ktor.utils.io.J
    public final Pf.a c() {
        return this.f37368b.c();
    }

    @Override // io.ktor.utils.io.J
    public final Object e(AbstractC3464c abstractC3464c) {
        return this.f37368b.e(abstractC3464c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.f37369c.invoke(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(jf.InterfaceC3103c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.O
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.O r0 = (io.ktor.utils.io.O) r0
            int r1 = r0.f37367c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37367c = r1
            goto L18
        L13:
            io.ktor.utils.io.O r0 = new io.ktor.utils.io.O
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f37365a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37367c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Fe.e.U(r6)
            goto L44
        L36:
            Fe.e.U(r6)
            r0.f37367c = r4
            io.ktor.utils.io.m r6 = r5.f37368b
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            r0.f37367c = r3
            io.ktor.utils.io.D r6 = r5.f37369c
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.P.f(jf.c):java.lang.Object");
    }
}
