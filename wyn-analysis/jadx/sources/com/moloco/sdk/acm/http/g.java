package com.moloco.sdk.acm.http;

import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C4402c f28440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28441b;

    public g(C4402c httpClient, String apiUrl) {
        AbstractC3340k.e(httpClient, "httpClient");
        AbstractC3340k.e(apiUrl, "apiUrl");
        this.f28440a = httpClient;
        this.f28441b = apiUrl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        if (r2 == r9) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r17, com.moloco.sdk.acm.http.d r19, com.moloco.sdk.acm.http.a r20, lf.AbstractC3464c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.g.a(long, com.moloco.sdk.acm.http.d, com.moloco.sdk.acm.http.a, lf.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.moloco.sdk.acm.http.d r8, com.moloco.sdk.acm.http.a r9, lf.AbstractC3464c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.http.e
            if (r0 == 0) goto L14
            r0 = r10
            com.moloco.sdk.acm.http.e r0 = (com.moloco.sdk.acm.http.e) r0
            int r1 = r0.f28434c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f28434c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.moloco.sdk.acm.http.e r0 = new com.moloco.sdk.acm.http.e
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f28432a
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f28434c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            Fe.e.U(r10)
            ef.n r10 = (ef.C2530n) r10
            java.lang.Object r8 = r10.f34674a
            return r8
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Fe.e.U(r10)
            r6.f28434c = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r1 = r7
            r4 = r8
            r5 = r9
            java.io.Serializable r8 = r1.a(r2, r4, r5, r6)
            if (r8 != r0) goto L46
            return r0
        L46:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.g.b(com.moloco.sdk.acm.http.d, com.moloco.sdk.acm.http.a, lf.c):java.lang.Object");
    }
}
