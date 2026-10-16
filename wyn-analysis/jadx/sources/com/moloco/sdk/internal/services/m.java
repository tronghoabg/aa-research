package com.moloco.sdk.internal.services;

import A7.AbstractC0279p0;
import Ef.H;
import Va.M6;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class m implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.analytics.c f29709a;

    /* renamed from: b, reason: collision with root package name */
    public final k f29710b;

    /* renamed from: c, reason: collision with root package name */
    public Long f29711c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29712d;

    public m(com.moloco.sdk.internal.services.analytics.c analyticsService, k timeProviderService) {
        AbstractC3340k.e(analyticsService, "analyticsService");
        AbstractC3340k.e(timeProviderService, "timeProviderService");
        this.f29709a = analyticsService;
        this.f29710b = timeProviderService;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1457v interfaceC1457v) {
        M6.d(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l10 = this.f29711c;
        if (l10 != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.f29710b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l10.longValue();
            com.moloco.sdk.internal.services.analytics.c cVar = this.f29709a;
            com.moloco.sdk.internal.services.events.g gVar = cVar.f29406c.f29607a;
            if (gVar.f29609a && gVar.f29611c.length() > 0) {
                StringBuilder sbU = M6.u(jCurrentTimeMillis, "Recording applicationForeground with timestamp: ", ", lastBgTimestamp: ");
                sbU.append(jLongValue);
                MolocoLogger.debug$default(molocoLogger, "AnalyticsService", sbU.toString(), false, 4, null);
                H.D(com.moloco.sdk.internal.scheduling.a.f29366a, null, new com.moloco.sdk.internal.services.analytics.b(cVar, jCurrentTimeMillis, jLongValue, null), 3);
            }
            this.f29711c = null;
            this.f29712d = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1457v interfaceC1457v) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.f29712d) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            this.f29710b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f29711c = Long.valueOf(jCurrentTimeMillis);
            com.moloco.sdk.internal.services.analytics.c cVar = this.f29709a;
            com.moloco.sdk.internal.services.events.g gVar = cVar.f29406c.f29607a;
            if (!gVar.f29609a || gVar.f29612d.length() <= 0) {
                return;
            }
            MolocoLogger.debug$default(molocoLogger, "AnalyticsService", AbstractC0279p0.k(jCurrentTimeMillis, "Recording applicationBackground with timestamp: "), false, 4, null);
            H.D(com.moloco.sdk.internal.scheduling.a.f29366a, null, new com.moloco.sdk.internal.services.analytics.a(cVar, jCurrentTimeMillis, null), 3);
        }
    }
}
