package com.qonversion.android.sdk.internal.logger;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;
import hb.K;

/* loaded from: classes4.dex */
public final class QExceptionManager_Factory implements InterfaceC2432a {
    private final InterfaceC2432a headersProvider;
    private final InterfaceC2432a intervalConfigProvider;
    private final InterfaceC2432a moshiProvider;
    private final InterfaceC2432a repositoryProvider;

    public QExceptionManager_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        this.repositoryProvider = interfaceC2432a;
        this.intervalConfigProvider = interfaceC2432a2;
        this.headersProvider = interfaceC2432a3;
        this.moshiProvider = interfaceC2432a4;
    }

    public static QExceptionManager_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        return new QExceptionManager_Factory(interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4);
    }

    public static QExceptionManager newInstance(QRepository qRepository, InternalConfig internalConfig, ApiHeadersProvider apiHeadersProvider, K k) {
        return new QExceptionManager(qRepository, internalConfig, apiHeadersProvider, k);
    }

    @Override // df.InterfaceC2432a
    public QExceptionManager get() {
        return new QExceptionManager((QRepository) this.repositoryProvider.get(), (InternalConfig) this.intervalConfigProvider.get(), (ApiHeadersProvider) this.headersProvider.get(), (K) this.moshiProvider.get());
    }
}
