package com.moloco.sdk.internal.publisher;

import Hf.x0;
import com.moloco.sdk.K0;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MolocoInitStatus;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: f, reason: collision with root package name */
    public static final MolocoInitStatus f29329f;

    /* renamed from: g, reason: collision with root package name */
    public static final MolocoInitStatus f29330g;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f29331a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f29332b;

    /* renamed from: c, reason: collision with root package name */
    public final Hf.e0 f29333c;

    /* renamed from: d, reason: collision with root package name */
    public K0 f29334d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f29335e;

    static {
        Initialization initialization = Initialization.SUCCESS;
        f29329f = new MolocoInitStatus(initialization, "Already Initialized");
        f29330g = new MolocoInitStatus(initialization, "Initialized");
    }

    public r0(com.moloco.sdk.internal.services.k timeProviderService) {
        AbstractC3340k.e(timeProviderService, "timeProviderService");
        this.f29331a = timeProviderService;
        x0 x0VarC = Hf.k0.c(null);
        this.f29332b = x0VarC;
        this.f29333c = new Hf.e0(x0VarC);
        this.f29335e = Hf.k0.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.moloco.sdk.internal.publisher.r0 r26, com.moloco.sdk.internal.A r27, long r28, com.moloco.sdk.internal.services.init.u r30, com.moloco.sdk.acm.recorder.c r31, com.moloco.sdk.acm.l r32, lf.AbstractC3464c r33) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.r0.a(com.moloco.sdk.internal.publisher.r0, com.moloco.sdk.internal.A, long, com.moloco.sdk.internal.services.init.u, com.moloco.sdk.acm.recorder.c, com.moloco.sdk.acm.l, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, com.moloco.sdk.publisher.MediationInfo r19, com.moloco.sdk.internal.services.init.u r20, com.moloco.sdk.acm.recorder.c r21, lf.AbstractC3464c r22) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.r0.b(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.internal.services.init.u, com.moloco.sdk.acm.recorder.c, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(lf.AbstractC3464c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.moloco.sdk.internal.publisher.m0
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.internal.publisher.m0 r0 = (com.moloco.sdk.internal.publisher.m0) r0
            int r1 = r0.f29088c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29088c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.m0 r0 = new com.moloco.sdk.internal.publisher.m0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f29086a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29088c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r12)
            goto L52
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2f:
            Fe.e.U(r12)
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r7 = 0
            r8 = 0
            java.lang.String r5 = "InitializationHandler"
            java.lang.String r6 = "Moloco SDK awaiting init to receive AdFactory"
            r9 = 12
            r10 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            com.moloco.sdk.internal.publisher.n0 r12 = new com.moloco.sdk.internal.publisher.n0
            r2 = 2
            r4 = 0
            r12.<init>(r2, r4)
            r0.f29088c = r3
            Hf.x0 r2 = r11.f29335e
            java.lang.Object r12 = Hf.k0.p(r2, r12, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            java.lang.String r0 = "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory"
            kotlin.jvm.internal.AbstractC3340k.c(r12, r0)
            com.moloco.sdk.internal.e r12 = (com.moloco.sdk.internal.e) r12
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            java.lang.String r1 = "InitializationHandler"
            java.lang.String r2 = "Moloco SDK init completed, AdFactory received"
            r5 = 12
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.r0.c(lf.c):java.lang.Object");
    }
}
