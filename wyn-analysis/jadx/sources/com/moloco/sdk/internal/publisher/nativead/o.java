package com.moloco.sdk.internal.publisher.nativead;

import Ef.H;
import Ef.S;
import W1.r;
import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.internal.publisher.a0;
import com.moloco.sdk.internal.publisher.s0;
import com.moloco.sdk.publisher.AdFormatType;
import ef.C2515C;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29206b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f29207c;

    /* renamed from: d, reason: collision with root package name */
    public final r f29208d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29209e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f29210f;

    /* renamed from: g, reason: collision with root package name */
    public final AdFormatType f29211g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f29212h;

    /* renamed from: i, reason: collision with root package name */
    public final a2.k f29213i;

    public o(Context context, String adUnitId, a0 a0Var, ae.d dVar, r rVar, com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.internal.services.k kVar) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        this.f29205a = context;
        this.f29206b = adUnitId;
        this.f29207c = a0Var;
        this.f29208d = rVar;
        this.f29209e = cVar;
        this.f29210f = kVar;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.f29211g = adFormatType;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        com.moloco.sdk.acm.l lVarC = cVar.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        lVarC.a("ad_type", lowerCase);
        this.f29212h = lVarC;
        this.f29213i = new a2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.nativead.o r20, com.moloco.sdk.internal.publisher.nativead.model.h r21, long r22, lf.AbstractC3464c r24) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.b(com.moloco.sdk.internal.publisher.nativead.o, com.moloco.sdk.internal.publisher.nativead.model.h, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.moloco.sdk.internal.publisher.s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.moloco.sdk.internal.publisher.nativead.o r10, java.lang.String r11, com.moloco.sdk.acm.l r12, com.moloco.sdk.internal.publisher.C r13, lf.AbstractC3464c r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.c(com.moloco.sdk.internal.publisher.nativead.o, java.lang.String, com.moloco.sdk.acm.l, com.moloco.sdk.internal.publisher.C, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.moloco.sdk.internal.publisher.nativead.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.moloco.sdk.internal.publisher.nativead.o r16, java.lang.String r17, com.moloco.sdk.internal.ortb.model.C1890d r18, com.moloco.sdk.internal.publisher.C r19, lf.AbstractC3464c r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.d(com.moloco.sdk.internal.publisher.nativead.o, java.lang.String, com.moloco.sdk.internal.ortb.model.d, com.moloco.sdk.internal.publisher.C, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.moloco.sdk.internal.publisher.s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.internal.ortb.model.C1890d r19, com.moloco.sdk.internal.publisher.nativead.model.h r20, com.moloco.sdk.internal.publisher.C r21, long r22, lf.AbstractC3464c r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.a(com.moloco.sdk.internal.ortb.model.d, com.moloco.sdk.internal.publisher.nativead.model.h, com.moloco.sdk.internal.publisher.C, long, lf.c):java.lang.Object");
    }

    public final Object e(s0 s0Var, com.moloco.sdk.internal.r rVar, C1890d c1890d, AbstractC3464c abstractC3464c) throws Throwable {
        this.f29213i.getClass();
        Lf.e eVar = S.f3698a;
        Object objP = H.P(Jf.n.f6132a, new f(s0Var, rVar, c1890d, null), abstractC3464c);
        return objP == kf.a.f39711a ? objP : C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r8, long r9, lf.AbstractC3464c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.moloco.sdk.internal.publisher.nativead.n
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.internal.publisher.nativead.n r0 = (com.moloco.sdk.internal.publisher.nativead.n) r0
            int r1 = r0.f29204c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29204c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.n r0 = new com.moloco.sdk.internal.publisher.nativead.n
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f29202a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29204c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r11)
            goto L3d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            Fe.e.U(r11)
            r0.f29204c = r3
            android.content.Context r11 = r7.f29205a
            java.lang.Object r11 = A6.c.c(r11, r8, r9, r0)
            if (r11 != r1) goto L3d
            return r1
        L3d:
            com.moloco.sdk.internal.A r11 = (com.moloco.sdk.internal.A) r11
            boolean r8 = r11 instanceof com.moloco.sdk.internal.z
            if (r8 == 0) goto L4d
            com.moloco.sdk.internal.z r8 = new com.moloco.sdk.internal.z
            com.moloco.sdk.internal.z r11 = (com.moloco.sdk.internal.z) r11
            java.lang.Object r9 = r11.f29794a
            r8.<init>(r9)
            return r8
        L4d:
            boolean r8 = r11 instanceof com.moloco.sdk.internal.y
            if (r8 == 0) goto L6d
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.y r11 = (com.moloco.sdk.internal.y) r11
            java.lang.Object r8 = r11.f29793a
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r2 = "NativeAd prepareAssets failed"
            r4 = 0
            java.lang.String r1 = "NativeAdLoader"
            r5 = 8
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.y r8 = new com.moloco.sdk.internal.y
            java.lang.Object r9 = r11.f29793a
            r8.<init>(r9)
            return r8
        L6d:
            E5.Q r8 = new E5.Q
            r9 = 9
            r10 = 0
            r8.<init>(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.f(java.util.List, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, com.moloco.sdk.acm.l r12, com.moloco.sdk.internal.publisher.C r13, lf.AbstractC3464c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.nativead.k
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.nativead.k r0 = (com.moloco.sdk.internal.publisher.nativead.k) r0
            int r1 = r0.f29164c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29164c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.k r0 = new com.moloco.sdk.internal.publisher.nativead.k
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f29162a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29164c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r14)
            goto L4c
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            Fe.e.U(r14)
            a2.k r14 = r10.f29213i
            r14.getClass()
            Lf.e r14 = Ef.S.f3698a
            com.moloco.sdk.internal.publisher.nativead.m r4 = new com.moloco.sdk.internal.publisher.nativead.m
            r9 = 0
            r5 = r10
            r7 = r11
            r6 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f29164c = r3
            java.lang.Object r14 = Ef.H.P(r14, r4, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            ef.n r14 = (ef.C2530n) r14
            java.lang.Object r11 = r14.f34674a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.o.g(java.lang.String, com.moloco.sdk.acm.l, com.moloco.sdk.internal.publisher.C, lf.c):java.lang.Object");
    }
}
