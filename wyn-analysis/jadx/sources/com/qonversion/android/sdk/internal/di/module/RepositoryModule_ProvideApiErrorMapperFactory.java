package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideApiErrorMapperFactory implements InterfaceC2432a {
    private final InterfaceC2432a apiHelperProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideApiErrorMapperFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        this.module = repositoryModule;
        this.apiHelperProvider = interfaceC2432a;
    }

    public static RepositoryModule_ProvideApiErrorMapperFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        return new RepositoryModule_ProvideApiErrorMapperFactory(repositoryModule, interfaceC2432a);
    }

    public static ApiErrorMapper provideApiErrorMapper(RepositoryModule repositoryModule, ApiHelper apiHelper) {
        ApiErrorMapper apiErrorMapperProvideApiErrorMapper = repositoryModule.provideApiErrorMapper(apiHelper);
        AbstractC3230e0.i(apiErrorMapperProvideApiErrorMapper, "Cannot return null from a non-@Nullable @Provides method");
        return apiErrorMapperProvideApiErrorMapper;
    }

    @Override // df.InterfaceC2432a
    public ApiErrorMapper get() {
        return provideApiErrorMapper(this.module, (ApiHelper) this.apiHelperProvider.get());
    }
}
