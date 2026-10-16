package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QIdentityManager_Factory implements InterfaceC2432a {
    private final InterfaceC2432a repositoryProvider;
    private final InterfaceC2432a userInfoServiceProvider;

    public QIdentityManager_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.repositoryProvider = interfaceC2432a;
        this.userInfoServiceProvider = interfaceC2432a2;
    }

    public static QIdentityManager_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new QIdentityManager_Factory(interfaceC2432a, interfaceC2432a2);
    }

    public static QIdentityManager newInstance(QRepository qRepository, QUserInfoService qUserInfoService) {
        return new QIdentityManager(qRepository, qUserInfoService);
    }

    @Override // df.InterfaceC2432a
    public QIdentityManager get() {
        return new QIdentityManager((QRepository) this.repositoryProvider.get(), (QUserInfoService) this.userInfoServiceProvider.get());
    }
}
