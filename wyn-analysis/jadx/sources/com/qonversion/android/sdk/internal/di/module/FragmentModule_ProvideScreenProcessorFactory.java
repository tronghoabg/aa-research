package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class FragmentModule_ProvideScreenProcessorFactory implements InterfaceC2432a {
    private final FragmentModule module;

    public FragmentModule_ProvideScreenProcessorFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideScreenProcessorFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideScreenProcessorFactory(fragmentModule);
    }

    public static ScreenProcessor provideScreenProcessor(FragmentModule fragmentModule) {
        ScreenProcessor screenProcessorProvideScreenProcessor = fragmentModule.provideScreenProcessor();
        AbstractC3230e0.i(screenProcessorProvideScreenProcessor, "Cannot return null from a non-@Nullable @Provides method");
        return screenProcessorProvideScreenProcessor;
    }

    @Override // df.InterfaceC2432a
    public ScreenProcessor get() {
        return provideScreenProcessor(this.module);
    }
}
