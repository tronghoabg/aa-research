package com.waze.network.a;

import com.waze.aa.d;
import com.waze.authentication.w;
import com.waze.shared_infra.i.e;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements w, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f31858a;

    /* renamed from: b, reason: collision with root package name */
    private final a f31859b;

    /* renamed from: c, reason: collision with root package name */
    private final d f31860c;

    public c(e eVar, d dVar, a aVar) {
        x.f(eVar, "logger");
        x.f(dVar, "stub");
        x.f(aVar, "clientInfoProvider");
        this.f31858a = eVar;
        this.f31860c = dVar;
        this.f31859b = aVar;
    }

    @Override // com.waze.authentication.w
    public final /* synthetic */ Object a(Object obj, h.c.e eVar) {
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.authentication.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.authentication.ax r4, com.waze.authentication.x r5, h.c.e r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof com.waze.network.a.b
            if (r5 == 0) goto L13
            r5 = r6
            com.waze.network.a.b r5 = (com.waze.network.a.b) r5
            int r0 = r5.f31857c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f31857c = r0
            goto L18
        L13:
            com.waze.network.a.b r5 = new com.waze.network.a.b
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.f31855a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f31857c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e.b.c.b(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2f:
            e.b.c.b(r6)
            com.waze.network.a.a r6 = r3.f31859b
            r1 = 0
            i.b.l.ao r6 = r6.a(r1)
            com.waze.i.s r4 = com.waze.navigate.location_preview.ba.h(r4, r6)
            com.waze.shared_infra.i.e r6 = r3.f31858a
            java.lang.String r1 = "Sending GetTokenRequest to authentication server"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.a(r1)
            com.waze.aa.d r6 = r3.f31860c
            java.lang.Object r6 = r6.a()
            com.waze.i.c r6 = (com.waze.i.c) r6
            if (r6 == 0) goto L85
            r5.f31857c = r2
            e.a.cm r1 = new e.a.cm
            r1.<init>()
            java.lang.Object r6 = r6.a(r4, r1, r5)
            if (r6 != r0) goto L5e
            return r0
        L5e:
            com.waze.shared_infra.i.e r3 = r3.f31858a
            com.waze.i.u r6 = (com.waze.i.u) r6
            java.lang.String r4 = "Received response from authentication server"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.a(r4)
            com.waze.authentication.a r3 = new com.waze.authentication.a
            java.lang.String r4 = r6.getToken()
            java.lang.String r5 = "getToken(...)"
            h.g.b.x.e(r4, r5)
            long r5 = r6.getTokenExpireTime()
            j$.time.Instant r5 = j$.time.Instant.ofEpochMilli(r5)
            java.lang.String r6 = "ofEpochMilli(...)"
            h.g.b.x.e(r5, r6)
            r3.<init>(r4, r5)
            return r3
        L85:
            com.waze.network.a.c r3 = (com.waze.network.a.c) r3
            com.waze.authentication.n r3 = com.waze.authentication.n.f15767a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.a.c.b(com.waze.authentication.ax, com.waze.authentication.x, h.c.e):java.lang.Object");
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
