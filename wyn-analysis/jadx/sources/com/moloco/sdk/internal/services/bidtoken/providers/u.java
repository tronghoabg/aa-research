package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class u implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.t f29525a;

    /* renamed from: b, reason: collision with root package name */
    public MolocoPrivacy.PrivacySettings f29526b;

    public u(com.moloco.sdk.internal.services.bidtoken.t tVar) {
        this.f29525a = tVar;
        this.f29526b = tVar.f29546a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        com.moloco.sdk.internal.services.bidtoken.t tVar = this.f29525a;
        this.f29526b = tVar.f29546a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean zA = AbstractC3340k.a(this.f29526b, this.f29525a.f29546a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings()));
        boolean z2 = !zA;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "PrivacyStateSignalProvider", !zA ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "PrivacyStateSignalProvider";
    }
}
