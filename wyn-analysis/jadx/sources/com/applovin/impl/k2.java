package com.applovin.impl;

import com.applovin.impl.e6;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f21803a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (f21803a) {
            return;
        }
        kVar.D().a(d2.f21291S0, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        Long l10 = (Long) kVar.a(r3.f22722s8);
        if (l10.longValue() <= 0) {
            return;
        }
        kVar.r0().a(new s6(kVar, true, "submitIntegrationErrorReport", new X(0, kVar)), e6.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }

    public static void a() {
        f21803a = true;
    }
}
