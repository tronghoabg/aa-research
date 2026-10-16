package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class FragmentModule_ProvideScreenViewFactory implements InterfaceC2432a {
    private final FragmentModule module;

    public FragmentModule_ProvideScreenViewFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideScreenViewFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideScreenViewFactory(fragmentModule);
    }

    public static ScreenContract.View provideScreenView(FragmentModule fragmentModule) {
        ScreenContract.View view = fragmentModule.getView();
        AbstractC3230e0.i(view, "Cannot return null from a non-@Nullable @Provides method");
        return view;
    }

    @Override // df.InterfaceC2432a
    public ScreenContract.View get() {
        return provideScreenView(this.module);
    }
}
