package com.moloco.sdk.internal.publisher;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.e f28991a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.X f28992b;

    public a0(com.moloco.sdk.internal.ortb.e bidResponseParser, androidx.fragment.app.X x5) {
        AbstractC3340k.e(bidResponseParser, "bidResponseParser");
        this.f28991a = bidResponseParser;
        this.f28992b = x5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, java.lang.String r13, lf.AbstractC3464c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.X
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.X r0 = (com.moloco.sdk.internal.publisher.X) r0
            int r1 = r0.f28977e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28977e = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.X r0 = new com.moloco.sdk.internal.publisher.X
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f28975c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28977e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            java.lang.String r12 = r0.f28974b
            com.moloco.sdk.internal.publisher.a0 r13 = r0.f28973a
            Fe.e.U(r14)
            goto L5b
        L3a:
            Fe.e.U(r14)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r14 = "parse() called with bidResponseJson: "
            java.lang.String r7 = R8.v.f(r14, r13)
            java.lang.String r6 = "BidLoader"
            r8 = 0
            r9 = 4
            r10 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r5, r6, r7, r8, r9, r10)
            r0.f28973a = r11
            r0.f28974b = r12
            r0.f28977e = r4
            java.lang.Object r14 = r11.b(r13, r0)
            if (r14 != r1) goto L5a
            goto L8a
        L5a:
            r13 = r11
        L5b:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L6f
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r13 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.o r14 = com.moloco.sdk.internal.o.f28667a
            ff.w r0 = ff.w.f35433a
            com.moloco.sdk.internal.r r12 = com.moloco.sdk.internal.s.a(r12, r13, r14, r0)
            com.moloco.sdk.internal.y r13 = new com.moloco.sdk.internal.y
            r13.<init>(r12)
            return r13
        L6f:
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r7 = 0
            r8 = 0
            java.lang.String r5 = "BidLoader"
            java.lang.String r6 = "Processed the bidResponse, proceeding with parsing it."
            r9 = 12
            r10 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            r0.f28973a = r2
            r0.f28974b = r2
            r0.f28977e = r3
            java.lang.Object r12 = r13.c(r14, r12, r0)
            if (r12 != r1) goto L8b
        L8a:
            return r1
        L8b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.a0.a(java.lang.String, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, lf.AbstractC3464c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.Z
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.Z r0 = (com.moloco.sdk.internal.publisher.Z) r0
            int r1 = r0.f28986d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28986d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.Z r0 = new com.moloco.sdk.internal.publisher.Z
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f28984b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28986d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.f28983a
            Fe.e.U(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            Fe.e.U(r9)
            r0.f28983a = r8
            r0.f28986d = r3
            androidx.fragment.app.X r9 = r7.f28992b
            Lf.e r2 = Ef.S.f3698a
            com.moloco.sdk.internal.publisher.W r3 = new com.moloco.sdk.internal.publisher.W
            r4 = 0
            r3.<init>(r9, r8, r4)
            java.lang.Object r9 = Ef.H.P(r2, r3, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L5c
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "Found no pre-preprocessor for the current mediation. Returning the original bid response."
            r5 = 12
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            return r9
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.a0.b(java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r20, java.lang.String r21, lf.AbstractC3464c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.a0.c(java.lang.String, java.lang.String, lf.c):java.lang.Object");
    }
}
