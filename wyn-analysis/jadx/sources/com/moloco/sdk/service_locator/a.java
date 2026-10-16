package com.moloco.sdk.service_locator;

import Y2.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532p f29830a = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(8));

    public static B a() {
        o mediaCacheRepository = (o) g.f29851b.getValue();
        com.moloco.sdk.internal.error.b errorReportingService = b.b();
        AbstractC3340k.e(mediaCacheRepository, "mediaCacheRepository");
        AbstractC3340k.e(errorReportingService, "errorReportingService");
        return new B(mediaCacheRepository, false, errorReportingService, 10);
    }
}
