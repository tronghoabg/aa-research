package com.moloco.sdk.internal.services.bidtoken;

import Ef.H0;
import com.moloco.sdk.internal.MolocoLogger;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final a2.v f29408a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f29409b;

    /* renamed from: c, reason: collision with root package name */
    public final G9.e f29410c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29411d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Nf.d f29412e = Nf.e.a();

    /* renamed from: f, reason: collision with root package name */
    public H0 f29413f;

    public A(a2.v vVar, Kd.a aVar, G9.e eVar) {
        this.f29408a = vVar;
        this.f29409b = aVar;
        this.f29410c = eVar;
    }

    public static final void c(A a5, String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }

    public static void d(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.acm.recorder.c r21, com.moloco.sdk.internal.services.bidtoken.m r22, boolean r23, boolean r24, lf.AbstractC3464c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.A.a(com.moloco.sdk.acm.recorder.c, com.moloco.sdk.internal.services.bidtoken.m, boolean, boolean, lf.c):java.lang.Object");
    }

    public final Object b(com.moloco.sdk.acm.recorder.c cVar, n nVar) {
        d("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return Fe.g.g(this.f29412e, new w(this, cVar, null), nVar);
    }
}
