package com.qonversion.android.sdk.automations.mvp;

import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class ScreenPresenter_Factory implements InterfaceC2432a {
    private final InterfaceC2432a repositoryProvider;
    private final InterfaceC2432a viewProvider;

    public ScreenPresenter_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.repositoryProvider = interfaceC2432a;
        this.viewProvider = interfaceC2432a2;
    }

    public static ScreenPresenter_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new ScreenPresenter_Factory(interfaceC2432a, interfaceC2432a2);
    }

    public static ScreenPresenter newInstance(QRepository qRepository, ScreenContract.View view) {
        return new ScreenPresenter(qRepository, view);
    }

    @Override // df.InterfaceC2432a
    public ScreenPresenter get() {
        return new ScreenPresenter((QRepository) this.repositoryProvider.get(), (ScreenContract.View) this.viewProvider.get());
    }
}
