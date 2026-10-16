package com.qonversion.android.sdk.internal.api;

import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class ApiErrorMapper_Factory implements InterfaceC2432a {
    private final InterfaceC2432a helperProvider;

    public ApiErrorMapper_Factory(InterfaceC2432a interfaceC2432a) {
        this.helperProvider = interfaceC2432a;
    }

    public static ApiErrorMapper_Factory create(InterfaceC2432a interfaceC2432a) {
        return new ApiErrorMapper_Factory(interfaceC2432a);
    }

    public static ApiErrorMapper newInstance(ApiHelper apiHelper) {
        return new ApiErrorMapper(apiHelper);
    }

    @Override // df.InterfaceC2432a
    public ApiErrorMapper get() {
        return new ApiErrorMapper((ApiHelper) this.helperProvider.get());
    }
}
