package Vd;

import Ef.C0499l0;
import Ef.C0505o0;
import Ef.D;
import Ef.H;
import Ef.InterfaceC0501m0;
import io.ktor.utils.io.InterfaceC2886t;
import io.ktor.utils.io.Q;
import io.ktor.utils.io.S;
import java.io.IOException;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d implements InterfaceC2886t {

    /* renamed from: b, reason: collision with root package name */
    public final Pf.b f14890b;

    /* renamed from: c, reason: collision with root package name */
    public S f14891c;

    /* renamed from: d, reason: collision with root package name */
    public final Pf.a f14892d;

    /* renamed from: e, reason: collision with root package name */
    public final C0505o0 f14893e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3108h f14894f;

    public d(Pf.b bVar, InterfaceC3108h parent) {
        AbstractC3340k.e(parent, "parent");
        this.f14890b = bVar;
        this.f14892d = new Pf.a();
        C0505o0 c0505o0 = new C0505o0((InterfaceC0501m0) parent.get(C0499l0.f3748a));
        this.f14893e = c0505o0;
        this.f14894f = parent.plus(c0505o0).plus(new D("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final void a(Throwable th) throws IOException {
        if (this.f14891c != null) {
            return;
        }
        C0505o0 c0505o0 = this.f14893e;
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        H.k(c0505o0, message, th);
        this.f14890b.close();
        String message2 = th.getMessage();
        this.f14891c = new S(new IOException(message2 != null ? message2 : "Channel was cancelled", th));
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Throwable b() {
        S s10 = this.f14891c;
        if (s10 != null) {
            return s10.a(Q.f37370a);
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Pf.a d() {
        return this.f14892d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.InterfaceC2886t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r5, lf.AbstractC3464c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Vd.b
            if (r0 == 0) goto L13
            r0 = r6
            Vd.b r0 = (Vd.b) r0
            int r1 = r0.f14887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14887d = r1
            goto L18
        L13:
            Vd.b r0 = new Vd.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14885b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f14887d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.f14884a
            Fe.e.U(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            io.ktor.utils.io.S r6 = r4.f14891c
            if (r6 == 0) goto L3b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3b:
            Vd.c r6 = new Vd.c
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f14884a = r5
            r0.f14887d = r3
            jf.h r2 = r4.f14894f
            java.lang.Object r6 = Ef.H.P(r2, r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            Pf.a r6 = r4.f14892d
            long r0 = Fe.b.C(r6)
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Vd.d.g(int, lf.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final boolean h() {
        return this.f14891c != null && this.f14892d.exhausted();
    }
}
