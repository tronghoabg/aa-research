package com.qonversion.android.sdk.automations.mvp;

import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class ScreenFragment_MembersInjector implements Sb.a {
    private final InterfaceC2432a automationsManagerProvider;
    private final InterfaceC2432a presenterProvider;
    private final InterfaceC2432a screenProcessorProvider;

    public ScreenFragment_MembersInjector(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.automationsManagerProvider = interfaceC2432a;
        this.presenterProvider = interfaceC2432a2;
        this.screenProcessorProvider = interfaceC2432a3;
    }

    public static Sb.a create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new ScreenFragment_MembersInjector(interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static void injectAutomationsManager(ScreenFragment screenFragment, QAutomationsManager qAutomationsManager) {
        screenFragment.automationsManager = qAutomationsManager;
    }

    public static void injectPresenter(ScreenFragment screenFragment, ScreenPresenter screenPresenter) {
        screenFragment.presenter = screenPresenter;
    }

    public static void injectScreenProcessor(ScreenFragment screenFragment, ScreenProcessor screenProcessor) {
        screenFragment.screenProcessor = screenProcessor;
    }

    public void injectMembers(ScreenFragment screenFragment) {
        injectAutomationsManager(screenFragment, (QAutomationsManager) this.automationsManagerProvider.get());
        injectPresenter(screenFragment, (ScreenPresenter) this.presenterProvider.get());
        injectScreenProcessor(screenFragment, (ScreenProcessor) this.screenProcessorProvider.get());
    }
}
