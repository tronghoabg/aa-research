package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ManagersModule_ProvideIdentityManagerFactory implements InterfaceC2432a {
    private final ManagersModule module;
    private final InterfaceC2432a repositoryProvider;
    private final InterfaceC2432a userInfoServiceProvider;

    public ManagersModule_ProvideIdentityManagerFactory(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.module = managersModule;
        this.repositoryProvider = interfaceC2432a;
        this.userInfoServiceProvider = interfaceC2432a2;
    }

    public static ManagersModule_ProvideIdentityManagerFactory create(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new ManagersModule_ProvideIdentityManagerFactory(managersModule, interfaceC2432a, interfaceC2432a2);
    }

    public static QIdentityManager provideIdentityManager(ManagersModule managersModule, QRepository qRepository, QUserInfoService qUserInfoService) {
        QIdentityManager qIdentityManagerProvideIdentityManager = managersModule.provideIdentityManager(qRepository, qUserInfoService);
        AbstractC3230e0.i(qIdentityManagerProvideIdentityManager, "Cannot return null from a non-@Nullable @Provides method");
        return qIdentityManagerProvideIdentityManager;
    }

    @Override // df.InterfaceC2432a
    public QIdentityManager get() {
        return provideIdentityManager(this.module, (QRepository) this.repositoryProvider.get(), (QUserInfoService) this.userInfoServiceProvider.get());
    }
}
