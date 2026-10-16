package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.K0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f29697a;

    /* renamed from: b, reason: collision with root package name */
    public final k f29698b;

    /* renamed from: c, reason: collision with root package name */
    public final Kd.a f29699c;

    /* renamed from: d, reason: collision with root package name */
    public K0 f29700d;

    public s(f initApi, k kVar, Kd.a aVar) {
        AbstractC3340k.e(initApi, "initApi");
        this.f29697a = initApi;
        this.f29698b = kVar;
        this.f29699c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02f3, code lost:
    
        if (r0 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0375  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0340 -> B:16:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r33, com.moloco.sdk.publisher.MediationInfo r34, com.moloco.sdk.acm.recorder.b r35, boolean r36, lf.AbstractC3464c r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.s.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.b, boolean, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.moloco.sdk.acm.recorder.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r24, com.moloco.sdk.publisher.MediationInfo r25, com.moloco.sdk.acm.recorder.c r26, lf.AbstractC3464c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.s.b(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.c, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, com.moloco.sdk.publisher.MediationInfo r8, lf.AbstractC3464c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.services.init.r
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.services.init.r r0 = (com.moloco.sdk.internal.services.init.r) r0
            int r1 = r0.f29696e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29696e = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.init.r r0 = new com.moloco.sdk.internal.services.init.r
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f29694c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29696e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.moloco.sdk.acm.l r7 = r0.f29693b
            com.moloco.sdk.acm.recorder.c r8 = r0.f29692a
            Fe.e.U(r9)
            goto L5b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            Fe.e.U(r9)
            com.moloco.sdk.acm.recorder.a r9 = com.moloco.sdk.acm.recorder.b.Companion
            java.lang.String r2 = r8.getName()
            r9.getClass()
            com.moloco.sdk.acm.recorder.c r9 = com.moloco.sdk.acm.recorder.a.a(r2)
            com.moloco.sdk.internal.client_metrics_data.c[] r2 = com.moloco.sdk.internal.client_metrics_data.c.f28497b
            java.lang.String r2 = "sdk_perform_init_time_ms"
            com.moloco.sdk.acm.l r2 = r9.c(r2)
            r0.f29692a = r9
            r0.f29693b = r2
            r0.f29696e = r3
            java.lang.Object r7 = r6.b(r7, r8, r9, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r8 = r9
            r9 = r7
            r7 = r2
        L5b:
            com.moloco.sdk.internal.services.init.c r9 = (com.moloco.sdk.internal.services.init.c) r9
            com.moloco.sdk.internal.A r0 = r9.f29634a
            boolean r1 = r0 instanceof com.moloco.sdk.internal.y
            java.lang.String r2 = r9.f29635b
            java.lang.String r3 = "sdk_perform_init_attempt"
            java.lang.String r4 = "state"
            java.lang.String r5 = "result"
            if (r1 == 0) goto L89
            com.moloco.sdk.acm.h r0 = new com.moloco.sdk.acm.h
            com.moloco.sdk.internal.client_metrics_data.a[] r1 = com.moloco.sdk.internal.client_metrics_data.a.f28494b
            r0.<init>(r3)
            com.moloco.sdk.internal.client_metrics_data.b[] r1 = com.moloco.sdk.internal.client_metrics_data.b.f28496a
            java.lang.String r1 = "failure"
            r0.a(r5, r1)
            r0.a(r4, r2)
            r8.a(r0)
            r7.a(r5, r1)
            r7.a(r4, r2)
            r8.b(r7)
            goto Laa
        L89:
            boolean r0 = r0 instanceof com.moloco.sdk.internal.z
            if (r0 == 0) goto Lad
            com.moloco.sdk.acm.h r0 = new com.moloco.sdk.acm.h
            com.moloco.sdk.internal.client_metrics_data.a[] r1 = com.moloco.sdk.internal.client_metrics_data.a.f28494b
            r0.<init>(r3)
            com.moloco.sdk.internal.client_metrics_data.b[] r1 = com.moloco.sdk.internal.client_metrics_data.b.f28496a
            java.lang.String r1 = "success"
            r0.a(r5, r1)
            r0.a(r4, r2)
            r8.a(r0)
            r7.a(r5, r1)
            r7.a(r4, r2)
            r8.b(r7)
        Laa:
            com.moloco.sdk.internal.A r7 = r9.f29634a
            return r7
        Lad:
            E5.Q r7 = new E5.Q
            r8 = 9
            r9 = 0
            r7.<init>(r9, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.s.c(java.lang.String, com.moloco.sdk.publisher.MediationInfo, lf.c):java.lang.Object");
    }
}
