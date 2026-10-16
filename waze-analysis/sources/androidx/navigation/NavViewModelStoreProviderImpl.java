package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.ViewModelStoreProvider;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class NavViewModelStoreProviderImpl implements NavViewModelStoreProvider {
    private final ViewModelStoreProvider provider;

    public NavViewModelStoreProviderImpl(ViewModelStoreProvider viewModelStoreProvider) {
        x.f(viewModelStoreProvider, "provider");
        this.provider = viewModelStoreProvider;
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public void clear(String str) {
        x.f(str, "key");
        this.provider.clearKey(str);
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public ViewModelStore get(String str) {
        x.f(str, "key");
        return this.provider.getOrCreate(str);
    }

    public String toString() {
        return "NavControllerViewModel(provider=" + this.provider + ")";
    }
}
