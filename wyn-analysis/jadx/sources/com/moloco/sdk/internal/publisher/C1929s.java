package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1929s {

    /* renamed from: a, reason: collision with root package name */
    public final Hf.e0 f29336a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f29337b;

    /* renamed from: c, reason: collision with root package name */
    public final C1931u f29338c;

    /* renamed from: d, reason: collision with root package name */
    public final tf.l f29339d;

    /* renamed from: e, reason: collision with root package name */
    public final Lf.e f29340e;

    public C1929s(Hf.e0 initializationState, com.moloco.sdk.internal.services.k timeProviderService, C1931u c1931u, tf.l lVar) {
        AbstractC3340k.e(initializationState, "initializationState");
        AbstractC3340k.e(timeProviderService, "timeProviderService");
        this.f29336a = initializationState;
        this.f29337b = timeProviderService;
        this.f29338c = c1931u;
        this.f29339d = lVar;
        this.f29340e = Ef.S.f3698a;
    }

    public static final MolocoAdError.AdCreateError a(C1929s c1929s, String str, String str2, com.moloco.sdk.acm.l lVar, c0 c0Var, com.moloco.sdk.acm.recorder.c cVar) {
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "failure");
        hVar.a("initial_sdk_init_state", str2);
        hVar.a("ad_type", c0Var.name());
        Initialization initialization = (Initialization) c1929s.f29336a.getValue();
        int i5 = initialization == null ? -1 : AbstractC1921j.f29044a[initialization.ordinal()];
        if (i5 == -1) {
            com.moloco.sdk.internal.error.b bVarB = com.moloco.sdk.service_locator.b.b();
            StringBuilder sb2 = new StringBuilder("CREATE_");
            String upperCase = c0Var.name().toUpperCase(Locale.ROOT);
            AbstractC3340k.d(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            sb2.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            bVarB.a(sb2.toString(), new com.moloco.sdk.internal.error.a(null));
            lVar.a("result", "failure");
            lVar.a("reason", "sdk_init_not_completed");
            cVar.b(lVar);
            hVar.a("reason", "sdk_init_not_completed");
            cVar.a(hVar);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i5 == 1) {
            com.moloco.sdk.service_locator.b.b().a("UNABLE_TO_CREATE_AD", new com.moloco.sdk.internal.error.a(null));
            lVar.a("result", "failure");
            lVar.a("reason", "unable_to_create_ad");
            cVar.b(lVar);
            hVar.a("reason", "unable_to_create_ad");
            cVar.a(hVar);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", R8.v.f("Could not find the adUnitId that was requested for load: ", str), null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i5 != 2) {
            throw new E5.Q((byte) 0, 9);
        }
        com.moloco.sdk.internal.error.b bVarB2 = com.moloco.sdk.service_locator.b.b();
        StringBuilder sb3 = new StringBuilder("CREATE_");
        String upperCase2 = c0Var.name().toUpperCase(Locale.ROOT);
        AbstractC3340k.d(upperCase2, "toUpperCase(...)");
        sb3.append(upperCase2);
        sb3.append("_AD_FAILED_SDK_INIT_FAILED");
        bVarB2.a(sb3.toString(), new com.moloco.sdk.internal.error.a(null));
        lVar.a("result", "failure");
        lVar.a("reason", "sdk_init_failed");
        cVar.b(lVar);
        hVar.a("reason", "sdk_init_failed");
        cVar.a(hVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
        return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.C1929s r18, tf.l r19, com.moloco.sdk.internal.publisher.c0 r20, com.moloco.sdk.acm.recorder.c r21, lf.AbstractC3464c r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.C1929s.b(com.moloco.sdk.internal.publisher.s, tf.l, com.moloco.sdk.internal.publisher.c0, com.moloco.sdk.acm.recorder.c, lf.c):java.lang.Object");
    }

    public static final String c(C1929s c1929s) {
        String strName;
        Initialization initialization = (Initialization) c1929s.f29336a.getValue();
        if (initialization == null || (strName = initialization.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = strName.toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
