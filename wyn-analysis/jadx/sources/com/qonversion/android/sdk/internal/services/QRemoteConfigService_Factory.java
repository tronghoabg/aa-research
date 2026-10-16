package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QRemoteConfigService_Factory implements InterfaceC2432a {
    private final InterfaceC2432a repositoryProvider;

    public QRemoteConfigService_Factory(InterfaceC2432a interfaceC2432a) {
        this.repositoryProvider = interfaceC2432a;
    }

    public static QRemoteConfigService_Factory create(InterfaceC2432a interfaceC2432a) {
        return new QRemoteConfigService_Factory(interfaceC2432a);
    }

    public static QRemoteConfigService newInstance(QRepository qRepository) {
        return new QRemoteConfigService(qRepository);
    }

    @Override // df.InterfaceC2432a
    public QRemoteConfigService get() {
        return new QRemoteConfigService((QRepository) this.repositoryProvider.get());
    }
}
