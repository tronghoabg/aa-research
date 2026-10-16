package com.qonversion.android.sdk.internal.di.component;

import Tb.a;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.automations.mvp.ScreenFragment;
import com.qonversion.android.sdk.automations.mvp.ScreenFragment_MembersInjector;
import com.qonversion.android.sdk.automations.mvp.ScreenPresenter;
import com.qonversion.android.sdk.internal.di.module.FragmentModule;
import com.qonversion.android.sdk.internal.di.module.FragmentModule_ProvideScreenProcessorFactory;
import com.qonversion.android.sdk.internal.di.module.FragmentModule_ProvideScreenViewFactory;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class DaggerFragmentComponent implements FragmentComponent {
    private final AppComponent appComponent;
    private InterfaceC2432a provideScreenProcessorProvider;
    private InterfaceC2432a provideScreenViewProvider;

    public static final class Builder {
        private AppComponent appComponent;
        private FragmentModule fragmentModule;

        public /* synthetic */ Builder(int i5) {
            this();
        }

        public Builder appComponent(AppComponent appComponent) {
            appComponent.getClass();
            this.appComponent = appComponent;
            return this;
        }

        public FragmentComponent build() {
            AbstractC3230e0.h(FragmentModule.class, this.fragmentModule);
            AbstractC3230e0.h(AppComponent.class, this.appComponent);
            return new DaggerFragmentComponent(this.fragmentModule, this.appComponent, 0);
        }

        public Builder fragmentModule(FragmentModule fragmentModule) {
            fragmentModule.getClass();
            this.fragmentModule = fragmentModule;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ DaggerFragmentComponent(FragmentModule fragmentModule, AppComponent appComponent, int i5) {
        this(fragmentModule, appComponent);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    private ScreenPresenter getScreenPresenter() {
        QRepository qRepositoryRepository = this.appComponent.repository();
        AbstractC3230e0.i(qRepositoryRepository, "Cannot return null from a non-@Nullable component method");
        return new ScreenPresenter(qRepositoryRepository, (ScreenContract.View) this.provideScreenViewProvider.get());
    }

    private void initialize(FragmentModule fragmentModule, AppComponent appComponent) {
        this.provideScreenViewProvider = a.a(FragmentModule_ProvideScreenViewFactory.create(fragmentModule));
        this.provideScreenProcessorProvider = a.a(FragmentModule_ProvideScreenProcessorFactory.create(fragmentModule));
    }

    private ScreenFragment injectScreenFragment(ScreenFragment screenFragment) {
        QAutomationsManager qAutomationsManagerAutomationsManager = this.appComponent.automationsManager();
        AbstractC3230e0.i(qAutomationsManagerAutomationsManager, "Cannot return null from a non-@Nullable component method");
        ScreenFragment_MembersInjector.injectAutomationsManager(screenFragment, qAutomationsManagerAutomationsManager);
        ScreenFragment_MembersInjector.injectPresenter(screenFragment, getScreenPresenter());
        ScreenFragment_MembersInjector.injectScreenProcessor(screenFragment, (ScreenProcessor) this.provideScreenProcessorProvider.get());
        return screenFragment;
    }

    @Override // com.qonversion.android.sdk.internal.di.component.FragmentComponent
    public void inject(ScreenFragment screenFragment) {
        injectScreenFragment(screenFragment);
    }

    private DaggerFragmentComponent(FragmentModule fragmentModule, AppComponent appComponent) {
        this.appComponent = appComponent;
        initialize(fragmentModule, appComponent);
    }
}
