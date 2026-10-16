package androidx.navigation;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelStoreProvider;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavViewModelStoreProviderKt {
    public static final NavViewModelStoreProvider NavViewModelStoreProvider(ViewModelStore viewModelStore) {
        return new NavViewModelStoreProviderImpl(new ViewModelStoreProvider(viewModelStore, "androidx.navigation.NavControllerViewModel", (Bundle) null, (CreationExtras) null, (ViewModelProvider.Factory) null, 28, (o) null));
    }

    public static /* synthetic */ NavViewModelStoreProvider NavViewModelStoreProvider$default(ViewModelStore viewModelStore, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            viewModelStore = null;
        }
        return NavViewModelStoreProvider(viewModelStore);
    }
}
