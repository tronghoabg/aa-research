package com.moloco.sdk.internal.services.bidtoken;

import R8.C0805a;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final A f29462a;

    /* renamed from: b, reason: collision with root package name */
    public final C0805a f29463b;

    /* renamed from: c, reason: collision with root package name */
    public final Nf.d f29464c;

    public o(A serverBidTokenService, C0805a c0805a) {
        AbstractC3340k.e(serverBidTokenService, "serverBidTokenService");
        this.f29462a = serverBidTokenService;
        this.f29463b = c0805a;
        this.f29464c = Nf.e.a();
    }

    public static void b(com.moloco.sdk.acm.l lVar, com.moloco.sdk.acm.recorder.b bVar, String str) {
        if (str == null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("bid_token_fetch");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("result", "success");
            com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
            cVar.a(hVar);
            lVar.a("result", "success");
            cVar.b(lVar);
            return;
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("bid_token_fetch");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar2.a("result", "failure");
        hVar2.a("reason", str);
        com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
        cVar2.a(hVar2);
        lVar.a("result", "failure");
        lVar.a("reason", str);
        cVar2.b(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:21:0x005a, B:34:0x00ac, B:36:0x00b6), top: B:62:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:14:0x003c, B:40:0x00d6, B:43:0x00db, B:45:0x00e3, B:51:0x0113, B:46:0x00f8), top: B:60:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:14:0x003c, B:40:0x00d6, B:43:0x00db, B:45:0x00e3, B:51:0x0113, B:46:0x00f8), top: B:60:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.acm.recorder.b r19, lf.AbstractC3464c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.o.a(com.moloco.sdk.acm.recorder.b, lf.c):java.lang.Object");
    }
}
