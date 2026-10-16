package Cd;

import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;
import xd.C4511c;

/* loaded from: classes5.dex */
public final class i0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4402c f2114a;

    /* renamed from: b, reason: collision with root package name */
    public int f2115b;

    /* renamed from: c, reason: collision with root package name */
    public C4511c f2116c;

    public i0(C4402c client) {
        AbstractC3340k.e(client, "client");
        this.f2114a = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Cd.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Fd.c r6, lf.AbstractC3464c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Cd.h0
            if (r0 == 0) goto L13
            r0 = r7
            Cd.h0 r0 = (Cd.h0) r0
            int r1 = r0.f2111c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2111c = r1
            goto L18
        L13:
            Cd.h0 r0 = new Cd.h0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2109a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f2111c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            Fe.e.U(r7)
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            Fe.e.U(r7)
            xd.c r7 = r5.f2116c
            if (r7 == 0) goto L3a
            Ef.H.j(r7, r3)
        L3a:
            int r7 = r5.f2115b
            r2 = 20
            if (r7 >= r2) goto L76
            int r7 = r7 + r4
            r5.f2115b = r7
            wd.c r7 = r5.f2114a
            Fd.f r7 = r7.f47471g
            java.lang.Object r2 = r6.f4048d
            r0.f2111c = r4
            java.lang.Object r7 = r7.a(r6, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            boolean r6 = r7 instanceof xd.C4511c
            if (r6 == 0) goto L59
            r3 = r7
            xd.c r3 = (xd.C4511c) r3
        L59:
            if (r3 == 0) goto L5e
            r5.f2116c = r3
            return r3
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            Cd.s0 r6 = new Cd.s0
            java.lang.String r7 = "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."
            r0 = 1
            r6.<init>(r7, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.i0.a(Fd.c, lf.c):java.lang.Object");
    }
}
