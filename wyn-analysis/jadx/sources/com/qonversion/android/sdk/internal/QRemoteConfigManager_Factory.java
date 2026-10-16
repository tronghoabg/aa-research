package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QRemoteConfigManager_Factory implements InterfaceC2432a {
    private final InterfaceC2432a fallbacksServiceProvider;
    private final InterfaceC2432a remoteConfigServiceProvider;

    public QRemoteConfigManager_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.remoteConfigServiceProvider = interfaceC2432a;
        this.fallbacksServiceProvider = interfaceC2432a2;
    }

    public static QRemoteConfigManager_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new QRemoteConfigManager_Factory(interfaceC2432a, interfaceC2432a2);
    }

    public static QRemoteConfigManager newInstance(QRemoteConfigService qRemoteConfigService, QFallbacksService qFallbacksService) {
        return new QRemoteConfigManager(qRemoteConfigService, qFallbacksService);
    }

    @Override // df.InterfaceC2432a
    public QRemoteConfigManager get() {
        return new QRemoteConfigManager((QRemoteConfigService) this.remoteConfigServiceProvider.get(), (QFallbacksService) this.fallbacksServiceProvider.get());
    }
}
