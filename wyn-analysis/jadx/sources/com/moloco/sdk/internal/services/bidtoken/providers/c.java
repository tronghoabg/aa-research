package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f29472a;

    /* renamed from: b, reason: collision with root package name */
    public Fe.c f29473b;

    public c(com.moloco.sdk.internal.services.q advertisingService) {
        AbstractC3340k.e(advertisingService, "advertisingService");
        this.f29472a = advertisingService;
        this.f29473b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29473b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean z2 = !AbstractC3340k.a(this.f29473b, d());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: needsRefresh: " + z2, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AdvertisingSignalProvider";
    }

    public final Fe.c d() {
        Fe.c cVarA = ((com.moloco.sdk.internal.services.r) this.f29472a).a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + cVarA, false, 4, null);
        return cVarA;
    }
}
