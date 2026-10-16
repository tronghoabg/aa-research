package com.moloco.sdk.internal.error;

import Bf.r;
import X2.j;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.config.a f28510a;

    /* renamed from: b, reason: collision with root package name */
    public final j f28511b;

    public b(com.moloco.sdk.internal.services.config.a configService, j jVar) {
        AbstractC3340k.e(configService, "configService");
        this.f28510a = configService;
        this.f28511b = jVar;
    }

    public final void a(String error, a aVar) {
        AbstractC3340k.e(error, "error");
        com.moloco.sdk.internal.services.config.a aVar2 = this.f28510a;
        if (!aVar2.f29578b.containsKey("ReportSDKError")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", "Error reporting is disabled. Tried to report error: ".concat(error), null, false, 12, null);
            return;
        }
        aVar2.getClass();
        String str = (String) aVar2.f29578b.get("ReportSDKError");
        if (str == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", "Error reporting is enabled but with invalid url", null, false, 12, null);
            return;
        }
        j jVar = this.f28511b;
        ((k) jVar.f16075b).getClass();
        String strH0 = r.h0(r.h0(str, "[ERROR_CODE]", error, false), "[HAPPENED_AT_TS]", String.valueOf(System.currentTimeMillis()), false);
        String str2 = aVar.f28509a;
        if (str2 != null) {
            strH0 = r.h0(strH0, "[MTID]", str2, false);
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ErrorReportingApi", N0.a.h("Reporting error: ", error, " to url: ", strH0), null, false, 12, null);
        ((c) jVar.f16076c).f32436a.a(strH0);
    }
}
